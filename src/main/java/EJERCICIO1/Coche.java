/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO1;

/**
 *
 * @author gguil
 */
public class Coche implements Cloneable{
    private String marca;
    private String modelo;
    private String matricula;

    public Coche() {  
    }
    
    public Coche(Coche otroCoche) { // Esto no hace falta porque ya hay un clone
        this.marca = otroCoche.marca;
        this.modelo = otroCoche.modelo;
        this.matricula = otroCoche.matricula;  
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
	return super.clone();
	}
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
    
    @Override
    public String toString() {
        return "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false;

        Coche cocheComp = (Coche) obj; 
        return marca.equals(cocheComp.marca) &&
               modelo.equals(cocheComp.modelo) &&
               matricula.equals(cocheComp.matricula);
    }
}
