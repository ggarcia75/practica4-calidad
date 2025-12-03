/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO1;

/**
 *
 * @author gguil
 */
public class ClaseObject {
    public static void main(String[] args) throws CloneNotSupportedException{
        
        Object miObjeto = 7f;
        miObjeto = 7f + 3.5f;
        
        System.out.println(miObjeto);
        
        Coche coche1 = new Coche();
        coche1.setMarca("Ferrari");
        coche1.setModelo("Ibia");
        coche1.setMatricula("ABC1234");
        
        System.out.println(coche1); 
        // o System.out.println(coche1.toString()); Hacen lo mismo
        
        Coche coche2 = new Coche(coche1);
        System.out.println(coche2);
        
        
        Coche coche3 = (Coche) coche1.clone();
        System.out.println(coche3);
        
        
        if (coche1.equals(coche2)) {
            System.out.println("coche1 y coche2 son iguales.");
        } else {
            System.out.println("coche1 y coche2 son diferentes.");
        }
        
        if (coche2.equals(coche3)) {
            System.out.println("coche2 y coche3 son iguales.");
        } else {
            System.out.println("coche2 y coche3 son diferentes.");
        }
        
        if (coche1.equals(coche3)) {
            System.out.println("coche1 y coche3 son iguales.");
        } else {
            System.out.println("coche1 y coche3 son diferentes.");
        }
        
        System.out.println("HashCode de coche1: " + coche1.hashCode());
        System.out.println("HashCode de coche2: " + coche2.hashCode());
        System.out.println("HashCode de coche3: " + coche3.hashCode());
        
        System.out.println("Nombre de la clase de coche3: " + coche3.getClass().getSimpleName());
    }
}
