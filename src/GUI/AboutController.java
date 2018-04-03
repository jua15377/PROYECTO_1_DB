package GUI;

/*
 * Class that controlls all actions os the aboutController.fxml file.
 * @author  Jonnathan Juarez
 * @version 1.0
 * @since   2018-03-28
 */

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class AboutController {

    @FXML Hyperlink link;

    /**
     * Creates a Hyperlink to display the project github repository.
     */
    public void hiperLink(){
        if(Desktop.isDesktopSupported())
        {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/jua15377/PROYECTO_1_DB.git"));
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (URISyntaxException e1) {
                e1.printStackTrace();
            }
        }
    }
}
