package es.rutolo.martillodeguerra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class VistaNavegacionProfesiones extends AppCompatActivity {

    private NomProf nomProf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Elimina la barra azul con el titulo
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_navegacion_profesiones);

        Intent intent = getIntent();
        nomProf = NomProf.getNombre(intent.getStringExtra("prof"));
        Profesion profesion = Diccionario.getInstancia().getProfesiones().get(nomProf);
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
        Intent verDetalles = new Intent(VistaNavegacionProfesiones.this, VistaProfesion.class);
        verDetalles.putExtra("prof", nomProf.toString());
        VistaNavegacionProfesiones.this.startActivity(verDetalles);
    }
}
