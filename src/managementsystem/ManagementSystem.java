
package managementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class ManagementSystem extends Application  {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("gui/Login.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Mangement");
        stage.setScene(scene);
        stage.show();
        
       
       
    } 
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
