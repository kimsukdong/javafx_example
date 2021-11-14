package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Pizza.fxml"));
			Scene scene = new Scene(root,500,650);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Image img = new Image("C:\\wk\\java5\\javafx_ex3\\src\\application\\pizza_hut.png");
			primaryStage.getIcons().add(img);
			primaryStage.setScene(scene);
			primaryStage.setTitle("피자 주문");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
