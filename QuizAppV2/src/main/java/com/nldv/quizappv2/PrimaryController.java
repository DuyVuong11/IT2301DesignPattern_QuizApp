package com.nldv.quizappv2;

import com.nldv.ultis.MyAlert;
import com.nldv.ultis.MyStage;
import com.nldv.ultis.themes.DarkThemeFactory;
import com.nldv.ultis.themes.DefaultThemeFactory;
import com.nldv.ultis.themes.LightThemeFactory;
import com.nldv.ultis.themes.Theme;
import com.nldv.ultis.themes.ThemeManager;
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
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
    }
    
     public void handleQuestionManagement(ActionEvent event) throws IOException{ 
         MyStage.getInstance().showStage("question.fxml"); // Singleton
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
