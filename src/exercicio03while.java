public class exercicio03while { public static void main(String[] args) {
    

    //Utilizando (While), construir um programa que apresente todos os valores numéricos divisíveis por 4
    // e menores que 200. Sugestão: a variável que controla o contador do laço deve ser iniciada com valor 1.


int numero = 1; // Inicializamos a variável de controle do contador

        while (numero < 200) {
            if (numero % 4 == 0) {
                System.out.println(numero); // Imprimimos o número
            }
            numero++; // Incrementamos o contador
        }
    }
}



