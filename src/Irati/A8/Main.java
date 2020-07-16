package Irati.A8;

public class Main {
    public static void main(String[] args) {
        Inhabitants test = new Inhabitants();
        System.out.println(test.nb_year(1500, 5, 100, 5000));
        System.out.println(test.nb_year(1500000, 2.5, 10000, 2000000));
    }
}
