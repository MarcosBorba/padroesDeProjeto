/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraMultiplaAdapter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author marcos
 */
public class Calculadora implements Initializable {

    @FXML
    private Label msg;
    @FXML
    private Label msg2;
    private String clickBotao;
    private boolean temOperador = false;
    private boolean temNumero = false;
    private boolean temPonto = false;
    private String total;
    private boolean igualRecente = false;
    private boolean pontoRecente = false;
    private Conversor adapterMaster;
    @FXML
    private Label msg3;

    @FXML
    private Label msg4;

    @FXML
    private Label msg5;

    @FXML
    public void mudarResultadoBinario() throws ScriptException {
        adapterMaster = new ResultadoBinario();
        msg3.setText(adapterMaster.converteResultado((msg.getText())));
    }

    @FXML
    public void mudarResultadoHexadecimal() throws ScriptException {
        adapterMaster = new ResultadoHexadecimal();
        msg4.setText(adapterMaster.converteResultado((msg.getText())));
    }

    @FXML
    public void mudarResultadoOctal() throws ScriptException {
        adapterMaster = new ResultadoOctal();
        msg5.setText(adapterMaster.converteResultado((msg.getText())));
    }

    @FXML
    private boolean operadores(ActionEvent event) throws ScriptException {
        clickBotao = ((Button) event.getSource()).getText();

        if ("+".equals(clickBotao) || "-".equals(clickBotao) || "*".equals(clickBotao) || "/".equals(clickBotao)) {
            if (!temNumero && temOperador) {
                msg2.setText(msg2.getText().substring(0, msg2.getText().length() - 1) + clickBotao);
                return true;
            } else if (temNumero) {
                if (!temOperador) {
                    msg2.setText(msg2.getText() + msg.getText() + clickBotao);
                    msg.setText("");
                    temOperador = true;
                    temNumero = false;
                    pontoRecente = false;
                    temPonto = false;
                    return true;
                }
            }
        }
        return true;
    }

    @FXML
    private boolean finaliza(ActionEvent event) throws ScriptException {
        clickBotao = ((Button) event.getSource()).getText();
        total = msg2.getText() + msg.getText();
        if ("".equals(total)) {
            return false;
        } else if ("+".equals(total.substring(total.length() - 1)) || "-".equals(total.substring(total.length() - 1)) || "*".equals(total.substring(total.length() - 1)) || "/".equals(total.substring(total.length() - 1))) {
            total = msg2.getText().substring(0, msg2.getText().length() - 1);
            calcular(total);
            System.out.println("");
        } else {
            calcular(total);
        }
        temNumero = true;
        temOperador = false;
        igualRecente = true;
        return true;
    }

    @FXML
    private boolean C(ActionEvent event) throws ScriptException {
        clickBotao = ((Button) event.getSource()).getText();
        msg.setText("");
        msg2.setText("");
        temNumero = false;
        temOperador = false;
        pontoRecente = false;
        temPonto = false;
        return true;
    }

    @FXML
    private boolean CE(ActionEvent event) throws ScriptException {
        clickBotao = ((Button) event.getSource()).getText();
        msg.setText("");
        temNumero = false;
        temOperador = true;
        pontoRecente = false;
        temPonto = false;
        return true;
    }

    @FXML
    private boolean adicionarPonto(ActionEvent event) throws ScriptException {
        clickBotao = ((Button) event.getSource()).getText();
        if (!temPonto && temNumero && !temOperador) {
            msg.setText(msg.getText() + clickBotao);
            temNumero = false;
            temOperador = false;
            pontoRecente = true;
            temPonto = true;
            return true;
        } else {
            return false;
        }
    }

    @FXML
    private boolean trocaSinal(ActionEvent event) throws ScriptException {
        clickBotao = ((Button) event.getSource()).getText();
        if ("".equals(msg.getText())) {
            return true;
        } else if (".".equals(msg.getText().substring(msg.getText().length() - 1, msg.getText().length()))) {
            return false;
        } else if (!"(".equals(msg.getText().substring(0, 1))) {
            msg.setText("(-" + msg.getText() + ")");
        } else if ("(".equals(msg.getText().substring(0, 1))) {
            msg.setText(msg.getText().substring(2, msg.getText().length() - 1));
        }
        return true;
    }

    @FXML
    private boolean addNumeros(ActionEvent event) throws ScriptException {
        clickBotao = ((Button) event.getSource()).getText();
        if (igualRecente) {
            msg.setText(clickBotao);
            temNumero = true;
            temOperador = false;
            igualRecente = false;
            return true;

        } else if (temNumero && ")".equals(msg.getText().substring(msg.getText().length()-1,msg.getText().length()))) {
            return false;
        } else if (pontoRecente) {
            msg.setText(msg.getText() + clickBotao);
            temNumero = true;
            temOperador = false;
            pontoRecente = false;
            return true;
        } else {
            msg.setText(msg.getText() + clickBotao);
            temNumero = true;
            temOperador = false;
            return true;
        }
    }

    public void calcular(String msgem) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager(); //permite que você execute declarações em linguagem diferente.
        ScriptEngine engine = mgr.getEngineByName("JavaScript"); //fornece funcionalidade básica de script.
        String formula = msgem;
        Object eval = engine.eval(formula);
        msg.setText(eval.toString());
        msg2.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
