package GUI;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

public class fontSizeController implements Initializable{
    @FXML public Slider slider = new Slider();
    @FXML public TextField field = new TextField();
    @FXML public Button button = new Button();
    private static final int fontSize = 14;
    private int fontz = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        slider.setMin(10);
        slider.setMax(100);
        slider.valueProperty().addListener((obs, oldval, newVal) ->
                slider.setValue(newVal.intValue()));
        field.setText(Integer.toString(fontSize));
        field.textProperty().bindBidirectional(slider.valueProperty(), NumberFormat.getNumberInstance());
    }

    public void doneButton(){
        int f = Integer.parseInt(field.getText());
        if(f<10 || f>100){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Wrong size value");
            alert.setContentText("Please, enter a value in between 10 and 100!");
            alert.showAndWait();
        }else {
            setFz(f);
        }
        Stage stage = (Stage) button.getScene().getWindow();
        stage.close();
    }

    public int getFz() {
        return fontz;
    }

    public void setFz(int fz) {
        this.fontz = fz;
    }
}
