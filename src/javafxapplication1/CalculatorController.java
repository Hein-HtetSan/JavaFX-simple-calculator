/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class CalculatorController implements Initializable {

    @FXML
    private TextField txt1;
    @FXML
    private TextField txt2;
    @FXML
    private Label lbl1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void addBtn(ActionEvent event) {
        String num1_Str = txt1.getText();
        String num2_Str = txt2.getText();
        
        int num1 = Integer.parseInt(num1_Str);
    }

    @FXML
    private void operation(ActionEvent event) {
        Button btn = (Button)event.getSource();
        String sign = btn.getText();
        String num1_Str = txt1.getText();
        String num2_Str = txt2.getText();
        int num1 = Integer.parseInt(num1_Str);
        int num2 = Integer.parseInt(num2_Str);
        int result = 0;
        if(sign.equals("+")){
            result = num1 + num2;
        }else if(sign.equals("-")){
            result = num1 - num2;
        }else if(sign.equals("*")){
            result = num1 * num2;
        }else{
            result = num1 / num2;
        }
        String lbl_string = String.valueOf(result);
        lbl1.setText(lbl_string);
    }

    
}
