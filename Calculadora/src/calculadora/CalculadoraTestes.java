package calculadora;

public class CalculadoraTestes {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        //Cenário de teste 1: Soma de dois valores
        int soma = calc.somar(3, 7);
        System.out.println(soma);

        //Cenário de teste 2: Soma de dois valores sendo um zero
        soma = calc.somar(3, 0);
        System.out.println(soma);

        //Cenário de teste 3: Soma de dois valores sendo que ambos são zeros
        soma = calc.somar(0, 0);
        System.out.println(soma);

        //Cenário de teste 4:Soma de dois valores sendo um negativo
        soma = calc.somar(3, -1);
        System.out.println(soma);

        //Cenário de teste 5: Subtração de dois valores
        int subtrair = calc.subtrair(3, 7);
        System.out.println(subtrair);

        //Cenário de teste 6: Subtração de dois valores sendo um zero
        subtrair = calc.subtrair(3, 0);
        System.out.println(subtrair);

        //Cenário de teste 7: Subtração de dois valores sendo que ambos são zeros
        subtrair = calc.subtrair(0, 0);
        System.out.println(subtrair);

        //Cenário de teste 8:Subtração de dois valores sendo um negativo
        subtrair = calc.subtrair(3, -1);
        System.out.println(subtrair);

        //Cenário de teste 9: Divisão de dois valores
        float dividir = calc.dividir(3, 7);
        System.out.println(dividir);

        //Cenário de teste 10: Divisão de dois valores sendo um zero
        dividir = calc.dividir(3, 0);
        System.out.println(dividir);

        //Cenário de teste 11: Divisão de dois valores sendo que ambos são zeros
        dividir = calc.dividir(0, 0);
        System.out.println(dividir);

        //Cenário de teste 12: Divisão de dois valores sendo um negativo
        dividir = calc.dividir(3, -1);
        System.out.println(dividir);

        //Cenário de teste 13: Multiplicação de dois valores
        int multiplicar = calc.multiplicar(3, 7);
        System.out.println(multiplicar);

        //Cenário de teste 14: Multiplicação de dois valores sendo um zero
        multiplicar = calc.multiplicar(3, 0);
        System.out.println(multiplicar);

        //Cenário de teste 15: Multiplicação de dois valores sendo que ambos são zeros
        multiplicar = calc.multiplicar(0, 0);
        System.out.println(multiplicar);

        //Cenário de teste 16: Multiplicação de dois valores sendo um negativo
        multiplicar = calc.multiplicar(3, -1);
        System.out.println(multiplicar);
    }

}
