package com.salomon.ejercicios_clase_9;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.salomon.ejercicios_clase_9.models.Categoria;
import com.salomon.ejercicios_clase_9.models.Inventario;
import com.salomon.ejercicios_clase_9.models.Producto;

public class MainActivity extends AppCompatActivity {
    Producto p = new Producto(0, "Iphone", 500.00,
            new Categoria("Tecnologia"));
    Inventario inventario = new Inventario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        inventario.agregarProducto(p);
        inventario.verProductos();
    }

}