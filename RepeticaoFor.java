import java.util.Scanner;

public class Repete2For {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        int n = sc.nextInt();
        int soma = 0;
    
        for (int count = 0; count < n; count++){
            System.out.println("Digite o próximo número: ");
            int teste = sc.nextInt();
            soma = soma + teste;
        }

        System.out.println(soma);

        sc.close();

    }

}
