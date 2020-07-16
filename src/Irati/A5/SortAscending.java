package Irati.A5;
import java.util.*;

import java.util.Comparator;

public class SortAscending  implements Comparator<Rectangular> {
    public int compare(Rectangular a, Rectangular b){
        return a.getArea() - b.getArea();
    }
}
