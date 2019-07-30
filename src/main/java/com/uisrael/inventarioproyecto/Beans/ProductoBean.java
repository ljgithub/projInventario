/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.Beans;

import com.uisrael.inventarioproyecto.controlador.IMPL.ProdutolContrImpl;
import com.uisrael.inventarioproyecto.controlador.IMPL.ProveedorContrImpl;
import com.uisrael.inventarioproyecto.controlador.IMPL.UnidadMedidaContrImpl;
import com.uisrael.inventarioproyecto.controlador.IMPL.ZonaContrImpl;
import com.uisrael.inventarioproyecto.controlador.IProductoController;
import com.uisrael.inventarioproyecto.controlador.IProveedorController;
import com.uisrael.inventarioproyecto.controlador.IUnidadMedidaController;
import com.uisrael.inventarioproyecto.controlador.IZonaController;
import com.uisrael.inventarioproyecto.modelo.Entidades.Producto;
import com.uisrael.inventarioproyecto.modelo.Entidades.Proveedor;
import com.uisrael.inventarioproyecto.modelo.Entidades.UnidadMedida;
import com.uisrael.inventarioproyecto.modelo.Entidades.Zona;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author JAVIER
 */
@ManagedBean(name = "productoBean")
@Dependent
public class ProductoBean implements Serializable {

    private static final IProductoController controllerProducto = new ProdutolContrImpl();
    private static final IProveedorController controllerProveedor = new ProveedorContrImpl();
    private static final IZonaController controllerZona = new ZonaContrImpl();
    private static final IUnidadMedidaController controllerUnidadM = new UnidadMedidaContrImpl();

    private int idProducto;
    private String codigoProducto;
    private String descripcionProducto;
    private double valorUnitario;
    private int iva;
    private double peso;
    private String marca;
    private int estadoProducto;

    private int fkIdProveedor;
    private int fkIdZona;
    private int fkIdUnidadMedida;

    private List<Producto> consultaListaProducto;

    private Producto producto;
    private Proveedor proveedor;
    private Zona zona;
    private UnidadMedida unidadMedida;

    /**
     * Creates a new instance of ProductoBean
     */
    public ProductoBean() {
    }

    @PostConstruct
    public void init() {
        llenarDatos();
    }

    public void llenarDatos() {
        consultaListaProducto = controllerProducto.listar();
    }

    public void insertar() {
        proveedor = controllerProveedor.buscarPorid(fkIdProveedor);
        unidadMedida = controllerUnidadM.buscarPorid(fkIdUnidadMedida);
        zona = controllerZona.buscarPorid(fkIdZona);

        producto.setCodigoProducto(codigoProducto);
        producto.setDescripcionProducto(descripcionProducto);       
        producto.setEstadoProducto(estadoProducto);
        producto.setIva(iva);
        producto.setMarca(marca);
        producto.setPeso(peso);
        producto.setProveedor(proveedor);
        producto.setUnidadMedida(unidadMedida);
        producto.setValorUnitario(valorUnitario);
        producto.setZona(zona);
        
        llenarDatos();
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(int estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

}
