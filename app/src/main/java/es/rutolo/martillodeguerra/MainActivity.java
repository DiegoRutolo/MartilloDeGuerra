package es.rutolo.martillodeguerra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<NomProf> adapter = new ArrayAdapter<NomProf>(this, android.R.layout.simple_dropdown_item_1line, NomProf.values());
        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.profesion);
        textView.setAdapter(adapter);
    }

    public void abreProfesion(View view) {
        TextView text = findViewById(R.id.profesion);
        String msg = text.getText().toString();

        Intent verProfesion = new Intent(MainActivity.this, VistaProfesion.class);
        verProfesion.putExtra("prof", msg);
        MainActivity.this.startActivity(verProfesion);
    }
}
