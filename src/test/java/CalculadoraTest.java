package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    // Testes positivos (10)
    @Test void testSomarPositivo() { assertEquals(5, calc.somar(2, 3)); }
    @Test void testSubtrairPositivo() { assertEquals(1, calc.subtrair(3, 2)); }
    @Test void testMultiplicarPositivo() { assertEquals(6, calc.multiplicar(2, 3)); }
    @Test void testDividirPositivo() { assertEquals(2, calc.dividir(6, 3)); }
    @Test void testEhParTrue() { assertTrue(calc.ehPar(4)); }
    @Test void testEhParFalse() { assertFalse(calc.ehPar(5)); }
    @Test void testPotenciaPositiva() { assertEquals(8, calc.potencia(2, 3)); }
    @Test void testSomarZero() { assertEquals(7, calc.somar(7, 0)); }
    @Test void testSubtrairZero() { assertEquals(7, calc.subtrair(7, 0)); }
    @Test void testMultiplicarZero() { assertEquals(0, calc.multiplicar(7, 0)); }

    // Testes negativos (10)
    @Test void testDivisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(5, 0));
    }
    @Test void testResultadoNegativoSubtracao() { assertEquals(-1, calc.subtrair(2, 3)); }
    @Test void testMultiplicarNegativo() { assertEquals(-6, calc.multiplicar(-2, 3)); }
    @Test void testSomarNegativo() { assertEquals(-5, calc.somar(-2, -3)); }
    @Test void testPotenciaNegativa() { assertEquals(0, calc.potencia(2, -3)); }
    @Test void testDividirNegativo() { assertEquals(-2, calc.dividir(-6, 3)); }
    @Test void testDividirDoisNegativos() { assertEquals(2, calc.dividir(-6, -3)); }
    @Test void testSomarGrande() { assertEquals(2000000000, calc.somar(1000000000, 1000000000)); }
    @Test void testMultiplicarGrande() { assertEquals(1000000, calc.multiplicar(1000, 1000)); }
    @Test void testPotenciaZeroExpoente() { assertEquals(1, calc.potencia(10, 0)); }
}
