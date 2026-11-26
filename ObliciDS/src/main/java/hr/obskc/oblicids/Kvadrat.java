package hr.obskc.oblicids;

public class Kvadrat extends Pravokutnik {

    public Kvadrat(String ime, double a) {
        super(ime, a, a);

        
        if (a <= 0) {
            throw new IllegalArgumentException("Duljina stranice mora biti veća od nule.");
        }
    }

    @Override
    public double opseg() {
        return getA() * 4;
    }

    @Override
    public double povrsina() {
        return getA() * getA();
    }

    @Override
    public String toString() {
        return "Kvadrat[naziv="+getIme()+", a=" + getA() + "]";
    }
}
