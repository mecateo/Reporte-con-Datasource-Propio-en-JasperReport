package clases;

import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import pojos.Movimiento;

/**
 *
 * @author Miguel Angel Meca Pacherres <miguelmeca01@gmail.com>
 */
public class MovimientoDataSourceReporte implements JRDataSource{

    private List<Movimiento> listaMovimientos = new ArrayList<Movimiento>();
    private int indiceMovimientos = -1;
    
    @Override
    public boolean next() throws JRException {
        return ++indiceMovimientos < listaMovimientos.size(); 
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        if(jrf.getName().equals("fechaMovimiento")){
            valor = listaMovimientos.get(indiceMovimientos).getFechaMovimiento();
        }else if(jrf.getName().equals("tipoMovimiento")){
            valor = listaMovimientos.get(indiceMovimientos).getTipoMovimiento();
        }else if(jrf.getName().equals("cantidadIngreso")){
            valor = listaMovimientos.get(indiceMovimientos).getCantidadIngreso();
        }else if(jrf.getName().equals("precioIngreso")){
            valor = listaMovimientos.get(indiceMovimientos).getPrecioIngreso();
        }else if(jrf.getName().equals("totalIngreso")){
            valor = listaMovimientos.get(indiceMovimientos).getTotalIngreso();
        }else if(jrf.getName().equals("cantidadVenta")){
            valor = listaMovimientos.get(indiceMovimientos).getCantidadVenta();
        }else if(jrf.getName().equals("precioVenta")){
            valor = listaMovimientos.get(indiceMovimientos).getPrecioVenta();
        }else if(jrf.getName().equals("totalVenta")){
            valor = listaMovimientos.get(indiceMovimientos).getTotalVenta();
        }else if(jrf.getName().equals("cantidadTotal")){
            valor = listaMovimientos.get(indiceMovimientos).getCantidadTotal();
        }else if(jrf.getName().equals("precioTotal")){
            valor = listaMovimientos.get(indiceMovimientos).getPrecioTotal();
        }
        
        return valor;
    }
    
}
