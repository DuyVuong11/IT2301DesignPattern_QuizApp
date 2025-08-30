package com.nldv.quizappv2;

import com.nldv.ultis.MyAlert;
import com.nldv.ultis.MyStage;
import com.nldv.ultis.themes.Theme;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;


public class PrimaryController implements Initializable{
    @FXML ComboBox<Theme> cbThemes; 

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(Theme.values()));
    }
    
    public void handleChangeThemes(ActionEvent envent){ 
        switch(this.cbThemes.getSelectionModel().getSelectedItem()){ 
            case DARK:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();  
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("dark.css").toExternalForm());  
                break; 
            case LIGHT: 
                this.cbThemes.getScene().getRoot().getStylesheets().clear();  
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("light.css").toExternalForm());
                break; 
            default: 
                this.cbThemes.getScene().getRoot().getStylesheets().clear();  
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("styles.css").toExternalForm());
                break; 
        }
    }
    
     public void handleQuestionManagement(ActionEvent event) throws IOException{ 
         MyStage.getInstance().showStage("question.fxml");
     }
     
     public void handleQuestionPractice(ActionEvent event){ 
        MyAlert.getInstance().showMsg("Coming soon...");
     }
     
     public void handleQuestionExam(ActionEvent event){ 
        MyAlert.getInstance().showMsg("Coming soon...");
     }
     
     public void handleSignIn(ActionEvent event){ 
        MyAlert.getInstance().showMsg("Coming soon...");
     }
     
     public void handleLogIn(ActionEvent event){ 
        MyAlert.getInstance().showMsg("Coming soon...");
     }

    private Parent loadFXML(String primary) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
