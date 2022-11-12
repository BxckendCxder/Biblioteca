package tests;

import domain.Credenciales;
import javax.swing.JOptionPane;

public class testAdminLogin {
    public static void no(String[] args) {
        String dbUser = JOptionPane.showInputDialog("Ingrese el usuario de la DB: ");
        String dbPass = JOptionPane.showInputDialog("Ingrese la contraseña de la DB: ");
        String user = JOptionPane.showInputDialog("ingrese su usuario: ");
        String pass = JOptionPane.showInputDialog("Ingrese su contraseña: ");
        System.out.println(Credenciales.buscarAdmin(user, pass, dbUser, dbPass));
    }
    
}
