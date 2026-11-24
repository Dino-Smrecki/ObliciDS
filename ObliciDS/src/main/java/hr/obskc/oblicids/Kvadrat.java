package hr.obskc.oblicids;

public class Kvadrat extends Pravokutnik{
    
     public Kvadrat(String ime, double a, double b) {
        super(ime, a, b);
        
        if(a!=b){
            throw new IllegalArgumentException("Visina i širina kvadrata moraju biti iste");
        }
        if(a<=0 || b<=0)
        {
            throw new IllegalArgumentException("Duljine stranica moraju biti veće od nule");
        }
    }

    @Override
    public double opseg() {
        return getA()*4;
    }
     
     @Override
    public double povrsina() {
        return getA()*getA();
    }
     
     @Override
    public String toString() {
        return "Kvadrat[naziv="+super.toString()+", a="+getA()+"]";
}
}