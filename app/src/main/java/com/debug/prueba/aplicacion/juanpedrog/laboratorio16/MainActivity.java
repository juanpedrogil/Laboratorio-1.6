package com.debug.prueba.aplicacion.juanpedrog.laboratorio16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    String[][] datos={{"Folklorica","Sones de la Huasteca"},
                      {"Rock Alternativo","Urbano Argentino"},
            {"Acústicos","Concierto de trova"},
            {"Norteño","Calibre 50"}};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.lista);
        Adapter adapter=new Adapter(datos);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
    }
}
