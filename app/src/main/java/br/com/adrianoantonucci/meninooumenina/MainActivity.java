package br.com.adrianoantonucci.meninooumenina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AndroidException;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spin_idade, spin_mes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageButton btCalcular = (ImageButton) findViewById(R.id.btnCalcular);
        ImageButton btnSobre = (ImageButton) findViewById(R.id.btnSobre);
        final ImageView imgExibir = (ImageView) findViewById(R.id.imgExibir);

        spin_idade = (Spinner) findViewById(R.id.spin_idade);
        ArrayAdapter adapteridade = ArrayAdapter.createFromResource(this, R.array.cb_idade, android.R.layout.simple_dropdown_item_1line);
        spin_idade.setAdapter(adapteridade);

        spin_mes = (Spinner) findViewById(R.id.spin_mes);
        ArrayAdapter adaptermes = ArrayAdapter.createFromResource(this, R.array.cb_mes, android.R.layout.simple_dropdown_item_1line);
        spin_mes.setAdapter(adaptermes);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                CalcularSexo( Integer.parseInt(spin_idade.getSelectedItem().toString()),spin_mes.getSelectedItem().toString());
            }
        });

        btnSobre.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v){
            Intent iTela = new Intent(MainActivity.this, SobreActivity.class);
            startActivity(iTela);
        }
        });

        imgExibir.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                imgExibir.setImageResource(R.drawable.ambos);
            }
        });
    }
        private void CalcularSexo(int idade, String mes) {
            int idMes = 0;

            switch (mes){
                case "Janeiro":
                    idMes = 1;
                    break;
                case "Fevereiro":
                    idMes = 2;
                    break;
                case  "Março":
                    idMes = 3;
                    break;
                case "Abril":
                    idMes = 4;
                    break;
                case "Maio":
                    idMes = 5;
                    break;
                case "Junho":
                    idMes = 6;
                    break;
                case  "Julho":
                    idMes = 7;
                    break;
                case "Agosto":
                    idMes = 8;
                    break;
                case "Setembro":
                    idMes = 9;
                    break;
                case "Outubro":
                    idMes = 10;
                    break;
                case  "Novembro":
                    idMes = 11;
                    break;
                case "Dezembro":
                    idMes = 12;
                    break;
            }
            ImageView imgExibir = (ImageView) findViewById(R.id.imgExibir);
            int Resultado = idade + 9 +idMes;
            String Retorno = "";

            if (Resultado % 2 == 0){
                imgExibir.setImageResource(R.drawable.menina);
            } else {
                imgExibir.setImageResource(R.drawable.menino);
            }

          //  Toast.makeText(getApplicationContext(), Retorno, Toast.LENGTH_SHORT).show();
        }
    }
