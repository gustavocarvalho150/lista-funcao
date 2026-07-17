package lista;

public class Ex2 {
    static void imprimirLinha(int quantidade){
        for (int i = 0; i < quantidade; i++) {
            System.out.print("=");
        }
    }

    static void main() {
        imprimirLinha(20);
        System.out.println("\nSEJA BEM VINDO");
        imprimirLinha(20);
    }
}
