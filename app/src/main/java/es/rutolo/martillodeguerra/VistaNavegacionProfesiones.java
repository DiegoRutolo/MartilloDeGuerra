package es.rutolo.martillodeguerra;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import org.w3c.dom.Text;

public class VistaNavegacionProfesiones extends AppCompatActivity {

    private Profesion profesion;
    private Profesion profParaAbrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Elimina la barra azul con el titulo
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_navegacion_profesiones);

        Intent intent = getIntent();
        NomProf nomProf = NomProf.getNombre(intent.getStringExtra("prof"));
        profesion = Diccionario.getInstancia().getProfesiones().get(nomProf);
        profParaAbrir = profesion;
        TextView profCentral = findViewById(R.id.profCentral);
        if (profesion.isValida()) {
            profCentral.setText(profesion.getNombre());
        } else {
            profCentral.setText("Pendiente de implementación");
            profCentral.setOnClickListener(null);
        }


        /* Escribe accesos y salidas */
        // TODO dibujar un fondo chupichuli con flechas y esas cosas
        Resources r = getResources();
        String name = getPackageName();
        for (int i = 0; i < profesion.getSalidas().length; i++) {
            TextView salida = findViewById(r.getIdentifier("salida" + i, "id", name));
            final String nombreSalida = profesion.getSalidas()[i].toString();
            salida.setText(nombreSalida);
            salida.setVisibility(View.VISIBLE);

            salida.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    profParaAbrir = Diccionario.getInstancia().getProfesiones().get(NomProf.getNombre(nombreSalida));
                    abreDetalles(v);
                }
            });
        }
        for (int i = 0; i < profesion.getAccesos().length; i++) {
            TextView acceso = findViewById(r.getIdentifier("acceso" + i, "id", name));
            final String nombreAcceso = profesion.getAccesos()[i].toString();
            acceso.setText(nombreAcceso);
            acceso.setVisibility(View.VISIBLE);

            acceso.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    profParaAbrir = Diccionario.getInstancia().getProfesiones().get(NomProf.getNombre(nombreAcceso));
                    abreDetalles(v);
                }
            });
        }
    }

    public void abreDetalles(View view) {
        Intent verDetalles = new Intent(VistaNavegacionProfesiones.this, VistaProfesion.class);
        verDetalles.putExtra("prof", profParaAbrir.getNombre());
        VistaNavegacionProfesiones.this.startActivity(verDetalles);
    }
}
