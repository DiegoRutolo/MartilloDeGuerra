package es.rutolo.martillodeguerra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VistaProfesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_profesion);

        Intent intent = getIntent();
        TextView text = findViewById(R.id.textView3);

        NomProf nomProf = NomProf.getNombre(intent.getStringExtra("prof"));
        Profesion profesionCentral = new Profesion(nomProf);

        text.setText(profesionCentral.getNombre());
    }
}
