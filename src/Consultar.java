public class Consultar {
    public void Consultar(Cuenta cuenta){
        String nombre = cuenta.getNombre();
        double saldo = cuenta.getCantidad();
        System.out.println("--------------------------------------------------");
        System.out.println("            "+nombre);
        System.out.println("      El saldo con el que cuenta es de:"+saldo);
        System.out.println("--------------------------------------------------");

    }
}
