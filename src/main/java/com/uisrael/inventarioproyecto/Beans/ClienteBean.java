/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.Beans;

import com.uisrael.inventarioproyecto.controlador.IClienteController;
import com.uisrael.inventarioproyecto.controlador.IMPL.ClienteContrImpl;
import com.uisrael.inventarioproyecto.modelo.Entidades.Cliente;
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
@ManagedBean(name = "clienteBean")
@Dependent
public class ClienteBean implements Serializable {

    private static final IClienteController controllerCliente = new ClienteContrImpl();

    private String nombres;
    private String apellidos;
    private int telefono;
    private int celular;
    private String direccion;
    private String ciudad;
    private String email;
    private int estadoProveedor;

    private Cliente cliente;
    private List<Cliente> consultaListaClientes;

    public ClienteBean() {
    }

    @PostConstruct
    public void init() {
        llenarData();
    }

    public void llenarData() {
        consultaListaClientes = controllerCliente.listar();
    }

    public void insertar() {

        cliente = new Cliente();
        cliente.setNombres(nombres);
        cliente.setApellidos(apellidos);
        cliente.setTelefono(telefono);
        cliente.setCelular(celular);
        cliente.setDireccion(direccion);
        cliente.setCiudad(ciudad);
        cliente.setEmail(email);
        controllerCliente.ingresar(cliente);

        llenarData();
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEstadoProveedor() {
        return estadoProveedor;
    }

    public void setEstadoProveedor(int estadoProveedor) {
        this.estadoProveedor = estadoProveedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getConsultaListaClientes() {
        return consultaListaClientes;
    }

    public void setConsultaListaClientes(List<Cliente> consultaListaClientes) {
        this.consultaListaClientes = consultaListaClientes;
    }

    
}
