package es.rutolo.martillodeguerra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class VistaTalento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Quita barra de titulo
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_vista_talento);

        Intent intent =  this.getIntent();
        NomTal nomTal = NomTal.getNombre(intent.getStringExtra("tal"));
        Talento talento = Diccionario.getInstancia().getTalentos().get(nomTal);

        TextView tvTituloTalento = findViewById(R.id.tvTituloTalento);
        TextView tvDescripcionTalento = findViewById(R.id.tvDescripcionTalento);

        tvTituloTalento.setText(nomTal.toString());
        tvDescripcionTalento.setText(talento.getDescripcion());
    }
}
