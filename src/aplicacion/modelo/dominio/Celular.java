/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 * Trabajo Practico N°3 Punto 1
 * -Clase agregada para utilizar la clase "DispositivoCientifico"
 * @author Rocio
 */
public class Celular {
    /**
     * Marca del celular
     */
    private String marca;
    /**
     * Modelo del celular
     */
    private String modelo;
    /**
     * Capacidad de almacenamiento
     */
    private int capacidad;
    /**
     * Instancia de la clase dispositivo cientifico
     */
    private DispositivoCientifico dispositivoCientifico;

    /**
     * Constructor necesario para inicializar el dispositivo cientifico
     */
    public Celular(){
        this.dispositivoCientifico = new DispositivoCientifico();
    }
    /**
     * @return the dispositivoCientifico  
     */
    public DispositivoCientifico getDispositivoCientifico() {
        return dispositivoCientifico;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void llamar(){
        
    }
    public void enviarMensaje(){
        
    }
    public void navegarInternet(){
        
    }
    public void sacarFoto(){
        
    }
    
}
