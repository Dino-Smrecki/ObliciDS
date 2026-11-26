package hr.obskc.oblicids;

public class Pravokutnik extends Oblik {
     private double a;
      private double b;
     
    
     public Pravokutnik(String ime, double a, double b) {
        super(ime);
        this.a=a;
        this.b=b;
        
        if(a<=0 || b<=0)
        {
            throw new IllegalArgumentException("Duljine stranica moraju biti veće od nule");
        }
    }
     
     public double getA() {
         return a;
     }
     
     public boolean jeLezeci() {
        return a>b;
    }

    @Override
    public double opseg() {
        return 2*(a+b);
    }
     
     @Override
    public double povrsina() {
        return a*b;
    }
     
     @Override
    public String toString() {
        return "Pravokutnik["+super.toString()+", a="+a+", b="+b+", ležeći je?: "+jeLezeci()+"]";
    } 
}
