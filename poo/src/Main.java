//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automovil a1 = new Automovil("Suzuki", "T400", Color.AMARILLO, 12);
        System.out.println("a1(" + Automovil.getId() + "): " + a1.toString());
        Automovil a2 = new Automovil("Toyota", "Hilux", Color.ROJO, 50);
        System.out.println("a2(" + Automovil.getId() + "): " + a2.toString());
        Automovil a3 = new Automovil("Bolswagen", "bocho", Color.AZUL, 30);
        System.out.println("a3(" + Automovil.getId() + "): " + a3.toString());


    }
}