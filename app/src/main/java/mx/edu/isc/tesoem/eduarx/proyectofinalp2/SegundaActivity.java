package mx.edu.isc.tesoem.eduarx.proyectofinalp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    RadioButton rbrespuesta1de2, rbrespuesta2de2, rbrespuesta3de2;
    Button btnverifica2, btncalificar2, btnatras;

    TextView txtpregunta2;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        txtpregunta2=findViewById(R.id.txtpregunta2);
        rbrespuesta1de2=findViewById(R.id.rbrespuesta1de2);
        rbrespuesta1de2=findViewById(R.id.rbrespuesta2de2);
        rbrespuesta3de2=findViewById(R.id.respuesta3de2);
        btncalificar2=findViewById(R.id.btncalificar2);
        btnverifica2=findViewById(R.id.btnverifica2);

    }
}