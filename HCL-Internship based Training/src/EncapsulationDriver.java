public class EncapsulationDriver {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();

        e.setNumber("1411");
        System.out.println("The number retrieved from the String: "+(e.getNumber()+124));
    }
}
