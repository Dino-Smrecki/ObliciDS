package hr.obskc.oblicids;

import java.util.Objects;

public class Krug extends Oblik{
    private double polumjer;
    
     public Krug(String ime, double polumjer) {
        super(ime);
        this.polumjer=polumjer;
        
        if(polumjer<=0)
        {
            throw new IllegalArgumentException("Polumjer mora biti veći od nule");
        }
    }
     
    public double promjer(){
        return polumjer*2;
    }

    @Override
    public double opseg() {
        return polumjer*2*3.14;
    }
     
     @Override
    public double povrsina() {
        return polumjer*polumjer*3.14;
    }
     
     @Override
    public String toString() {
        return "Krug[naziv="+super.toString()+", r="+polumjer+", d="+promjer()+"]";
    } 
    
    @Override
    public boolean equals(Object obj) {
        if (this==obj) {
            return true;
        }
        if (obj==null || getClass()!=obj.getClass()) {
            return false;
        }
        Krug other=(Krug) obj;
        return Double.compare(other.polumjer, polumjer) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(polumjer);
    }
}
