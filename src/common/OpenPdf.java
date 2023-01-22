/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.awt.Desktop;
import javax.swing.JOptionPane;
import java.io.File;

/**
 *
 * @author vrushil
 */
public class OpenPdf {
    public static void openById(String id){
        try{
            Desktop desktop = Desktop.getDesktop();
        if (desktop.isSupported(Desktop.Action.OPEN)) {
            desktop.open(new File("/Users/vrushil/Desktop/Catering_Mgnt_Sys/src/smart/canteen/Bills/"+id+".pdf"));
            }
            else
                JOptionPane.showMessageDialog(null, "File does not exist");
        } 
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
