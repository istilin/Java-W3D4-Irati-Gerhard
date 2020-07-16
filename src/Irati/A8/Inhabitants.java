package Irati.A8;

public class Inhabitants {
    public int nb_year(double p0, double percent, int aug, int p){
        int time = 0;
        percent /= 100;
        while (p0<p){
            p0 = p0 + p0*percent + aug;
            time++;
        }
        return time;
    }
}
