import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Digite um valor: ");
            int numero1 = s.nextInt();

            System.out.println(numero1);

        } catch (Exception ex) {
            // TODO: handle exception
            System.out.println("Erro: Valor não é um número inteiro");
        }

    }
}
