/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author vrushil
 */
public class UserDao {

    public static void save(User user) {
        String query = "insert into user(name, usn, mobileNumber, department, semester, password, status) values('" + user.getName() + "','" + user.getUsn() + "', '" + user.getMobileNumber() + "', '" + user.getDepartment() + "','" + user.getSemester() + "', '" + user.getPassword() + "','false')";
        DbOperations.setDataOrDelete(query, "Registered Successfully! Wait for Admin Approval!");
    }

    public static User login(String usn, String password) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("select *from user where usn='" + usn + "' and password='" + password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static ArrayList<User> getAllRecords(String usn) {
        ArrayList<User> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from user where usn like '%" + usn + "%'");
        
        while (rs.next()){
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setUsn(rs.getString("usn"));
            user.setMobileNumber(rs.getString("mobileNumber"));
            user.setStatus(rs.getString("status"));
            arrayList.add(user);
        }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;

    }
    
    public static void changeStatus(String usn, String status){
        String query = "update user set status='"+status+"' where usn ='"+usn+"'";
        DbOperations.setDataOrDelete(query, "Status Changed Syccessfully");
    }
}
