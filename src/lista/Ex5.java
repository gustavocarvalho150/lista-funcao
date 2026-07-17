package lista;

import java.util.Scanner;

public class Ex5 {

    static void somar(int num1, int num2){
        System.out.println("Soma: " + (num1 + num2));
    }

    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int num1 = leia.nextInt();
        System.out.print("Insira outro numero: ");
        int num2 = leia.nextInt();

        somar(num1, num2);
    }
}
