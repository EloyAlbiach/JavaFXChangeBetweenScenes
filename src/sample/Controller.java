package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    public void changeScene(ActionEvent event) throws IOException {
        // Obtenim l'objecte que ha generat l'esdeveniment
        //
        Node node = (Node) event.getSource();
        // Obtenim l'stage on es troba aquest objecte
        Stage stage = (Stage) node.getScene().getWindow();

        // segons el botó, carrega un scene o un altre, on cada scene té associat un fxml
        if (event.getSource() == btn1){
            Parent w1 = FXMLLoader.load(getClass().getResource("scene2.fxml"));
            Scene s = new Scene(w1, 200, 200);
            stage.setScene(s);
        }
        if (event.getSource() == btn2) {
            Parent w2 = FXMLLoader.load(getClass().getResource("scene1.fxml"));
            Scene s = new Scene(w2, 200, 200);
            stage.setScene(s);
        }

    }
}
