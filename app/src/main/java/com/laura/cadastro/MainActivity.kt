package com.laura.cadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    private lateinit var editTextNome: EditText
    private lateinit var editTextTelefone: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextCidade: EditText
    private lateinit var spinnerEstado: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNome = findViewById(R.id.editTextNome)
        editTextTelefone = findViewById(R.id.editTextTelefone)
        editTextEmail = findViewById(R.id.editTextEmail)
        editTextCidade = findViewById(R.id.editTextCidade)
        spinnerEstado = findViewById(R.id.spinnerEstado)

        val buttonSalvar: Button = findViewById(R.id.buttonSalvar)
        val buttonLimpar: Button = findViewById(R.id.buttonLimpar)

        buttonSalvar.setOnClickListener {
            salvarFormulario()
        }

        buttonLimpar.setOnClickListener {
            limparFormulario()
        }
    }

    private fun salvarFormulario() {
        val nome = editTextNome.text.toString()
        val telefone = editTextTelefone.text.toString()
        val email = editTextEmail.text.toString()
        val cidade = editTextCidade.text.toString()
        val estado = spinnerEstado.selectedItem.toString()

        val formulario = Formulario(nome, telefone, email, cidade, estado)
        exibirToast(formulario.toString())
    }

    private fun limparFormulario() {
        editTextNome.text.clear()
        editTextTelefone.text.clear()
        editTextEmail.text.clear()
        editTextCidade.text.clear()
        spinnerEstado.setSelection(0) // Seleciona a primeira opção (Selecione um estado)
    }

    private fun exibirToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}
