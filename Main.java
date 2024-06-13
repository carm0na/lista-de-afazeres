import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //MENU PARA INICIALIZAR APLICAÇÃO
        System.out.println("*** Lista De Afazeres ***\n");
        System.out.println("\t > Criar Nova Lista [ENTER]");

            Scanner scanner = new Scanner(System.in);
            String temLista = scanner.nextLine();

            if (temLista.isEmpty()) {
                ListaTarefas lista = new ListaTarefas();
                boolean menu = true;

                //escolha de ação do usuário
                while (menu) {
                    System.out.println("\t1- Adicionar Tarefa");
                    System.out.println("\t2 - Visualizar Lista de Tarefas Pendentes");
                    System.out.println("\t3 - Concluir Última Tarefa");
                    System.out.println("\t4 - Desfazer Tarefa Concluida");
                    System.out.println("\t5 - S A I R");
                    int input = scanner.nextInt();


                    switch (input) {
                        case 1: //adicionar tarefa
                            System.out.println("Digite a Tarefa: ");
                            lista.adicionarTarefa();
                            break;

                        case 2: // visualiza a lista
                            lista.mostrarLista();
                            break;
                        case 3: // move a ultima tarefa para uma lista de tarefas concluidas
                            lista.concluirTarefa();
                            break;
                        case 4: // move a ultima tarefa concluida para a lista de tarefas pendentes
                            lista.desfazerTarefa();
                            break;
                        case 5: // Conclui a aplicação
                            menu = false;
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    ;
                }

            } else {
                System.out.println("Opção inválida");
            };


    };


};

