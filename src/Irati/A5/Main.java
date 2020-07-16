package Irati.A5;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Rectangular[] rectangles = {new Rectangular(23, 45), new Rectangular(13, 55), new Rectangular(10, 12), new Rectangular(80, 90)};
        for( Rectangular rectangle : rectangles){
            System.out.println(rectangle.getArea());
        }
        Arrays.sort(rectangles, new SortAscending());
        for( Rectangular rectangle : rectangles){
            System.out.println(rectangle.getArea());
        }
        Arrays.sort(rectangles, new SortDescending());
        for( Rectangular rectangle : rectangles){
            System.out.println(rectangle.getArea());
        }
    }
}
