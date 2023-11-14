package AulaDeCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet {
    public static void main(String[] args) {
        // Criando Set para armazenar números inteiros
        Set<Integer> numerosSet = new HashSet<>();

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 valores inteiros não repetidos:");
        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            numerosSet.add(numero);
        }

        // Saída: Listar dados do Set usando Iterator
        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = numerosSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
