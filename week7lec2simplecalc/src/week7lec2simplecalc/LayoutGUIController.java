package week7lec2simplecalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LayoutGUIController {
    private String crrntArthOpt="ADD";
    int swtch = 0;

    @FXML
    private Label result;
    @FXML
    private TextField op2;
    @FXML
    private TextField op1;
    @FXML
    private Button equalBtn;
    @FXML
    private Button addBtn;
    @FXML
    private Button multiBtn;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button subBtn;
    @FXML
    private Button dvdBtn;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn0;
    @FXML
    private Button resetBtn;
    @FXML
    private Button dotBtn;
    
    @FXML
    void addNum(ActionEvent event) {
        crrntArthOpt="ADD";
        swtch = 1;
    }

    @FXML
    void multiNum(ActionEvent event) {
        crrntArthOpt="MULTI";
        swtch = 1;
    }
    
    @FXML
    private void subNum(ActionEvent event) {
        crrntArthOpt="SUB";
        swtch = 1;
    }

    @FXML
    private void dvdNum(ActionEvent event) {
        crrntArthOpt="DVD";
        swtch = 1;
    }
    
    @FXML
    void processOp(ActionEvent event) {
        String oper1 = op1.getText();
        String oper2 = op2.getText();
        if(oper2.equals(""))
            oper2 = "0";
        double num1 = Double.parseDouble(oper1);
        double num2 = Double.parseDouble(oper2);
        
        if(crrntArthOpt.equals("ADD"))
        {
            result.setText("" + (num1 + num2));
            result.setOpacity(1);
        }
        else if (crrntArthOpt.equals("MULTI"))
        {
            result.setText("" + (num1 * num2));
            result.setOpacity(1);
        }
        else if (crrntArthOpt.equals("DVD"))
        {
            result.setText("" + (num1 / num2));
            result.setOpacity(1);
        }
        else if (crrntArthOpt.equals("SUB"))
        {
            result.setText("" + (num1 - num2));
            result.setOpacity(1);
        }
        
        // easter eggs
        if(num1 == 01134.0 && num2 == 0) // hello code
            result.setText("Hello ;)"); 
        if(num1 == 143 && num2 == 0) // beeper "143" code
            result.setText("I love you");
    }

    @FXML
    private void processNums(ActionEvent event) {
        if( ((Button)event.getSource() ).getText().equals("0") )
        {
            if(swtch == 0)
                op1.setText(op1.getText()+"0");
            if(swtch == 1)
                op2.setText(op2.getText()+"0");
        }
        if( ((Button)event.getSource() ).getText().equals("1") )
        {
            if(swtch == 0)
                op1.setText(op1.getText()+"1");
            if(swtch == 1)
                op2.setText(op2.getText()+"1");
        }
        if( ((Button)event.getSource() ).getText().equals("2") )
        {
            if(swtch == 0)
                op1.setText(op1.getText()+"2");
            if(swtch == 1)
                op2.setText(op2.getText()+"2");
        }
        if( ((Button)event.getSource() ).getText().equals("3") )
        {
            if(swtch == 0)
                op1.setText(op1.getText()+"3");
            if(swtch == 1)
                op2.setText(op2.getText()+"3");
        }
        if( ((Button)event.getSource() ).getText().equals("4") )
        {
            if(swtch == 0)
                op1.setText(op1.getText()+"4");
            if(swtch == 1)
                op2.setText(op2.getText()+"4");
        }
        if( ((Button)event.getSource() ).getText().equals("5") )
        {
            if(swtch == 0)
                op1.setText(op1.getText()+"5");
            if(swtch == 1)
                op2.setText(op2.getText()+"5");
        }
        if( ((Button)event.getSource() ).getText().equals("6") )
        {
            if(swtch == 0)
                op1.setText(op1.getText()+"6");
            if(swtch == 1)
                op2.setText(op2.getText()+"6");
        }
        if( ((Button)event.getSource() ).getText().equals("7") )
        {
            if(swtch == 0)
                op1.setText(op1.getText()+"7");
            if(swtch == 1)
                op2.setText(op2.getText()+"7");
        }
        if( ((Button)event.getSource() ).getText().equals("8") )
        {
            if(swtch == 0)
                op1.setText(op1.getText()+"8");
            if(swtch == 1)
                op2.setText(op2.getText()+"8");
        }
        if( ((Button)event.getSource() ).getText().equals("9") )
        {
            if(swtch == 0)
                op1.setText(op1.getText()+"9");
            if(swtch == 1)
                op2.setText(op2.getText()+"9");
        }
        if( ((Button)event.getSource() ).getText().equals(".") )
        {
            if(swtch == 0)
                op1.setText(op1.getText()+".");
            if(swtch == 1)
                op2.setText(op2.getText()+".");
        }
    }

    @FXML
    private void resetInput(ActionEvent event) {
        crrntArthOpt="ADD";
        swtch = 0;
        result.setOpacity(0);
        op1.setText("");
        op2.setText("");
    }

}
