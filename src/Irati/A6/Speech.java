package Irati.A6;

public class Speech {
    private String talk;
    public Speech(String talk){
        this.talk = talk;
    }
    public String calmString(){
        if (this.talk.contains("!") || this.talk.contains("IBIZA") || this.talk.contains("Ibiza") || this.talk.contains("ibiza")){
            if (this.talk.contains("!")){
                this.talk = this.talk.replaceAll("!", "");
            }
            if (this.talk.contains("IBIZA")){
                this.talk = this.talk.replaceAll("IBIZA", "");
            }
            if (this.talk.contains("Ibiza")){
                this.talk = this.talk.replaceAll("Ibiza", "");
            }
            if (this.talk.contains("ibiza")){
                this.talk = this.talk.replaceAll("ibiza", "");
            }
        }
        return this.talk;
    }
}
