/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionparking;

/**
 *
 * @author Lourdes
 */
public class Vehiculo {
    public String matricula,modelo,color,nifDueño;
    public int telefono;
    
    public Vehiculo(String matricula,String nifDueño){
        this.matricula=matricula;
        this.nifDueño=nifDueño;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getNifDueño() {
        return nifDueño;
    }
    public void setNifDueño(String nifDueño) {
        this.nifDueño = nifDueño;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        try{
            this.telefono = telefono;
        }catch(Exception e){
            System.out.println("Numero de telefono incorrecto");
        }
        
    }
    @Override
    public String toString(){
        return this.matricula+" "+this.modelo+" "+this.color;
    }
    
}
