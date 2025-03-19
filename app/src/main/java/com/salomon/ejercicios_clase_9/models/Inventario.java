package com.salomon.ejercicios_clase_9.models;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    ArrayList<Producto> productos = new ArrayList<>();

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
        System.out.println("Producto agregado al inventario!");
    }
}
