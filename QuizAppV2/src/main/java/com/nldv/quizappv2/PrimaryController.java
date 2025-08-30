package com.nldv.quizappv2;

import com.nldv.ultis.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class PrimaryController {

     public void handleQuestionManagement(ActionEvent event) throws IOException{ 
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("question.fxml")).load()); //moi san khau chi co 1 canh dien 
        Stage stage = new Stage(); // tao doi tuong stage
        stage.setScene(scene);
        stage.setTitle("Quản lý câu hỏi"); 
        stage.show();
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
