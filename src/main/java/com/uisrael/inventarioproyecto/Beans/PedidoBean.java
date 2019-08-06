/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.Beans;

import com.uisrael.inventarioproyecto.controlador.IMPL.PedidoContrImpl;
import com.uisrael.inventarioproyecto.controlador.IMPL.ProveedorContrImpl;
import com.uisrael.inventarioproyecto.controlador.IPedidoController;
import com.uisrael.inventarioproyecto.controlador.IProveedorController;
import com.uisrael.inventarioproyecto.modelo.Entidades.Pedidos;
import com.uisrael.inventarioproyecto.modelo.Entidades.Proveedor;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 *
 * @author JAVIER
 */
@ManagedBean(name = "pedidoBean")
@ViewScoped
public class PedidoBean implements Serializable{
    private static final IPedidoController controllerPedido = new PedidoContrImpl();
    private static final IProveedorController controllerProveedor = new ProveedorContrImpl();
    
    private int idPedido;    
    private Date fechaHoraPedido;
    private String observaciones;
    private int fkIdProveedor;
    
    private Proveedor proveedor;
    private List<Proveedor> consultaListaProveedores;
    private Pedidos pedido;
    private List<Pedidos> consultaListaPedidos;
    
    public void llenarData(){
       consultaListaPedidos = controllerPedido.listar();
       consultaListaProveedores = controllerProveedor.listar();
    }
    
    /**
     * Creates a new instance of PedidoBean
     */
    public PedidoBean() {
    }
    
    @PostConstruct
    public void init(){
        llenarData();
        System.out.println("Majenador Pedido Cargado");
    }
    
    
    public void insertarPedido(){
        pedido = new Pedidos();
        proveedor = controllerProveedor.buscarPorid(fkIdProveedor);
        
        pedido.setFechaHoraPedido(fechaHoraPedido);
        pedido.setObservaciones(observaciones);
        pedido.setProveedorPedido(proveedor);
        controllerPedido.ingresar(pedido);
        
        llenarData();
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaHoraPedido() {
        return fechaHoraPedido;
    }

    public void setFechaHoraPedido(Date fechaHoraPedido) {
        this.fechaHoraPedido = fechaHoraPedido;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getFkIdProveedor() {
        return fkIdProveedor;
    }

    public void setFkIdProveedor(int fkIdProveedor) {
        this.fkIdProveedor = fkIdProveedor;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<Proveedor> getConsultaListaProveedores() {
        return consultaListaProveedores;
    }

    public void setConsultaListaProveedores(List<Proveedor> consultaListaProveedores) {
        this.consultaListaProveedores = consultaListaProveedores;
    }

    public Pedidos getPedido() {
        return pedido;
    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }

    public List<Pedidos> getConsultaListaPedidos() {
        return consultaListaPedidos;
    }

    public void setConsultaListaPedidos(List<Pedidos> consultaListaPedidos) {
        this.consultaListaPedidos = consultaListaPedidos;
    }
    
    
    
}
