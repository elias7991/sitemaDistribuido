/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal;

import javax.swing.JComboBox;

/**
 *
 * @author elias
 */
public class ObtieneTodo {
    
    /*
        Acá es donde debemos comunicarnos con el servidor a traves del json
        para ir mostrando todos los valores correctos en cada interfaz
    */
    
    public static void Hospitales(JComboBox listar_hospitales){
        
        
        
    }
    
    public static void Camas(JComboBox listar_camas){
        
    }
    
    public static void Camas_desocupadas(JComboBox lista_desocupadas){
        lista_desocupadas.addItem("No hay camas desocupadas");
    }
    
    public static void Camas_ocupadas(JComboBox lista_ocupadas){
        lista_ocupadas.addItem("No hay camas ocupadas");
    }
    
}
