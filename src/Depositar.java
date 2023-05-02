import java.util.Scanner;

public class Depositar {

    public  void depositar(Cuenta cuenta){
        Scanner scanner=new Scanner(System.in);
        double saldo = cuenta.getCantidad();
        System.out.println("Ingrese la cantidad que desea depositar");
        double deposito=scanner.nextDouble();
        scanner.nextLine();
        cuenta.setCantidad(saldo+deposito);
        System.out.println("-----------------------------------------");
        System.out.println("|     D E P O S I T O  E X I T O S O    |");
        System.out.println("-----------------------------------------");
    }
}


