package dev.ygordoring.listadecontatos.singleton

import dev.ygordoring.listadecontatos.feature.listacontatos.model.ContatosVO

object ContatoSingleton {
    var lista: MutableList<ContatosVO> = mutableListOf()
}