/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portuary.dem;

import java.sql.Timestamp;

/**
 *
 * @author Portuary
 */
public class Container {
    
    private Integer id;
    private String numero;
    private Cliente cliente = new Cliente();
    private TipoContainer tipo = new TipoContainer();
    private StatusContainer status = new StatusContainer();
    private CategoriaContainer categoria = new CategoriaContainer();
    private Timestamp dataCadastro;
    private Timestamp dataAlteracao;
    
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
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the tipo
     */
    public TipoContainer getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoContainer tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the status
     */
    public StatusContainer getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(StatusContainer status) {
        this.status = status;
    }

    /**
     * @return the categoria
     */
    public CategoriaContainer getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(CategoriaContainer categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the dataCadastro
     */
    public Timestamp getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @param dataCadastro the dataCadastro to set
     */
    public void setDataCadastro(Timestamp dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    /**
     * @return the dataAlteracao
     */
    public Timestamp getDataAlteracao() {
        return dataAlteracao;
    }

    /**
     * @param dataAlteracao the dataAlteracao to set
     */
    public void setDataAlteracao(Timestamp dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }
    
    
}
