/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);   
        System.out.println("Nombre producto:");
        String nomeProducto = sc.next();
        System.out.println("Ventas:");
        int ventasProductos = sc.nextInt();
                
        Almacen producto = new Almacen(nomeProducto,ventasProductos);
        
        String x=producto.productoTipo();
        System.out.println(x);
    }
    
}
