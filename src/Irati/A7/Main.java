package Irati.A7;

public class Main {
    public static void main(String[] args) {
        phoneNumber num1 = new phoneNumber("153667778245");
        phoneNumber num2 = new phoneNumber("645698745977");
        phoneNumber num3 = new phoneNumber("2");
        phoneNumber num4 = new phoneNumber("");
        System.out.println(num1.maskify());
        System.out.println(num2.maskify());
        System.out.println(num3.maskify());
        System.out.println(num4.maskify());

    }
}
