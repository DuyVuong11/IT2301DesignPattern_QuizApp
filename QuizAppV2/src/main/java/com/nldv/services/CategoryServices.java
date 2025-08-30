/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nldv.services;

import com.nldv.pojo.Category;
import com.nldv.ultis.JdbcConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUYVUONG
 */
public class CategoryServices {

    public List<Category> getCates() throws SQLException {
        //Mo ket noi
        Connection conn = JdbcConnector.getInstance().connect();
        //Truy van
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM category");

        List<Category> cates = new ArrayList<>();
        while (rs.next()) {
            int idx = rs.getInt("id");
            String name = rs.getString("name");

            Category c = new Category(idx, name);
            cates.add(c);

        }
        
        return cates;

    }
}
