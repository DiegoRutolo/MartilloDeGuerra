package es.rutolo.martillodeguerra;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class VistaProfesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Elimina la barra azul con el titulo
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        // Pone pantalla completa
        // this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_vista_profesion);

        Intent intent = getIntent();
        NomProf nomProf = NomProf.getNombre(intent.getStringExtra("prof"));
        Profesion profesion = Diccionario.getInstancia().getProfesiones().get(nomProf);
        TextView text = findViewById(R.id.tvNombreGrande);

        // Escribe los datos
        text.setText(profesion.getNombre());

        Resources r = getResources();
        String name = getPackageName();
        for (Stat s : Stat.values()) {
            TextView caja = findViewById(r.getIdentifier("val".concat(s.toString()), "id", name));
            if (profesion.getStats().get(s) > 0) {
                caja.setText("+".concat(profesion.getStats().get(s).toString()));
            }
        }

        ((TextView) findViewById(R.id.tvNota)).setText(profesion.getNotas());

        /*
        RecyclerView rcvHabs = findViewById(R.id.rcvHabs);
        ArrayAdapter<NomHab> habAdapter = new ArrayAdapter<>(this, android.R.layout.list_content, NomHab.values());
        rcvHabs.setAdapter(habAdapter); */
    }
}
