package calculator;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public final class controller implements Initializable {

    public void initialize(URL url, ResourceBundle rb) { }

    private BigDecimal first;
    private String operator;
    private boolean input;

    static BigDecimal calculate(String operator, BigDecimal first, BigDecimal last) {
        switch (operator) {
            case "+":
                return first.add(last);
            case "-":
                return first.subtract(last);
            case "x":
                return first.multiply(last);
            case "/":
                return first.divide(last);
        }
        return last;
    }

    @FXML
    private TextField display;

    public void operateButton(ActionEvent evt){
        Button button = (Button)evt.getSource();
        String buttonValue = button.getText();

        if (buttonValue.equals("C")) {
            first = BigDecimal.valueOf(0);
            display.setText("0");
            input = false;
            return;
        }
        if (buttonValue.equals("=")) {
            final BigDecimal right = input ? new BigDecimal(display.getText()) : first;
            first = calculate(operator, first, right);
            display.setText(first.toString());
            return;
        }
        if (buttonValue.matches("[0-9]")) {
            if (!input) {
                input = true;
                display.clear();
            }
            display.appendText(buttonValue);
            return;
        }
        if (buttonValue.matches("[+-x/]")) {
            first = new BigDecimal(display.getText());
            operator = buttonValue;
            input = false;
            return;
        }
    }
}