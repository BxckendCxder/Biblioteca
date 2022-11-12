package tests;
import domain.Credenciales;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class testEstudiantesLogin {
    static final Logger LogJava = Logger.getLogger(testEstudiantesLogin.class);

    public static void main(String[] args) {
        LogJava.info("LOG INFO PRUEBA");
        System.out.println("Comprobar usuario");
        String dbUser = JOptionPane.showInputDialog("Ingrese el usuario de la DB: ");
        String dbPass = JOptionPane.showInputDialog("Ingrese la contraseña de la DB: ");
        String user = JOptionPane.showInputDialog("ingrese su usuario: ");
        String pass = JOptionPane.showInputDialog("Ingrese su contraseña: ");
        System.out.println(Credenciales.buscarEstudiante(user, pass, dbUser, dbPass));
        
    }
    
}
