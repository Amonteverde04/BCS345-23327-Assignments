package week9assignment;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Week9Assignment extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
   @Override
   public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("LayoutGUI.fxml"));
    primaryStage.setTitle("Angler");
    primaryStage.setScene( new Scene(root));
    primaryStage.show();
  }  
}
