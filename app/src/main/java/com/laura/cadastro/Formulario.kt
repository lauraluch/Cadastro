package com.laura.cadastro

class Formulario(
    val nome: String,
    val telefone: String,
    val email: String,
    val cidade: String,
    val estado: String
) {
    override fun toString(): String {
        return "Nome: $nome\nTelefone: $telefone\nEmail: $email\nCidade: $cidade\nEstado: $estado"
    }
}
