package es.rutolo.martillodeguerra;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import java.io.Serializable;

public class NavegacionProfesiones extends AppCompatActivity {

    private Profesion profesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Elimina la barra azul con el titulo
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_navegacion_profesiones);

        Intent intent = getIntent();
        NomProf nomProf = NomProf.getNombre(intent.getStringExtra("prof"));
        profesion = new Profesion(nomProf);
        TextView profCentral = findViewById(R.id.profCentral);
        if (profesion.isValida()) {
            profCentral.setText(nomProf.toString());
        } else {
            profCentral.setText("Pendiente de implementación");
            profCentral.setOnClickListener(null);
        }

        TextView salida1 = findViewById(R.id.salida1);
        salida1.setText(profesion.getSalidas()[0].toString());
        salida1.setVisibility(View.VISIBLE);
    }

    public void abreDetalles(View view) {
        Intent verDetalles = new Intent(NavegacionProfesiones.this, VistaProfesion.class);
        verDetalles.putExtra("prof", profesion);
        NavegacionProfesiones.this.startActivity(verDetalles);
    }
}
