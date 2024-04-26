public class exercicio01while {
    public static void main(String[] args) {
      int contador = 1;
      int soma = 0;
      while (contador <= 100) {
        soma = soma + contador;
        System.out.println(soma);
        contador = contador + 1;
      }
    }
  }