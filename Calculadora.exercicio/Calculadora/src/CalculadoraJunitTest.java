import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CalculadoraJunitTest {

    //TESTE REALIZADO COM VISUAL STUDIO CODE

    // Testes para a operação de soma
    @Test
    public void testSoma() {
        Calculadora calc = new Calculadora();
        
        // Testando a soma de dois valores
        assertEquals(10, calc.Somar(3, 7));
        
        // Testando a soma com um dos valores sendo zero
        assertEquals(3, calc.Somar(3, 0));
        
        // Testando a soma de dois zeros
        assertEquals(0, calc.Somar(0, 0));
        
        // Testando a soma com um valor negativo
        assertEquals(2, calc.Somar(3, -1));
        
        // Testando a soma de dois valores negativos
        assertEquals(-4, calc.Somar(-3, -1));
    }
    
    // Testes para a operação de subtração
    @Test
    public void testSubtracao() {
        Calculadora calc = new Calculadora();
        
        // Testando a subtração de dois valores
        assertEquals(4, calc.Subtrair(5, 1));
        
        // Testando a subtração com um dos valores sendo zero
        assertEquals(5, calc.Subtrair(5, 0));
        
        // Testando a subtração de dois zeros
        assertEquals(0, calc.Subtrair(0, 0));
        
        // Testando a subtração com um valor negativo
        assertEquals(8, calc.Subtrair(5, -3));
        
        // Testando a subtração de dois valores negativos
        assertEquals(-2, calc.Subtrair(-5, -3));
    }
    
    // Testes para a operação de multiplicação
    @Test
    public void testMultiplicacao() {
        Calculadora calc = new Calculadora();
        
        // Testando a multiplicação de dois valores
        assertEquals(20, calc.Multiplicar(5, 4));
        
        // Testando a multiplicação por zero
        assertEquals(0, calc.Multiplicar(6, 0));
        
        // Testando a multiplicação de zero por um valor
        assertEquals(0, calc.Multiplicar(0, 8));
        
        // Testando a multiplicação de dois valores negativos
        assertEquals(12, calc.Multiplicar(-4, -3));
        
        // Testando a multiplicação de um valor negativo por um valor positivo
        assertEquals(-12, calc.Multiplicar(-2, 6));
    }
    
    // Testes para a operação de divisão
    @Test
    public void testDivisao() {
        Calculadora calc = new Calculadora();
        
        // Testando a divisão de dois valores inteiros
        assertEquals(5.0, calc.Dividir(10, 2), 0.0001); // fornecendo uma margem de erro de 0.0001
        
        // Testando a divisão de um valor negativo por um valor positivo
        assertEquals(-5.0, calc.Dividir(-15, 3), 0.0001); // fornecendo uma margem de erro de 0.0001
        
        // Testando a divisão de um valor positivo por um valor negativo
        assertEquals(-4.0, calc.Dividir(20, -5), 0.0001); // fornecendo uma margem de erro de 0.0001
        
        // Testando a divisão de dois valores negativos
        assertEquals(4.0, calc.Dividir(-12, -3), 0.0001); // fornecendo uma margem de erro de 0.0001
        
        // Tentativa de dividir por zero, sera um erro esperado
        assertThrows(ArithmeticException.class, () -> {
            calc.Dividir(10, 0); 
        });
    }
}
