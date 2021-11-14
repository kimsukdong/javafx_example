package application;

import java.text.NumberFormat;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class PizzaMenuController {

	String p_type,p_size;
	int p1,p2,p3;

	@FXML    private ComboBox<String> comboBox;
	@FXML    private CheckBox ch1;
	@FXML    private CheckBox ch2;
	@FXML    private Button b1;
	@FXML    private Button b2;
	@FXML    private TextArea ta; 
	@FXML    private Label lab;

	ObservableList<String> comboBoxList = 
			FXCollections.observableArrayList("페페로니 피자: 12,000원","포테이토 피자: 15,000원","불고기 피자: 18,000원","콤보 피자: 20,000원");

	String sel1 = "";
	String sel2 = "";
	String sel3 = "";

	int num1=0;
	int num2=0;
	int num3=0;

	public void initialize() {	
		comboBox.setValue("피자 선택");
		comboBox.setItems(comboBoxList);	
	}

	@FXML
	void onClickbombo(ActionEvent event) {
		String sel = comboBox.getValue() ;
		p_type = sel;
		int a = comboBox.getSelectionModel().getSelectedIndex(); 
		ta.appendText(sel+"를 선택 \n");

		if(a==0)
			num1 += 12000;
		else 	if(a==1)
			num1 += 15000;
		else 	if(a==2)
			num1 += 18000;
		else 	if(a==3)
			num1 += 20000;

		sel1+=sel +"\n";
	}

	@FXML
	void onClickb1(ActionEvent event) {
		Integer number = num1+num2+num3;
		NumberFormat numberFormatter;
		numberFormatter = NumberFormat.getNumberInstance();
		String quantityOut = numberFormatter.format(number);

		ta.setText("주문 내역");
		ta.appendText("\n\n"+ sel1 + sel3 +sel2+"\n");
		ta.appendText("\n total = "+ quantityOut +"원 입니다.\n");
		lab.setText(quantityOut);
		p1=0;
		p2=0;
		p3=0;

		if(ch1.isSelected())
			p1=1;
		else 
			p1=0;
		if(ch2.isSelected())
			p2=1;
		else 
			p2=0;

	}

	@FXML
	void onClickb2(ActionEvent event) {

		if(ch1.isSelected())
			ch1.fire();
		if(ch2.isSelected())
			ch2.fire();

		sel1="";
		sel2="";
		sel3="";

		num1=0;
		num2=0;
		num3=0;

		comboBox.setValue("피자 선택");
		ta.setText(""); 

	}

	@FXML
	void onClickch1(ActionEvent event) {
		if(ch1.isSelected()) {
			ta.appendText(ch1.getText()+" 선택 \n");
			num2+=2000;
			sel2+=ch1.getText()+"\n";
		}
		if(ch1.isSelected()== false) {
			ta.appendText(ch1.getText()+" 취소 \n");
			num2-=2000;
			sel2+=ch1.getText()+" 취소\n";
		}
	}

	@FXML
	void onClickch2(ActionEvent event) {
		if(ch2.isSelected()) {
			ta.appendText(ch2.getText()+" 선택 \n");
			num2+=1000;
			sel2+=ch2.getText()+"\n";
		}
		if(ch2.isSelected()== false) {
			ta.appendText(ch2.getText()+" 취소 \n");
			num2-=1000;
			sel2+=ch2.getText()+" 취소\n";
		}
	}


}

