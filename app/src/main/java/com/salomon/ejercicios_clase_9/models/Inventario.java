package com.salomon.ejercicios_clase_9.models;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    ArrayList<Producto> productos = new ArrayList<>();

    public void verProductos() {
        for(Producto p : productos){
            System.out.println(p.toString());
        }
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
        System.out.println("Producto agregado al inventario!");
    }
    public void eliminarProducto(int id){
        for(Producto p : productos){
            if (p.getId() == id) {
                productos.remove(p);
            }
        }
        System.out.println("Producto agregado al inventario!");
    }
}
