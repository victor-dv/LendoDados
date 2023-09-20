package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Criando Uma lista do tipo Contribuintes
        List<Contribuintes> list = new ArrayList<>();
        int numeroContribuintes;

        System.out.print("Digite quantos Contribuintes deseja inserir: ");
        numeroContribuintes = scanner.nextInt();

        for (int i = 1; i <= numeroContribuintes; i++){
            System.out.println("Contribuinte #" + i);
            System.out.println("Individual ou Juridico (i/j)");
            char ch = scanner.next().charAt(0);
            if (ch == 'i'){
                System.out.print("Nome: ");
                String nome = scanner.next();
                System.out.print("Renda anual: ");
                int rendaAnual = scanner.nextInt();
                System.out.print("Gasto com Saúde: ");
                int gastoSaude = scanner.nextInt();

                list.add(new Individual(nome, rendaAnual, gastoSaude));
            } else if (ch == 'j') {
                System.out.print("Nome Juridico: ");
                String nome = scanner.next();
                System.out.print("Renda anual: ");
                int rendaAnual = scanner.nextInt();
                System.out.print("Funcionarios: ");
                int funcionarios = scanner.nextInt();

                list.add(new Juridico(nome, rendaAnual, funcionarios));
            }else {
                System.out.println("Ação não reconhecida, Individual ou Juridico (i/j) ");
                ch = scanner.next().charAt(0);
            }


        }
        double soma = 0.0;
        System.out.println("");
        System.out.println("Contribuintes: ");
        for (Contribuintes contribuintes : list){
        double imposto = contribuintes.imposto();
            System.out.println(contribuintes.getNome() + ": $ "+ String.format("%.2f", imposto));
            soma += imposto;
        }
        System.out.println();
        System.out.println("Total Taxes: $" + String.format("%.2f", soma));


    }
}
