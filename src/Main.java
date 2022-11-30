public class Main {

    public static void main(String[] args) {
        System.out.println("Logic Gate Simulator");

        AND myGate = new AND(true, true);
        System.out.println(myGate.getOutput());
        myGate.truthTable();

        OR testGate = new OR(false, false);
        System.out.println(testGate.getOutput());
        testGate.truthTable();
    }
}
