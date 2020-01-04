import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;


import javax.swing.JOptionPane;


public class properties {
	
	static Properties config = new Properties();
    static InputStream configInput = null;
    static OutputStream configoutput = null;
    public void loadConfig(){
        try{
            configInput = new FileInputStream("C://entradas/config.properties.txt");
            config.load(configInput);
            System.out.println(config.getProperty("pagina"));
            System.out.println(config.getProperty("look_and_feel"));
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error cargando configuración\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void setPropertyValue(String property, String value){
        try{
            configoutput = new FileOutputStream("data/config.properties");
            config.setProperty(property, value);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error guardando configuración\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[]args) {
    	properties properties = new properties();
    	properties.loadConfig();
    }
    

}
