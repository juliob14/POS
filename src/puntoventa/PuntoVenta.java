/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author JULIO
 */
public class PuntoVenta {
    private Integer folio;
    private Date fecha;
    private String cajero;
    private Integer caja;
    
    
    private List<DetalleVenta> detalles;
    /**
     * Constructor de la clase puntoventa que asigna un numero.
     * @param cajero
     * @param caja 
     */
    public PuntoVenta(String cajero,Integer caja){
       this.cajero=cajero;
       this.caja=caja;
       this.fecha=new Date();
       this.detalles=new ArrayList<>();
     }
    
    
            

    /**
     * @param args the command line arguments
     * 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    /**
     * @return the folio
     */
    public Integer getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the cajero
     */
    public String getCajero() {
        return cajero;
    }

    /**
     * @param cajero the cajero to set
     */
    public void setCajero(String cajero) {
        this.cajero = cajero;
    }

    /**
     * @return the caja
     */
    public Integer getCaja() {
        return caja;
    }

    /**
     * @param caja the caja to set
     */
    public void setCaja(Integer caja) {
        this.caja = caja;
    }
    
}
