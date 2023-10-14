package com.example.arthur.bancodesenhas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class SenhaAuxiliar(context: Context, resource: Int, objects: List<Senhas>) :
    ArrayAdapter<Senhas>(context, resource, objects) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val convertView =
            convertView ?: LayoutInflater.from(context).inflate(R.layout.lista_senha, parent, false)

        val descricaoTextView: TextView = convertView.findViewById(R.id.descricaoTextView)
        val tamanhoTextView: TextView = convertView.findViewById(R.id.tamanhoTextView)

        val senha = getItem(position)
        descricaoTextView.text = senha?.nomeS
        tamanhoTextView.text = "(${senha?.tamanho})"
        return convertView
    }
}
