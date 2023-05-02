import java.util.Scanner;

public class Retirar {
    public void retirar(Cuenta cuenta){
        Scanner scanner=new Scanner(System.in);
        double saldo = cuenta.getCantidad();
        System.out.println("Ingrese la cantidad que desea depositar");
        double deposito=scanner.nextDouble();
        scanner.nextLine();
        if (deposito>cuenta.getCantidad()){
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("|      N O   S E   P U E D E   R E A L I Z A R   E L   R E T I R O     |");
            System.out.println("------------------------------------------------------------------------");
        }
        else {
            cuenta.setCantidad(saldo-deposito);
            System.out.println("---------------------------------------");
            System.out.println("|      R E T I R O  E X I T O S O     |");
            System.out.println("---------------------------------------");
        }
    }
}
