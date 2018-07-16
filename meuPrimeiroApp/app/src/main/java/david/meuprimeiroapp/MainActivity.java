package david.meuprimeiroapp;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String TEXT_LOG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Informa qual o layout da minha tela. Se eu quiser mudar o layou bast mudar o activity

        Log.v(TEXT_LOG, "onCreate");
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();

        final LinearLayout tela = (LinearLayout) findViewById(R.id.tela);
        final EditText campoTexto = (EditText) findViewById(R.id.campoTexto);
        Button botaoToast = (Button) findViewById(R.id.botaoTexto);
        final Button botaoCorFundo = (Button) findViewById(R.id.botaoCorFundo);
        Button botaoCorLetra = (Button) findViewById(R.id.botaoCorLetra);
        Button botaoCorPadrao = (Button) findViewById(R.id.botaoCorPadrao);

        // Ação para o botão "Mensagem Toast"
        botaoToast.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View view) {
                Toast mensToast;
                String menPadrao = "Campo Text vazio";

                // Verifica se o campo Text esta vazio, se estiver coloca no Toast uma mensagem padrão, caso contrário pega o valor do Text
                if (campoTexto.getText().toString().equals("")) {
                    mensToast = Toast.makeText(MainActivity.this, menPadrao, Toast.LENGTH_SHORT);
                    mensToast.show();
                } else {
                    mensToast = Toast.makeText(MainActivity.this, (CharSequence) campoTexto.getText(), Toast.LENGTH_SHORT);
                    mensToast.show();
                }
            }
        });

        // Ação para o botão "Mude a cor do fundo"
        botaoCorFundo.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View view) {
                tela.setBackgroundColor(Color.parseColor("#0B9AE2"));
            }
        });

        // Ação para o botão "Mude a cor da letra do text"
        botaoCorLetra.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View view) {
                campoTexto.setTextColor(Color.parseColor("#FFFFFF01"));
            }
        });

        botaoCorPadrao.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View view) {
                tela.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                campoTexto.setTextColor(Color.parseColor("#ffcc0000"));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TEXT_LOG, "onStart");
        Toast.makeText(this, "Mensagem do START", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TEXT_LOG, "onResume");
        Toast.makeText(this, "Mensagem do RESUME", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TEXT_LOG, "onStop");
        Toast.makeText(this, "Mensagem do STOP", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TEXT_LOG, "onPause");
        Toast.makeText(this, "Mensagem do PAUSE", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TEXT_LOG, "onDestroy");

        Toast.makeText(this, "Mensagem do DESTROY", Toast.LENGTH_LONG).show();
    }
}