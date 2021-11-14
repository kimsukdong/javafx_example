package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SampleController {
	int x ,y;
    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private TextField txt3;
    
    void getxy() {
    	x = Integer.parseInt(txt1.getText());
    	y = Integer.parseInt(txt2.getText());
    }

    @FXML
    void onClickAdd(ActionEvent event) {
    	getxy();
    	int z = x+y;
    	txt3.setText(x+ " + " + y + " = " + z);
    }

    @FXML
    void onClickDivide(ActionEvent event) {
    	getxy();
    	int z = x/y;
    	txt3.setText(x+ " / " + y + " = " + z);
    }

    @FXML
    void onClickMinus(ActionEvent event) {
    	getxy();
    	int z = x-y;
    	txt3.setText(x+ " - " + y + " = " + z);
    }

    @FXML
    void onClickMultiply(ActionEvent event) {
    	getxy();
    	int z = x*y;
    	txt3.setText(x+ " * " + y + " = " + z);
    }

}
