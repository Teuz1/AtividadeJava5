package AulaDeCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioArrayList {
    public static void main(String[] args) {
        // Criando ArrayList para armazenar cores
        ArrayList<String> cores = new ArrayList<>();

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite uma cor: ");
            String cor = scanner.nextLine();
            cores.add(cor);
        }

        // Saída: Listar todas as cores
        System.out.println("\nListar todas as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        // Saída: Ordenar as cores
        Collections.sort(cores);
        System.out.println("\nOrdenar as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }
    }
}
