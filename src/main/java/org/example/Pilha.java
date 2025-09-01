package org.example;

import java.util.EmptyStackException;

public class Pilha<T> {
    private Object[] elementos;
    private int topo;

    public Pilha(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser maior que zero");
        }
        elementos = new Object[capacidade];
        topo = -1;
    }

    public void push(T elemento) {
        if (isFull()) {
            throw new StackOverflowError("A pilha está cheia");
        }
        elementos[++topo] = elemento;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) elementos[topo--];
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) elementos[topo];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == elementos.length - 1;
    }

    public int size() {
        return topo + 1;
    }
}
