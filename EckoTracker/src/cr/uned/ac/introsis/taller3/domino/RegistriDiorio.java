/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.uned.ac.introsis.taller3.domino;

import java.util.Date;

/**
 *
 * @author Ninoska
 */
public class RegistriDiorio {
    private Integer id;
    private Date fecha;
    private Integer accion_id;
    private Integer cantidad;
    private String comentario;

    public RegistriDiorio(Integer id, Date fecha, Integer accion_id, Integer cantidad, String comentario) {
        this.id = id;
        this.fecha = fecha;
        this.accion_id = accion_id;
        this.cantidad = cantidad;
        this.comentario = comentario;
    }

    
    
    
   //metodos getter y setter
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
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
     * @return the accion_id
     */
    public Integer getAccion_id() {
        return accion_id;
    }

    /**
     * @param accion_id the accion_id to set
     */
    public void setAccion_id(Integer accion_id) {
        this.accion_id = accion_id;
    }

    /**
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
    
    
    
}
