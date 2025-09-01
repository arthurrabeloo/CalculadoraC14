package org.example;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class FilaTest {

    @Test
    void testEnfileirarERemover() {
        Fila<Integer> fila = new Fila<>(3);
        fila.enfileirar(10);
        fila.enfileirar(20);
        assertEquals(10, fila.removerFila());
        assertEquals(20, fila.removerFila());
    }

    @Test
    void testSize() {
        Fila<String> fila = new Fila<>(3);
        fila.enfileirar("A");
        fila.enfileirar("B");
        assertEquals(2, fila.size());
    }

    @Test
    void testFilaVaziaInicialmente() {
        Fila<Integer> fila = new Fila<>(2);
        assertTrue(fila.filaVazia());
    }

    @Test
    void testFilaNaoVaziaDepoisDeEnfileirar() {
        Fila<Integer> fila = new Fila<>(2);
        fila.enfileirar(5);
        assertFalse(fila.filaVazia());
    }

    @Test
    void testRemoverFilaVaziaLancaExcecao() {
        Fila<Integer> fila = new Fila<>(2);
        assertThrows(NoSuchElementException.class, fila::removerFila);
    }

    @Test
    void testEnfileirarFilaCheiaLancaExcecao() {
        Fila<Integer> fila = new Fila<>(2);
        fila.enfileirar(1);
        fila.enfileirar(2);
        assertThrows(IllegalStateException.class, () -> fila.enfileirar(3));
    }

    @Test
    void testFIFO() {
        Fila<String> fila = new Fila<>(3);
        fila.enfileirar("primeiro");
        fila.enfileirar("segundo");
        fila.enfileirar("terceiro");
        assertEquals("primeiro", fila.removerFila());
        assertEquals("segundo", fila.removerFila());
        assertEquals("terceiro", fila.removerFila());
    }

    @Test
    void testCapacidadeInvalida() {
        assertThrows(IllegalArgumentException.class, () -> new Fila<>(0));
    }

    @Test
    void testEnfileirarRemoverCiclico() {
        Fila<Integer> fila = new Fila<>(2);
        fila.enfileirar(1);
        fila.enfileirar(2);
        assertEquals(1, fila.removerFila());
        fila.enfileirar(3);
        assertEquals(2, fila.removerFila());
        assertEquals(3, fila.removerFila());
    }

    @Test
    void testTiposDiferentes() {
        Fila<Double> fila = new Fila<>(2);
        fila.enfileirar(3.14);
        assertEquals(3.14, fila.removerFila());
    }
}
