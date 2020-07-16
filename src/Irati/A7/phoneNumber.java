package Irati.A7;

public class phoneNumber {
    private String number;
    public phoneNumber(String number){
        this.number = number;
    }
    public String maskify(){
        String masked = "";
        for (int i = 0; i<this.number.length(); i++){
            if (i<this.number.length()-4){
                masked += "#";
            }
            else {
                masked += this.number.charAt(i);
            }
        }
        return masked;
    }

}
