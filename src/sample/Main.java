package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent w1 = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        Scene s1 = new Scene(w1, 200, 200);
        primaryStage.setScene(s1);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
