import java.util.Scanner;

public class Menu {
    public void menu(){
        Scanner scanner=new Scanner(System.in);
        Cuenta cuenta = new Cuenta(0.0,"Yenisleydi Benitez Martinez",234567890);
        Depositar depositar = new Depositar();
        Consultar consultar=new Consultar();
        Retirar retirar=new Retirar();
        Transferir transferir=new Transferir();
        int elegir;
        do {
            System.out.println("------- Menu Banco ------");
            System.out.println("[1]. Consultar saldo");
            System.out.println("[2]. Depositar dinero");
            System.out.println("[3]. Retirar dinero");
            System.out.println("[4]. Transferir dinero");
            System.out.println("[5]. Salir");
            elegir = scanner.nextInt();
            switch (elegir) {
                case 1 ->
                        consultar.Consultar(cuenta);
                case 2 ->
                        depositar.depositar(cuenta);
                case 3 ->
                        retirar.retirar(cuenta);
                case 4 ->
                        transferir.transferir(cuenta);
            }
        } while (elegir!=5);
    }
}
