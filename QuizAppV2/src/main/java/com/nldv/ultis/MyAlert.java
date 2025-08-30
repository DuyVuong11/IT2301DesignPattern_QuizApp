/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nldv.ultis;

import javafx.scene.control.Alert;

/**
 *
 * @author DUYVUONG
 */
public class MyAlert { // Singleton cho thong bao
    private static MyAlert instance; 
    private final Alert alert; 
    
    private MyAlert() {
        this.alert = new Alert(Alert.AlertType.INFORMATION); 
        this.alert.setHeaderText("Quiz app");
        
    }
    
    public static MyAlert getInstance(){ 
        if(instance == null){ 
            instance = new MyAlert();
        }
        return instance; 
    }
    
    public void showMsg(String msg){ 
        this.alert.setContentText(msg);
        this.alert.showAndWait();
    }
    
}
