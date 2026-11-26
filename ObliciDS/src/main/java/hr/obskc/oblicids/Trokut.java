package hr.obskc.oblicids;

public class Trokut extends Oblik{
    private double a;
    private double b;
    private double c;
    
     public Trokut(String ime, double a, double b, double c) {
        super(ime);
        this.a=a;
        this.b=b;
        this.c=c;
        
        if(a<=0 || b<=0 || c<=0)
        {
            throw new IllegalArgumentException("Duljine stranica moraju biti veće od nule");
        }
        
        if(c>(a+b) || b>(a+c) || a>(b+c))
        {
            throw new IllegalArgumentException ("Unesene stranice ne zadovoljavaju nejednakosti trokuta");
        }
    }
    
    @Override
    public double opseg() {
        return a+b+c;
    }
    
     @Override
    public double povrsina() {
        double s=opseg()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
     
     @Override
    public String toString() {
        return "Trokut["+super.toString()+", a="+a+", b="+b+", c="+c+"]";
    } 
}
