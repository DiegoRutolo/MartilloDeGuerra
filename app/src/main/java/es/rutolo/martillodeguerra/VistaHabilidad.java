package es.rutolo.martillodeguerra;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class VistaHabilidad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_vista_habilidad);

        Intent intent = getIntent();
        NomHab nomHab = NomHab.getNombre(intent.getStringExtra("hab"));

        Habilidad habilidad = Diccionario.getInstancia().getHabilidades().get(nomHab);
        TextView nombreHabilidad = findViewById(R.id.tvNombreHabilidad);
        TextView descripcionHabilidad = findViewById(R.id.tvDescripcionHabilidad);
        LinearLayout cntTalentos = findViewById(R.id.cntTalentos);

        nombreHabilidad.setText(nomHab.toString());
        descripcionHabilidad.setText(habilidad.getDescripcion());
        for(NomTal nt : habilidad.getTalentos()){
            //Creamos el textView para el talento
            TextView tv = new TextView(this);
            //Le ponemos el nombre del talento
            tv.setText(nt.toString());
            //Fijamos los margenes del componente
            LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            llp.setMargins(5, 5, 5, 5); // llp.setMargins(left, top, right, bottom);
            tv.setLayoutParams(llp);
            //Añadimos el onClickListener
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    abrirTalento(v);
                }
            });
            //Ponemos el estilo
            tv.setTypeface(Typeface.DEFAULT_BOLD);
            cntTalentos.addView(tv);
        }

    }

    public void abrirTalento(View view){
        TextView tv = (TextView) view;

        Intent intent = new Intent(VistaHabilidad.this, VistaTalento.class);
        intent.putExtra("tal", tv.getText());
        VistaHabilidad.this.startActivity(intent);
    }
}
