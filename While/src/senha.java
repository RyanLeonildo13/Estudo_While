import java.util.Scanner;

public class senha {
    public static void main(String []argr){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha:");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Acesso Negado!");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido!");
        sc.close();
    }
}
