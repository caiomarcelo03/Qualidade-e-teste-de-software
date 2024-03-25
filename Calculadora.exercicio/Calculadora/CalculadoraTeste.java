/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

public class CalculadoraTeste {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        //Soma
        System.out.println("Soma:");
        //Cenario de teste 1: Soma de dois valores
        int soma = calc.Somar(3, 7);
        System.out.println(soma);
        
        //Cenario de teste 2: Soma de dois valores sendo um zero
        soma = calc.Somar(3, 0);
        System.out.println(soma);
        
        //Cenario de teste 3: Soma de dois valores sendo ambos sao zero
        soma = calc.Somar(0,0);
        System.out.println(soma);
        
        //Cenario de teste 4: Soma de dois valores sendo um negativo
        soma = calc.Somar(3, -1);
        System.out.println(soma);
        
        //Cenario de teste 5: Soma de dois valores sendo ambos sao negativo
        soma = calc.Somar(-3, -1);
        System.out.println(soma);
        
           //Subtração
           System.out.println("\nSubtração:");
           //Cenario de teste 1: Subtração de dois valores 
           int sub = calc.Subtrair(5, 1);
           System.out.println(sub);
        
           //Cenario de teste 2: Subtração de dois valores sendo um zero
           sub = calc.Subtrair(5, 0);
           System.out.println(sub);
           
           //Cenario de teste 3: Subtração de dois valores zero
           sub = calc.Subtrair(0, 0);
           System.out.println(sub);
           
           //Cenario de teste 4: Subtração de dois valores sendo um zero
           sub = calc.Subtrair(5, -3);
           System.out.println(sub);
           
           //Cenario de teste 5: Subtração de dois valores sendo um zero
           sub = calc.Subtrair(-5, -3);
           System.out.println(sub);
           
            //multiplicação
            System.out.println("\nMultiplicação:");
            // Cenário de teste 1: Multiplicação de dois valores
            int multiplicacao = calc.Multiplicar(5, 4);
            System.out.println(multiplicacao);
        
            // Cenário de teste 2: Multiplicação de um valor por zero
            multiplicacao = calc.Multiplicar(6, 0);
            System.out.println(multiplicacao);
        
            // Cenário de teste 3: Multiplicação de zero por um valor
            multiplicacao = calc.Multiplicar(0, 8);
            System.out.println(multiplicacao);
        
            // Cenário de teste 4: Multiplicação de dois valores negativos
            multiplicacao = calc.Multiplicar(-4, -3);
            System.out.println(multiplicacao);
        
            // Cenário de teste 5: Multiplicação de dois valore com um valor negativo e um valor positivo
            multiplicacao = calc.Multiplicar(-2, 6);
            System.out.println(multiplicacao);

                //divisão
                System.out.println("\nDivisão:");
                // Cenário de teste 1: Divisão de dois valores inteiros
                double divisao = calc.Dividir(10, 2);
                System.out.println(divisao);
        
                // Cenário de teste 2: Divisão de um valor negativo por um valor positivo
                divisao = calc.Dividir(-15, 3);
                System.out.println(divisao);
        
                // Cenário de teste 3: Divisão de um valor positivo por um valor negativo
                divisao = calc.Dividir(20, -5);
                System.out.println(divisao);
        
                // Cenário de teste 4: Divisão de dois valores negativos
                divisao = calc.Dividir(-12, -3);
                System.out.println(divisao);
        
                // Cenário de teste 5: Divisão de dois valores sendo um zero (erro esperado)
                divisao = calc.Dividir(10, 0);
                System.out.println(divisao);
    }
}
