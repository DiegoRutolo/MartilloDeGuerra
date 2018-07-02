package es.rutolo.martillodeguerra;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<NomProf> profAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, NomProf.values());
        AutoCompleteTextView textView = findViewById(R.id.buscador);

        textView.setAdapter(profAdapter);
    }

    public void abreProfesion(View view) {
        TextView text = findViewById(R.id.buscador);
        String msg = text.getText().toString();

        if (NomProf.isHere(NomProf.getNombre(msg))) {
            Intent verProfesiones = new Intent(MainActivity.this, VistaNavegacionProfesiones.class);
            verProfesiones.putExtra("prof", msg);
            MainActivity.this.startActivity(verProfesiones);
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Opción inválida").setMessage("Debes elegir una de las opciones dadas");
            builder.create();
        }
    }

    public void abreHabilidad(View view) {
        TextView text = findViewById(R.id.buscador);
        String msg = text.getText().toString();

        Intent verHabilidad = new Intent(MainActivity.this, VistaHabilidad.class);

        //Este paso nos asegura que tenemos un nomHab valido, de lo contrario estaríamos pasando directamente lo que introduzca el usuario
        NomHab nomHab = NomHab.getNombre(msg);

        verHabilidad.putExtra("hab", nomHab.toString());
        MainActivity.this.startActivity(verHabilidad);
    }

    public void abreTalento(View view) {
        TextView text = findViewById(R.id.buscador);
        String msg = text.getText().toString();

        Intent verTalento = new Intent(MainActivity.this, VistaTalento.class);

        NomTal nomTal = NomTal.getNombre(msg);

        verTalento.putExtra("tal", nomTal.toString());
        MainActivity.this.startActivity(verTalento);
    }

    public void cambiaFiltro(View view){
        ArrayAdapter<NomProf> profAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, NomProf.values());
        ArrayAdapter<NomHab> habAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, NomHab.values());
        ArrayAdapter<NomTal> talAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, NomTal.values());
        AutoCompleteTextView textView = findViewById(R.id.buscador);
        Button btnBuscar = findViewById(R.id.btnBuscar);

        RadioButton radioButton = findViewById(view.getId());
        TextView titulo = findViewById(R.id.tvTitulo);
        titulo.setText(radioButton.getText());
        switch(radioButton.getId()){
            case R.id.rbtnProfesion:
                textView.setAdapter(profAdapter);
                //Cambia la funcion a la que se llama al buscar
                btnBuscar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        abreProfesion(v);
                    }
                });
                break;
            case R.id.rbtnHabilidad:
                textView.setAdapter(habAdapter);
                btnBuscar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        abreHabilidad(v);
                    }
                });
                break;
            case R.id.rbtnTalento:
                textView.setAdapter(talAdapter);
                btnBuscar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        abreTalento(v);
                    }
                });
                break;
        }
    }

    public void verTodo(View view) {
        ((AutoCompleteTextView) findViewById(R.id.buscador)).showDropDown();
    }
}
