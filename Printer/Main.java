public class Main {
    public static void main(String[] args) {
        Printer p = new Printer(90, 0, true);
        p.printapage();
        p.printpages(10);
        p.addToner(5);
        p.addToner(7);
    }
}
