package Irati.A5;
import java.util.*;

import java.util.Comparator;

public class SortDescending  implements Comparator<Rectangular> {
    public int compare(Rectangular a, Rectangular b){
        return b.getArea() - a.getArea();
    }
}