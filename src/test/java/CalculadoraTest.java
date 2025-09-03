package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();
    
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

    @Test void testFalhaSomar() { assertEquals(10, calc.somar(2, 3)); } // 5 != 10
    @Test void testFalhaSubtrair() { assertEquals(5, calc.subtrair(3, 2)); } // 1 != 5
    @Test void testFalhaMultiplicar() { assertEquals(100, calc.multiplicar(2, 3)); } // 6 != 100
    @Test void testFalhaDividir() { assertEquals(5, calc.dividir(6, 3)); } // 2 != 5
    @Test void testFalhaEhPar() { assertTrue(calc.ehPar(5)); } // 5 não é par
    @Test void testFalhaEhImpar() { assertFalse(calc.ehPar(4)); } // 4 é par
    @Test void testFalhaPotencia() { assertEquals(100, calc.potencia(2, 3)); } // 8 != 100
    @Test void testFalhaSomarZero() { assertEquals(0, calc.somar(7, 0)); } // 7 != 0
    @Test void testFalhaSubtrairZero() { assertEquals(0, calc.subtrair(7, 0)); } // 7 != 0
    @Test void testFalhaMultiplicarZero() { assertEquals(7, calc.multiplicar(7, 0)); } // 0 != 7
}
