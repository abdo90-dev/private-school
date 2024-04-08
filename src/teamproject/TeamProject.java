/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teamproject;

import java.awt.HeadlessException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author abdelak
 */
public class TeamProject {

      Connection con = null;
    public static Connection connected(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:school.sqlite");
            System.out.println("connected");
            return con;
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
                
            return null;
        }
        
    }
    public static void main(String[] args) {
        TeamProject.connected();
    }
}
