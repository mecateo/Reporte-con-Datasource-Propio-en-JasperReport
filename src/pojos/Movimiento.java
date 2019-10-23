package pojos;

import java.math.BigDecimal;

/**
 *
 * @author Miguel Angel Meca Pacherres <miguelmeca01@gmail.com>
 */
public class Movimiento {
    
    private String fechaMovimiento;
    private String tipoMovimiento;
    private Integer cantidadIngreso;
    private BigDecimal precioIngreso;
    private BigDecimal totalIngreso;
    private Integer cantidadVenta;
    private BigDecimal precioVenta;
    private BigDecimal totalVenta;
    private Integer cantidadTotal;
    private BigDecimal precioTotal;

    public Movimiento() {
    }

    public String getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(String fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public Integer getCantidadIngreso() {
        return cantidadIngreso;
    }

    public void setCantidadIngreso(Integer cantidadIngreso) {
        this.cantidadIngreso = cantidadIngreso;
    }

    public BigDecimal getPrecioIngreso() {
        return precioIngreso;
    }

    public void setPrecioIngreso(BigDecimal precioIngreso) {
        this.precioIngreso = precioIngreso;
    }

    public BigDecimal getTotalIngreso() {
        return totalIngreso;
    }

    public void setTotalIngreso(BigDecimal totalIngreso) {
        this.totalIngreso = totalIngreso;
    }

    public Integer getCantidadVenta() {
        return cantidadVenta;
    }

    public void setCantidadVenta(Integer cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public BigDecimal getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(BigDecimal totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Integer getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(Integer cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public BigDecimal getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(BigDecimal precioTotal) {
        this.precioTotal = precioTotal;
    }

}
