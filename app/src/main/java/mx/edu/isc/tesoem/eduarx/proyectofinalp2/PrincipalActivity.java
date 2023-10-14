package mx.edu.isc.tesoem.eduarx.proyectofinalp2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class PrincipalActivity extends AppCompatActivity {



    RadioButton rbrespuesta1, rbrespuesta2, rbrespuesta3;
TextView txtpregunta;
    Button btnverifica, btnsiguente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtpregunta=findViewById(R.id.txtpregunta);
        rbrespuesta1=findViewById(R.id.rbrespuesta1);
        rbrespuesta2=findViewById(R.id.rbrespuesta2);
        rbrespuesta3=findViewById(R.id.rbrespuesta3);

        btnverifica=findViewById(R.id.btnverifica);
        btnsiguente=findViewById(R.id.btnsiguente);





    }

    public void  acciones(View v){
        if (v.getId() == R.id.rbrespuesta1){
            Toast.makeText(this, "Se seleleciono Respuesta 1", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.rbrespuesta2) {
            Toast.makeText(this, "Se selecciono Respuesta 2", Toast.LENGTH_SHORT).show();

        }else if (v.getId() == R.id.rbrespuesta3){
            Toast.makeText(this, "Se selecciono Respuesta 3", Toast.LENGTH_SHORT).show();
        }else if (v.getId() == R.id.btnverifica){
            checarradio();
        }else if (v.getId() == R.id.btnverifica){
            checarcb();

        }
}

    private void checarradio() {
            if (rbrespuesta1.isChecked()){
                Toast.makeText(this, "Selecciono Respuesta 1", Toast.LENGTH_SHORT).show();
            }else if (rbrespuesta2.isChecked()){
                Toast.makeText(this, "Selecciono Respuesta 2", Toast.LENGTH_SHORT).show();
            }else if (rbrespuesta3.isChecked()){
                Toast.makeText(this, "Selecciono Respuesta 3", Toast.LENGTH_SHORT).show();
            }

        }



    public void  checarcb(){


    }
}


