import java.util.Scanner;
public class Main {
Package show;
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        
         //trazer a classe id aqui e show também.
            ID id = new ID();
        
        System.out.println("***************************************");
        System.out.println("*                                     *");
        System.out.println("*     Olá, bem-vindo ao menu de       *");
        System.out.println("*             compra!                 *");
        System.out.println("*                                     *");
        // Bordas inferiores
        System.out.println("* Já tem cadastro em nossos sistemas? *");
        System.out.println("***************************************");
        System.out.println("Ops parece que voce não tem login \n");

        System.out.println("Digite o seu e-mail" );
        String email = scanner.nextLine();
        id.setEmail(email);
       
        System.out.println("Digite o seu nome" );
        //chamar a classe String nome que vai receber scanner.Nextline
        String nome = scanner.nextLine();
        //assim depois que a variavel foi recebida pelo usuario, ela é enviada la pra classe ID, e armazenada na variavel dele, no caso caminho ID(CONSTRUTOR) > Nome(String varivael que recebe)
        id.setNome(nome);
       
        System.out.println("Digite a sua idade" );
        int idade = scanner.nextInt();
        id.setIdade(idade);
     
       // Sistema boolean para caso necessite sair.
        boolean sair = false;
        do{
            try {
                // Atraso de 2 segundos (2000 milissegundos)
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // Lidar com a exceção, se necessário
                e.printStackTrace();
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("***************************************");
            System.out.println("*                                     *");
            System.out.println("*     Olá, bem-vindo ao menu de       *");
            System.out.println("*             compra!                 *");
            System.out.println("*                                     *");
            // Bordas inferiores
            System.out.println("* Já tem cadastro em nossos sistemas? *");
            System.out.println("* Opções disponíveis de compra        *");
            System.out.println("* 1- Ver ingressos                    *");
            System.out.println("* 2- Cadastro de Shows                *");
            System.out.println("* 3- ver dados cadastrados            *");
            System.out.println("***************************************");
                       System.out.println("digite a opção que deseja \n");
            int escolha = scanner.nextInt();
             System.out.println("se deseja sair digite a opção 5 \n");
           
              switch (escolha) {
                  case 1:
                 System.out.println("Você escolheu ver os ingressos.");
                 break;
             case 2:
                  System.out.println("Você escolheu a opção Cadastro de shows.");
                  System.out.println("Pressione Enter para continuar...");
                  scanner.nextLine();
                  System.out.println("digite o nome do artista...");
                  scanner.nextLine();
                  System.out.println("Pressione Enter para continuar...");
                   break;
            case 3:
            System.out.println("Dados cadastrados!" );
            System.out.println("Nome:" + nome );
            System.out.println("email:" + email);
            System.out.println("idade:" + idade);
            
                   case 5:
                  System.out.println("Você escolheu sair.");
                   sair = true;
                   break;
              default:
                  System.out.println("Opção inválida.");
            }
                 } while (!sair);

        scanner.close();
    }
}   