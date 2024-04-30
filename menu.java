import java.util.Scanner;
import java.nio.file.Path;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class menu extends ID{
public  static void  Menu (String []args){
   
    Path path = Path.of("C:\\Java projeto\\events.data");
    ID id = new ID();
    Scanner scanner = new Scanner(System.in);

}

       
        public  void exibirMenuInicial() {
            Path path = Path.of("C:\\Java projeto\\events.data");
    ID id = new ID();
    Scanner scanner = new Scanner(System.in);
           
            System.out.println("***************************************");
            System.out.println("*                                     *");
            System.out.println("*     Olá, bem-vindo ao menu de       *");
            System.out.println("*             compra!                 *");
            System.out.println("*                                     *");
            // Bordas inferiores
            System.out.println("* Já tem cadastro em nossos sistemas? *");
            System.out.println("***************************************");
            System.out.println("Ops parece que você não tem login \n");
     
       
        System.out.println("Digite o seu e-mail" );
        String email = scanner.nextLine();
            id.setEmail(email);
        System.out.println("Digite o seu nome" );
       
        String nome = scanner.nextLine();

            id.setNome(nome);
        System.out.println("Digite a sua idade" );
        int idade = scanner.nextInt();
        id.setIdade(idade);
         
        boolean sair = false ;
        System.out.println("faça uma escolha para acessar os cadastros agora \n");
        System.out.println("se deseja sair digite a opção 5 \n");
       
do{
    System.out.println("***************************************");
    System.out.println("*                                     *");
    System.out.println("*     Olá, bem-vindo ao menu de       *");
    System.out.println("*             compra!                 *");
    System.out.println("*                                     *");
    System.out.println("* 1- Salvar evento                    *");
    System.out.println("* 2- Apagar evento salvo              *");
    System.out.println("* 3- Dados cadastrados                *");
    System.out.println("* 4- Ver Eventos Cadastrados          *");
    System.out.println("***************************************");
    int escolha  = scanner.nextInt();
        switch (escolha) {
            case 1:
                try {
            // Abrindo o arquivo para escrita
            FileWriter fileWriter = new FileWriter("events.data", true); // O parâmetro true indica que iremos acrescentar ao arquivo
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Solicitar os dados ao usuário
            System.out.println(" Solicitar os dados ao usuário do evento..");
            System.out.println("Proseguindo com os dados... \n \n:");
             System.out.println("Na categoria cadastros temos as opçoes \n Casamento \n Eventos \n Festas \n Clubes \n Vigílias \n Workshops ");       
                    System.out.println("Digite a categoria que deseja cadastrar o evento");
                    scanner.nextLine();
                    String Categoria = scanner.nextLine();
            System.out.println("Digite o Tamanho do show:");
            int tamanho = scanner.nextInt();

            System.out.println("Digite valor do ingresso:");
            double valor = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Digite o horário de incio do show");
            double horario1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Digite o horário de fim do show");
            double horario2 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Digite o nome do evento:");
            String nome1 = scanner.nextLine();

            double ev1 = 1; //Id de identificação

            // Escrever os dados no arquivo
            printWriter.println(Categoria);
            printWriter.println(nome1);
            printWriter.println(tamanho);
            printWriter.println(valor);
            printWriter.println(horario1);
            printWriter.println(horario2);
            printWriter.println(ev1);        
            // Fechar o arquivo
            printWriter.close();
            fileWriter.close();
            System.out.println("Os dados foram armazenados no arquivo.");
                    
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }            
        boolean Segundo_evento = false;
        System.out.println("Deseja cadastrar mais um evento? \n Digite sim para true ou não para false \n (true/false)");
            Segundo_evento = scanner.nextBoolean();        
        if(Segundo_evento = true){
                    try {
                        // Abrindo o arquivo para escrita
                        FileWriter fileWriter = new FileWriter("events.data", true); // O parâmetro true indica que iremos acrescentar ao arquivo
                        PrintWriter printWriter = new PrintWriter(fileWriter);
                        System.out.println("Digite a categoria que deseja cadastrar o evento");
                        scanner.nextLine();
                        String Categoria = scanner.nextLine();
            System.out.println("Digite o Tamanho do show:");
            int tamanho2 = scanner.nextInt();

            System.out.println("Digite valor do ingresso:");
            double valor2 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Digite o horário de incio do show");
            double horario3 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Digite o horário de fim do show");
            double horario4 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Digite o nome do evento:");
            String nome3 = scanner.nextLine();

            double ev2 = 2; //Id de identificação

            // Escrever os dados no arquivo
            printWriter.println(Categoria);
            printWriter.println(nome3);
            printWriter.println(tamanho2);
            printWriter.println(valor2);
            printWriter.println(horario3);
            printWriter.println(horario4);
            printWriter.println(ev2);        
            // Fechar o arquivo
            printWriter.close();
            fileWriter.close();
                    } catch (IOException e) {
                        System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
                    }            
                }
             break;
            case 2:
            String events = "events.data";
            
            boolean a;
            System.out.println("Apagar dados salvos? (True/False)");

            scanner.nextLine();


            if (a = true) {
               
                try {
                    
                    // Abrindo o arquivo para escrita (o parâmetro false indica que o arquivo será substituído)
                    FileWriter fileWriter = new FileWriter(events);
                    
                    // Fechar o arquivo (apenas para garantir que os dados sejam gravados no disco)
                   
                    fileWriter.close();
        
                    System.out.println("Conteúdo do arquivo foi apagado com sucesso.");
                } catch (IOException e) {
                    System.out.println("Erro ao limpar o arquivo: " + e.getMessage());
                }
            }
                else{
                    a = false;
                    System.out.println("Arquivo inexistente");
                }
             break;
            case 3:           
        System.out.println("Dados cadastrados!" );
        System.out.println("Nome:" + nome );
        System.out.println("email:" + email);
        System.out.println("idade:" + idade);
             break;
                case 4:
                String events2 = "events.data";
                try {
            // Abrir o arquivo para leitura
            FileReader fileReader = new FileReader(events2);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Ler e imprimir cada linha do arquivo
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

            // Fechar o leitor
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
            break;

            case 5:
            System.out.println("Você escolheu sair.");
            sair = true;
             break;
        
            default:
            System.out.println("Opção inválida.");
             break;
        }
    } while(!sair);


    scanner.close();

    }
    }