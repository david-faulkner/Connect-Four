package javaconnectfour;

import javafx.application.Application;
//import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaConnectFour extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ConnectFourFXML.fxml"));
        stage.setTitle("Connect Four Project");
        stage.setScene(new Scene(root));
        stage.show();
    }

}
