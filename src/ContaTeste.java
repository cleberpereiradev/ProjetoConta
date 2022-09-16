import java.util.Scanner;
public class ContaTeste {
    static Conta cc = new Conta();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;


        do{
            mostrarOpcoes();
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1:
                    execSacar();
                    break;
                case 2:
                    execDepositar();
                    break;
                case 3:
                    execConsultar();
                    break;
                case 4:
                    execCadastrar();
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opcao != 9);
    }

        public static void execSacar(double valor){
            System.out.println("Digite valor a ser sacado: ");
            sc.nextDouble(valor);

            cc.sacar(valor);
            if(cc.sacar == true){
                System.out.println("Saque realizado");
            }else{
                System.out.println("Saque não realizado");
            }
        }
        public static void execConsultar(){
            cc.imprimir();
        }
        public static void execCadastrar(){

        }
        public static void execDepositar(double valor){
            System.out.println("Digite valor a ser depositado: ");
            sc.nextDouble(valor);
        }

        public static void mostrarOpcoes(){
            System.out.println("Operações");
            System.out.println("1- Sacar");
            System.out.println("2- Depositar");
            System.out.println("3- Consultar dados");
            System.out.println("4- Cadastrar novo cliente");
            System.out.println("9- Sair");
            System.out.println("Escolha a operação desejada: ");
        }
    }

