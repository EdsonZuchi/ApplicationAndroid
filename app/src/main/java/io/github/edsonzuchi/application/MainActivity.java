package io.github.edsonzuchi.application;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView valor;
    EditText n1;
    EditText n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random);

        button = findViewById(R.id.button);
        valor = findViewById(R.id.valor);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b =(Button) v;
                Integer val1 = Integer.parseInt(String.valueOf(n1.getText()));
                Integer val2 = Integer.parseInt(String.valueOf(n2.getText()));

                Random random = new Random();
                int numeroSorteado = random.nextInt(val2 - val1 + 1) + val1;

                valor.setText(Integer.toString(numeroSorteado));
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}