package utilitarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Miguel Angel Meca Pacherres <miguelmeca01@gmail.com>
 */
public class ReadProperties {
    
    private static ReadProperties instancia = null;
    private Properties archivoPropiedades;
    
    private ReadProperties() {
        archivoPropiedades = new Properties();
        try{
            String directoryFile = System.getProperty("user.dir") + "\\configuracion.properties";
            archivoPropiedades.load(new FileInputStream(new File(directoryFile)));
        }catch(IOException ex){
            System.out.println("Ocurrio un error al leer el archivo properties de configuracion: " + ex.getMessage());
        }
    }
    
    public static ReadProperties getInstance() {
        if(instancia == null){
            instancia = new ReadProperties();
        }
        return instancia;
    }
    
    public String getPropertie(String key) {
        return archivoPropiedades.getProperty(key);
    }
    
}
