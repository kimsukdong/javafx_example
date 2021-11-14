package application;

import javax.swing.ImageIcon;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SampleController {
	Image apple,banana,mango,pear,fruits;
	String type;

    @FXML
    private ComboBox<String> combo;

	ObservableList<String> comboList = 
			FXCollections.observableArrayList("Apple","Banana","Pear","Mango");
	
	public void initialize() {	
		apple = new Image("C:\\wk\\java5\\javafx_ex1\\src\\images\\apple.jpg");
		banana = new Image("C:\\wk\\java5\\javafx_ex1\\src\\images\\banana.jpg");
		mango = new Image("C:\\wk\\java5\\javafx_ex1\\src\\images\\mango.jpg");
		pear = new Image("C:\\wk\\java5\\javafx_ex1\\src\\images\\pear.jpg");
		fruits = new Image("C:\\wk\\java5\\javafx_ex1\\src\\images\\fruits.jpg");
		combo.setValue("과일 선택");
		combo.setItems(comboList);
		image.setImage(fruits);
	}

    @FXML
    private CheckBox ch1;

    @FXML
    private CheckBox ch2;

    @FXML
    private CheckBox ch3;

    @FXML
    private CheckBox ch4;
    
    @FXML
    private ImageView image;

    @FXML
    void onClickCheck1(ActionEvent event) {
    	
		if(ch1.isSelected()) {
			image.setImage(apple);
		}
		if(ch1.isSelected()== false) {
			image.setImage(fruits);
		}
    	
    }

    @FXML
    void onClickCheck2(ActionEvent event) {
		if(ch2.isSelected()) {
			image.setImage(banana);
		}
		if(ch2.isSelected()== false) {
			image.setImage(fruits);
		}
    }

    @FXML
    void onClickCheck3(ActionEvent event) { 
		if(ch3.isSelected()) {
			image.setImage(pear);
		}
		if(!ch3.isSelected()) {
			image.setImage(fruits);
		}
    }

    @FXML
    void onClickCheck4(ActionEvent event) {
		if(ch4.isSelected()) {
			image.setImage(mango);
		}
		if(ch4.isSelected()== false) {
			image.setImage(fruits);
		}
    }

    @FXML
    void onClickCombo(ActionEvent event) {

		int a = combo.getSelectionModel().getSelectedIndex(); 
		
		if(a==0) image.setImage(apple);
		else if(a==1) image.setImage(banana);
		else if(a==2) image.setImage(pear);
		else if(a==3) image.setImage(mango);		
    }

}
