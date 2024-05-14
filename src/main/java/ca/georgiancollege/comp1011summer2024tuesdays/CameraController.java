package ca.georgiancollege.comp1011summer2024tuesdays;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CameraController {

    @FXML
    private TextField color, lens, make, model, sensor;

    @FXML
    private Label error, output;

    @FXML
    void onSubmit(ActionEvent event) {

        model.getText(); // gets the text inputted by the user in the TextField
        error.getText();
        //error.setText("something");

        /*
Add the code to the Controller
    evaluated each TextField
        determine that each TextField has a length() of at least 1
            if not, send an error message to the error label
            if so, instantiate a new Camera object and pass the values of the TextFields

         */
        try {
            Camera camera = new Camera(model.getText(), make.getText(),
                    color.getText(), sensor.getText(), lens.getText());
        }
        catch (IllegalArgumentException e){

            error.setText(e.getMessage());
        }

    }

    public void initialize(){

        //runs right before the Stage is shown

        output.setText("");
        error.setText("");

    }

}