package Irati.A5;

public class Rectangular {
    private int width;
    private int height;

    public Rectangular(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return this.width * this.height;
    }
}
