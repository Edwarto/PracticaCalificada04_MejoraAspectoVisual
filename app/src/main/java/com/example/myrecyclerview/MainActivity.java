package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Persona> personas;
    RecyclerView rv;

    private void initializeData() {
        personas = new ArrayList<>();
        personas.add(new Persona("Ada Lovelace", "25 años de edad", R.drawable.lovelace, "Es de estatura media y su cabello es castaño oscuro. Su profesión es maestra jardinera y trabaja desde hace 10 años en el jardín Solcitos Pequeños.\n"));
        personas.add(new Persona("Marie Curie", "35 años de edad", R.drawable.curie, "Le gusta dedicar su tiempo libre a la pintura, aunque a veces se le complica la realización de esta tarea por los deberes diarios de la casa. Al jubilarse le gustaría aprender mosaiquismo y dedicarse a escribir."));
        personas.add(new Persona("Ruth Wakefield", "29 años de edad", R.drawable.wakefield, "Le gusta el rock y en sus ratos libres se dedica a tocar la guitarra eléctrica con un grupo de amigos de la infancia." ));
        personas.add(new Persona("Fuller Collier", "28 años de edad", R.drawable.persona1,"Posee un carácter fuerte y es un poco testarudo, aunque tiene un gran corazón. Es una persona en la que se puede sin suda confiar y si tuviera que pedir ayuda, no dudaría en acudir a él."));
        personas.add(new Persona("Blaze Norton", "25 años de edad", R.drawable.persona2,"Tiene un caracter dulce y una paciencia eterna, siempre está de buen humor, por lo que cuando está mal se le nota enseguida. Cursa el sexto grado de la escuela Manuel Belgrano de la ciudad de Rosario. Sus calificaciones son excelentes, le encanta sin duda la escuela y en sus ratos libres le gusta leer y bailar danza clásica."));
        personas.add(new Persona("Barry Forbes", "19 años de edad", R.drawable.persona3,"Tiene una familia hermosa compuesta por su esposa y tres hijos que lo acompañan en todos sus proyectos y lo incentivan a seguir creciendo a nivel personal y profesional." ));
        personas.add(new Persona("Phelan Kerr", "15 años de edad", R.drawable.persona4,"Cuando sea grande quiere ser enfermera. Su pasión por ayudar a los demás la destaca de su grupo de amigas, por lo que siempre la eligen como la mejor compañera."));
        personas.add(new Persona("James Thornton", "30 años de edad", R.drawable.persona5,"Si me preguntan sobre su carácter puedo decir que es una gran persona, pero por sobre todo es muy serio. Tiene una gran adaptabilidad a los cambios, creo que en parte es por los cambios drásticos que tuvo que hacer a los inicios de su adolescencia."));


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView) findViewById(R.id.rv);


        rv.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());

        rv.setLayoutManager(linearLayoutManager);

        initializeData();

        RVAdapter rvAdapter = new RVAdapter(personas, this);




        rv.setAdapter(rvAdapter);

    }
}