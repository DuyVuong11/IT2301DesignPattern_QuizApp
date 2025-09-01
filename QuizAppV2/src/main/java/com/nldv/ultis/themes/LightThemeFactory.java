/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nldv.ultis.themes;

import com.nldv.quizappv2.App;

/**
 *
 * @author DUYVUONG
 */
public class LightThemeFactory implements ThemeFactory{

    @Override
    public String getStyleSheet() {
        return App.class.getResource("light.css").toExternalForm();
    }
    
}
