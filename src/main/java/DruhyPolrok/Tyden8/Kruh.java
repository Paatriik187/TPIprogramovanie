package DruhyPolrok.Tyden8;

public class Kruh {

    double r;
    double pi = Math.PI;

    public Kruh( double vstupnyAtribut){
        if (vstupnyAtribut>0) {
            r = vstupnyAtribut;
        }
        else{
            r=0;
        }
    }

    public double obvod(){
        return 2*pi*r;
    }
    public double obsah(){
        return pi* Math.pow(r,2);
    }

    @Override
    public String toString() {
        return "Kruh{" +
                ", r=" + r +
                ", pi=" + pi +
                '}';
    }
}