package com.mycompany.ntsoanee;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Label;

public class PrimaryController {
 

    @FXML
    private ProgressBar progressbar;

    @FXML
    private Button increase;

    @FXML
    private Button decrease;
    @FXML
    private Label myLable;
    double progress;
        @FXML
    void increasebtn(ActionEvent event) {
      progress += 0.01;
      progressbar.setProgress(progress);
      
      
    }

    @FXML
    void decreasebtn(ActionEvent event) {
        progress  -= 0.01;
        progressbar.setProgress(progress);
        
    }

}
 
  
    

