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
        String nombre_profesion = intent.getStringExtra("prof");

        Profesion foco = new Profesion(nombre_profesion);

        TextView text = findViewById(R.id.textView3);

        if (foco.isValida()) {
            text.setText(foco.getNombre());
        } else {
            text.setText("Profesión pendiente de implementación");
        }
    }
}
