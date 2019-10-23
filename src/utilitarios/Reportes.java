package utilitarios;

import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Miguel Angel Meca Pacherres <miguelmeca01@gmail.com>
 */
public class Reportes {
    
    public static void visualizaVistaPrevia(JasperPrint jasperPrint){
        if(jasperPrint.getPages().size()>0){
           try{
            JasperViewer varViewer = new JasperViewer(jasperPrint,false);
            varViewer.setTitle("REPORTES");
            varViewer.setVisible(true);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            JOptionPane.showMessageDialog(null, "EL DOCUMENTO NO TIENE PAGINAS");
        }
    }
    
}
