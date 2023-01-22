/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author vrushil
 */
public class tables { 
    public static void main(String[] args) throws Exception{
        try{
            String userTable = "create table user(id int AUTO_INCREMENT primary key, name varchar(200),usn varchar(10), mobileNumber varchar(10), department varchar(3), semester varchar(5), password varchar(200), status varchar(200), UNIQUE (usn) )";
            String adminDetails = "insert into user(name, usn, mobileNumber, department, semester, password, status) values('Vrushil', '1NH20CS251', '7406907476', 'CSE', '4', 'Vru!2**2', 'true')";
            String categoryTable = "create table category (id int AUTO_INCREMENT primary key, name varchar(200))";
            String productTable = "create table product (id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200), price varchar(200))";
            String billTable = "create table bill (id int primary key, name varchar(200), mobileNumber varchar(10), usn varchar(10), date varchar(50), total varchar(200), createdBy varchar(200))";
//            DbOperations.setDataOrDelete(userTable, "User Table Created Succesfully");
//            DbOperations.setDataOrDelete(adminDetails, "Admin Details Added Succesfully");
//            DbOperations.setDataOrDelete(categoryTable, "Category Table Created Succesfully");
//            DbOperations.setDataOrDelete(productTable, "Product Table Created Succesfully");
            DbOperations.setDataOrDelete(billTable, "Bill Table Created Succesfully");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
