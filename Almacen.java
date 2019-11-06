/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;

/**
 *
 * @author jalonsoriveiro
 */
public class Almacen {
    private String productoNome;
    private int productoVendas;

public Almacen (String ProductoNome,int ProductoVendas){
    
    this.productoNome = ProductoNome;
    this.productoVendas = ProductoVendas;

}
    
public String productoTipo(){
                  
    //return productoNome;

    if(productoVendas<=100){
        
        return "Baixo";
        }
    else if (productoVendas>100 && productoVendas<=500){
            
        return "Medio";
    }
    else if(productoVendas>500 && productoVendas<=1000){
       return "Alto";
    }
    else if(productoVendas>1000){
        return "Primeira necesidade";
           }
      else{
        return "Numero incorrecto";
            }
}
}



