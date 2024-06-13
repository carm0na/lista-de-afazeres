import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas {

    ArrayList<String> aFazer = new ArrayList<>();
    ArrayList<String> tarefasConcluidas = new ArrayList<>();

    //Metodo para o caso 1 do menu
    public void adicionarTarefa() {
        Scanner input = new Scanner(System.in);
        String t1 = input.nextLine();
        aFazer.add(t1);
        System.out.println("Tarefa Adicionada!");

    }

    //Método para o caso 2 do menu
    public void mostrarLista() {
            System.out.println(aFazer);
    }

    //Método para o caso 3 do menu
    public void concluirTarefa() {
        String ultimaTarefa = aFazer.getLast();
        tarefasConcluidas.add(ultimaTarefa);
        aFazer.remove(aFazer.removeLast());
        System.out.println("Tarefa(s) Concluida(s): ");
        System.out.println(tarefasConcluidas);
    }

    public void desfazerTarefa() {
        String ultimaDestarefa = tarefasConcluidas.getLast();
        aFazer.add(ultimaDestarefa);
        tarefasConcluidas.removeLast();
        System.out.println("Tarefa novamente adicionada às suas pendências");

    }
}