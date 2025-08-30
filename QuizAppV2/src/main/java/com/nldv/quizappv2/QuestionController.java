/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.nldv.quizappv2;

import com.nldv.pojo.Category;
import com.nldv.services.CategoryServices;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author DUYVUONG
 */
public class QuestionController implements Initializable {

    @FXML
    private ComboBox<Category> cbCates;

    private static final CategoryServices cateServices = new CategoryServices();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {

            this.cbCates.setItems(FXCollections.observableList(cateServices.getCates()));
        } catch (SQLException ex) {
            System.getLogger(QuestionController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

}
