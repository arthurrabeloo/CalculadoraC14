package org.example;

import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class PilhaTest {

    @Test
    void testPushAndPop() {
        Pilha<Integer> pilha = new Pilha<>(5);
        pilha.push(10);
        pilha.push(20);
        assertEquals(20, pilha.pop());
        assertEquals(10, pilha.pop());
    }

    @Test
    void testPeek() {
        Pilha<String> pilha = new Pilha<>(3);
        pilha.push("A");
        pilha.push("B");
        assertEquals("B", pilha.peek());
        assertEquals(2, pilha.size()); // Peek não remove
    }

    @Test
    void testIsEmptyInitially() {
        Pilha<Integer> pilha = new Pilha<>(2);
        assertTrue(pilha.isEmpty());
    }

    @Test
    void testIsFull() {
        Pilha<Integer> pilha = new Pilha<>(2);
        pilha.push(1);
        pilha.push(2);
        assertTrue(pilha.isFull());
    }

    @Test
    void testPopEmptyThrowsException() {
        Pilha<Integer> pilha = new Pilha<>(2);
        assertThrows(EmptyStackException.class, pilha::pop);
    }

    @Test
    void testPeekEmptyThrowsException() {
        Pilha<Integer> pilha = new Pilha<>(2);
        assertThrows(EmptyStackException.class, pilha::peek);
    }

    @Test
    void testPushOverflowThrowsException() {
        Pilha<Integer> pilha = new Pilha<>(1);
        pilha.push(5);
        assertThrows(StackOverflowError.class, () -> pilha.push(10));
    }

    @Test
    void testSize() {
        Pilha<String> pilha = new Pilha<>(3);
        pilha.push("X");
        pilha.push("Y");
        assertEquals(2, pilha.size());
    }

    @Test
    void testDifferentTypes() {
        Pilha<Double> pilha = new Pilha<>(2);
        pilha.push(3.14);
        assertEquals(3.14, pilha.pop());
    }

    @Test
    void testCapacidadeInvalida() {
        assertThrows(IllegalArgumentException.class, () -> new Pilha<>(0));
    }
}
