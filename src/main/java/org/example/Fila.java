package org.example;

import java.util.NoSuchElementException;

public class Fila<T> {
    private Object[] elementos;
    private int frente;
    private int tras;
    private int tamanho;

    public Fila(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser maior que zero");
        }
        elementos = new Object[capacidade];
        frente = 0;
        tras = -1;
        tamanho = 0;
    }

    public void enfileirar(T elemento) {
        if (tamanho == elementos.length) {
            throw new IllegalStateException("A fila está cheia");
        }
        tras = (tras + 1) % elementos.length;
        elementos[tras] = elemento;
        tamanho++;
    }

    @SuppressWarnings("unchecked")
    public T removerFila() {
        if (filaVazia()) {
            throw new NoSuchElementException("A fila está vazia");
        }
        T valor = (T) elementos[frente];
        frente = (frente + 1) % elementos.length;
        tamanho--;
        return valor;
    }

    public int size() {
        return tamanho;
    }

    public boolean filaVazia() {
        return tamanho == 0;
    }
}
