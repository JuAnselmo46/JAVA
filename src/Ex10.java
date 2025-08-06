import java.util.ArrayList;
import java.util.Scanner;

public class Ex10{
    public static void main(String[] args){
        ArrayList<String> tasklist = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        int option;

        do{
            System.out.println("Bem vindo a sua lista de tarefas!\n 1) adicionar uma tarefa \n 2) Remover uma tarefa \n 3) visualizar a lista de tarefas \n 4) fechar programa");
            option = read.nextInt();

            //nota mental: limpar o Scanner após terminar os cases, caso o contratrio vai pular os pedidos dos cases
            read.nextLine();


            switch(option){
                case 1:
                    System.out.println("Por favor, adicione sua proxima tarefa: ");
                    String task = read.nextLine().toLowerCase();
                    tasklist.add(task);
                    break;
                case 2:
                    System.out.println("Por favor, remova a tarefa: ");
                    String removertask= read.nextLine().toLowerCase();
                    if(tasklist.remove(removertask)){
                        System.out.println("tarefa removida com sucesso");
                    } else {
                        System.out.println("tarefa não encontrada.");
                    }
                    break;
                case 3:
                    for(String list : tasklist){
                        System.out.println(list);
                    }
                    break;
            }
        }while(option != 4);


    }
}