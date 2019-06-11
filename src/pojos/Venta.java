/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.util.Date;

/**
 *
 * @author FRANCISCO
 */
public class Venta {
    private int idVenta;
    private double cantidadVenta;
    private Date fechaVenta;

    public Venta(int idVenta, double cantidadVenta, Date fechaVenta) {
        this.idVenta = idVenta;
        this.cantidadVenta = cantidadVenta;
        this.fechaVenta = fechaVenta;
    }

    public Venta(double cantidadVenta, Date fechaVenta) {
        this.cantidadVenta = cantidadVenta;
        this.fechaVenta = fechaVenta;
    }
    

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public double getCantidadVenta() {
        return cantidadVenta;
    }

    public void setCantidadVenta(double cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }
    
    
    
}
