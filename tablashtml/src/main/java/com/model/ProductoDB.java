package com.model;

import java.util.LinkedList;
import java.util.List;

public class ProductoDB {
    private static List<Producto> catalogo;

    public ProductoDB() {
    	    	
    	catalogo = new LinkedList<Producto>(); 
        // Creamos 4 productos- Esto en una aplicacion real, vendria de una BD
        Producto p1= new Producto(1);
        p1.setCategoria("Electronica");
        p1.setNombre("Computadora portatil");
        p1.setPrecio(1000);
        
        Producto p2= new Producto(2);
        p2.setCategoria("Electronica");
        p2.setNombre("Pantalla Sony 25Pulg.");
        p2.setPrecio(700);
        
        Producto p3= new Producto(3);
        p3.setCategoria("Telefonia");
        p3.setNombre("IPhone 5s");
        p3.setPrecio(500);
        
        Producto p4= new Producto(4);
        p4.setCategoria("Telefonia");
        p4.setNombre("Telefono LG 5");
        p4.setPrecio(350);
        //Agregamos los productos a la lista
        catalogo.add(p1);
        catalogo.add(p2);
        catalogo.add(p3);
        catalogo.add(p4);
    }
    
    public List<Producto> getAll(){
        return catalogo;
    }
}
