package Irati.A6;

public class Main {
    public static void main(String[] args) {
        String talk = "blabla balblabal Ibiza, blablabla ibiza, blablabla IBIZA!!!";
        System.out.println(talk);
        Speech speech = new Speech(talk);
        System.out.println(speech.calmString());
    }
}
