import java.util.Scanner;

public class Transferir {
    public void transferir(Cuenta cuenta){
        Scanner scanner=new Scanner(System.in);
        double saldo = cuenta.getCantidad();
        System.out.println("Ingresa la clave interbancaria");
        int claveInterbancaria=scanner.nextInt();
        System.out.println("Ingresa el nombre de la persona a la que quieres enviar");
        String usuario=scanner.nextLine();
        scanner.nextLine();
        System.out.println("Ingrese la cantidad que desea transferir");
        double deposito=scanner.nextDouble();
        scanner.nextLine();
        if (deposito>cuenta.getCantidad()){
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("|      N O  S E  P U E D E  R E A L I Z A R  L A  T R A N S F E R E N C I A      |");
            System.out.println("----------------------------------------------------------------------------------");
        }
        else {
            cuenta.setCantidad(saldo-deposito);
            System.out.println("----------------------------------------------------");
            System.out.println("|      T R A N S F E R E N C I A  E X I T O S A     |");
            System.out.println("-----------------------------------------------------");
        }
    }
}
