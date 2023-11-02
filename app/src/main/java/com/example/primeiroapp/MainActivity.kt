package com.example.primeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var result: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**códigos para tornar a minha saída de valores visíveis !**/
        result = findViewById<TextView>(R.id.saidaValor)


        /**Variável para receber o evento do button**/
        val buttonConverter = findViewById<Button>(R.id.button_Conversor)

        buttonConverter.setOnClickListener {
            converter()
        }
    }

        private fun converter(){
            /**Variável esta recebendo o estado do meu RadioGroup **/
            val entradaValorRadioGroup = findViewById<RadioGroup>(R.id.radio_Group)
            /**Variável esta recebendo o ID que esta no meu RadioGroup**/
            val valorIdRadioButton = entradaValorRadioGroup.checkedRadioButtonId

            var res: Double = 0.0
            if (valorIdRadioButton == R.id.EntradaDolar){
                res = 5.0
            } else if (valorIdRadioButton == R.id.EntradaEuro){
               res = 5.26
            } else{
                res = 6.0
            }
            /**variavel que recebe o valor digitado pelo usuario**/
            val editText = findViewById<EditText>(R.id.editTextNumberDecimal13)
            val valorReal = editText.text.toString()
            /**compa para checar se o valor de entrada NÃO É NULL **/
            if(valorReal.isEmpty())
                return
            /**campo que faz conversão do minha string para double**/
            result.text = "R$${"%.2f".format(valorReal.toDouble() * res)}"
            result.visibility = View.VISIBLE







        }


}