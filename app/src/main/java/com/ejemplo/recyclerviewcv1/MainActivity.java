package com.ejemplo.recyclerviewcv1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<DataProvider> productList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Aquí va la adición de elementos a la lista
        productList.add(
                new DataProvider("Folclorika", "Sones de la Huasteca",R.drawable.imagen1, Color.BLACK)
        );
        productList.add(
                new DataProvider("Rock Alternativo", "Urbano Argentino",R.drawable.imagen2, Color.MAGENTA)
        );
        productList.add(
                new DataProvider("Acusticos", "Conciertos de trova",R.drawable.imagen3,Color.DKGRAY)
        );
        productList.add(
                new DataProvider("Regeton al 100", "Conciertos en Zocalo",R.drawable.imagen4,Color.RED)
        );

        adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);





    }
}
