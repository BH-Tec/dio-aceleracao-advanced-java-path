// Challenge
// The challenge consists of an integer n, where it will be necessary to calculate the difference between the product and the sum of its digits.

// Input
// • To find the product of the value, the digits must be multiplied.

// • The sum, just add the digits.

// • For the difference, it is necessary to subtract the final result from the two values.

// Output
// The output should return the final value of the difference between the product and the sum of the digits.

import java.util.Arrays;
import java.util.Scanner;

public class DifferenceBetweenDigits {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero = scan.nextInt();

    String numeroEmString = String.valueOf(numero);
    String[] split = numeroEmString.split("");

    int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

    int produto = 1;
    int soma = 0;
    int resultado = 0;
    
    for (int number : ints){
      produto*= number;
      soma += number;
    }
    System.out.println(produto - soma);
  }
}