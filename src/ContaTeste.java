import java.util.Scanner;
public class ContaTeste {
    static Conta cc = new Conta();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;


        do{
            mostrarOpcoes();
            opcao = sc.nextInt();
            sc.nextLine();
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

        public static void execSacar(){
            double valor;
            System.out.println("Digite valor a ser sacado: ");
            valor = sc.nextDouble();
            if(cc.sacar(valor) == 1){
                System.out.println("Saque realizado");
            }else{
                System.out.println("Saque não realizado");
            }
        }
        public static void execConsultar(){
            System.out.println("Dados do cliente");
            cc.imprimir();
        }
        public static void execCadastrar(){
            Conta contasCorrentes = new Conta();
            String conta, agencia, nomeCliente;
            double saldo;

            System.out.println("Digite o número da conta: ");
            cc.conta = sc.nextLine();
            System.out.println("Digite o número da agência: ");
            cc.agencia = sc.nextLine();
            System.out.println("Digite o nome do cliente: ");
            cc.nomeCliente = sc.nextLine();

        }
        public static void execDepositar(){
            double valor;
            System.out.println("Digite valor a ser depositado: ");
            valor = sc.nextDouble();
            cc.depositar(valor);
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

