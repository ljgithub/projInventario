/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Entidades;

import java.util.List;
import javax.persistence.*;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

/**
 *
 * @author JAVIER
 */
@Entity
@Table(name = "pedidos")
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPedido;
    @Temporal(TemporalType.DATE)
    private DateTime fechaHoraPedido;
    private String observaciones;
    
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fkIdProveedor")
    private Proveedor proveedorPedido;

   @OneToMany(mappedBy = "pedido")
   private List<DetallePedido> detallePedido;

    public Pedidos() {
    }

    public Pedidos(int idPedido, DateTime fechaHoraPedido, String observaciones, Proveedor proveedorPedido, List<DetallePedido> detallePedido) {
        this.idPedido = idPedido;
        this.fechaHoraPedido = fechaHoraPedido;
        this.observaciones = observaciones;
        this.proveedorPedido = proveedorPedido;
        this.detallePedido = detallePedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public DateTime getFechaHoraPedido() {
        return fechaHoraPedido;
    }

    public void setFechaHoraPedido(DateTime fechaHoraPedido) {
        this.fechaHoraPedido = fechaHoraPedido;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Proveedor getProveedorPedido() {
        return proveedorPedido;
    }

    public void setProveedorPedido(Proveedor proveedorPedido) {
        this.proveedorPedido = proveedorPedido;
    }

    public List<DetallePedido> getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(List<DetallePedido> detallePedido) {
        this.detallePedido = detallePedido;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "idPedido=" + idPedido + ", fechaHoraPedido=" + fechaHoraPedido + ", observaciones=" + observaciones + ", proveedorPedido=" + proveedorPedido + ", detallePedido=" + detallePedido + '}';
    }
    
   
   
}
