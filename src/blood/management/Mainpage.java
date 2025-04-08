package blood.management;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Mainpage implements Initializable {

    @FXML
    private BorderPane rootLayout;

    @FXML
    private AnchorPane mainContent;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadUI("AddbloodSence.fxml"); // Default scene
    }

    @FXML
    private void addDonor(ActionEvent event) {
        loadUI("AddbloodSence.fxml");
    }

    @FXML
    private void setBloodRecipient(ActionEvent event) {
        loadUI("bloodRecieversence.fxml");
    }

    @FXML
    private void setDoctor(ActionEvent event) {
        loadUI("Doctor.fxml");
    }

    @FXML
    private void setStaff(ActionEvent event) {
        loadUI("Employee.fxml"); // Staff uses Employee.fxml
    }

    @FXML
    private void setAvailableScene(ActionEvent event) {
        loadUI("AvailableSence.fxml");
    }

    private void loadUI(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            AnchorPane pane = loader.load();
            mainContent.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
