package com.example.meuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView TextResultado;
    EditText PrimeiroNumero,SegundoNumero;
    Button BotaoAdicao, BotaoSubtracao,BotaoDivisao,BotaoMultiplicacao;
    double numero1,numero2,resultado;
    String numero1String, numero2String;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VinculoComponentes();
        EventosClicar();
        ConverterVariaveis();


    }

    private void EventosClicar(){
        BotaoAdicao.setOnClickListener(evt->adicionar());
        BotaoSubtracao.setOnClickListener(evt-> subtrair());
        BotaoDivisao.setOnClickListener(evt-> dividir());
        BotaoMultiplicacao.setOnClickListener(evt-> multiplicar());


    }


    private void VinculoComponentes(){

        TextResultado=findViewById(R.id.textViewResultado);

        BotaoAdicao=findViewById(R.id.btnAdicao);
        BotaoSubtracao=findViewById(R.id.btnSubtracao);
        BotaoDivisao=findViewById(R.id.btnDivisao);
        BotaoMultiplicacao=findViewById(R.id.btnMultiplicacao);

        PrimeiroNumero=findViewById(R.id.editTextPrimeiroNumero);
        SegundoNumero=findViewById(R.id.editTextSegundoNumero);


    }

    private void MeuToast(){
        Toast.makeText(this,"Digite dois valores",Toast.LENGTH_SHORT).show();
    }

    private void ConverterVariaveis() {

        String numero1String = PrimeiroNumero.getText().toString();
        String numero2String = SegundoNumero.getText().toString();

        if (numero1String.isEmpty() || numero2String.isEmpty()) {
            acaobotaolimpar();
            MeuToast();
            return;

        }
         numero1 = Double.parseDouble(numero1String);
         numero2 = Double.parseDouble(numero2String);




    }
    public void acaobotaolimpar(){

            TextResultado.setText("");

    }
    private void adicionar (){

        ConverterVariaveis();
        resultado = numero1 + numero2;
        TextResultado.setText(String.valueOf(resultado));

    }

    private void subtrair(){

        ConverterVariaveis();
        resultado = numero1 - numero2;
        TextResultado.setText(String.valueOf(resultado));


    }
    private void dividir(){

        ConverterVariaveis();
        resultado = numero1 / numero2;
        TextResultado.setText(String.valueOf(resultado));

    }
    private void multiplicar(){

        ConverterVariaveis();
        resultado = numero1 * numero2;
        TextResultado.setText(String.valueOf(resultado));


    }


}