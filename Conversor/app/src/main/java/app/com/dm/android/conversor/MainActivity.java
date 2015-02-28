package app.com.dm.android.conversor;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private EditText editPesos;
    private EditText editCambio;
    private EditText editDolares;
    private EditText editCambio1;
    private Button btConvertir;
    private Button btConvertir1;
    private TextView resultado;
    private TextView resultado1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.resultado=(TextView)findViewById(R.id.resultado);
        this.resultado1=(TextView)findViewById(R.id.resultado1);
        this.editPesos=(EditText)findViewById(R.id.editPesos);
        this.editCambio=(EditText)findViewById(R.id.editCambio);
        this.editCambio1=(EditText)findViewById(R.id.editCambio1);
        this.editDolares=(EditText)findViewById(R.id.editDolares);
        this.btConvertir=(Button)findViewById(R.id.btConvertir);
        this.btConvertir1=(Button)findViewById(R.id.btConvertir1);

    }

    public void btConvertirPesosDolares(View v) {
        float editPesos, editCambio, resultado;

        editPesos = Float.parseFloat(this.editPesos.getText().toString());
        editCambio = Float.parseFloat(this.editCambio.getText().toString());
        resultado = editPesos * editCambio;
        this.resultado.setText(Float.toString(resultado));
    }
    public void btConvertirDolaresPesos(View v) {
        float editPesos, editCambio, resultado;

        editPesos = Float.parseFloat(this.editDolares.getText().toString());
        editCambio = Float.parseFloat(this.editCambio1.getText().toString());
        resultado = editPesos / editCambio;
        this.resultado1.setText(Float.toString(resultado));
    }
}
