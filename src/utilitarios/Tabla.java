package utilitarios;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel Angel Meca Pacherres <miguelmeca01@gmail.com>
 */
public class Tabla {
    
    public static void limpiaTabla(JTable tabla){
       try{
           DefaultTableModel temp = (DefaultTableModel)tabla.getModel();
           int a =temp.getRowCount()-1;
           for(int i=a; i>=0; i--)
               temp.removeRow(i);
           }catch(Exception e){
               e.printStackTrace();
           }
   }
    
    public static void agregarItemTabla(JTable tabla, Object [] item ){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.addRow(item);
    }
   
    
}
