package com.example.trabalho

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val buttonLimpar = findViewById<Button>(R.id.buttonLimpar)
        val buttonCadastro = findViewById<Button>(R.id.buttonCadastro)
        val textResposta = findViewById<TextView>(R.id.textResposta)

        // Adicionando um ouvinte de clique ao botãoLimpar
        buttonLimpar.setOnClickListener {
            // Limpar o texto do EditText
            editText.text.clear()
        }

        // Adicionando um ouvinte de clique ao botãoCadastro
        buttonCadastro.setOnClickListener {
            // Obtendo o texto do EditText
            val texto = editText.text.toString()
            // Definindo o texto no TextView textResposta
            textResposta.text = texto
        }

        // Aplicando o código para ajustar o padding com base nas barras do sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
