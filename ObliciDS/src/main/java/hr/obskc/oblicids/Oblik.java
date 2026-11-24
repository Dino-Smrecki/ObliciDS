package hr.obskc.oblicids;

import java.util.Objects;

public abstract class Oblik {
    private String ime;
    public abstract double povrsina();
    public abstract double opseg();
    
    
    public Oblik(String ime) {
        if (ime==null || ime.isBlank()) {
            throw new IllegalArgumentException("Ime oblika ne smije biti prazno");
            }
        this.ime=ime; 
        }
    
    public String getIme() {
            return ime;
        }
    
    @Override
    public String toString() {
        return "ime="+ ime;
    }
    
      public String summary() {
        return String.format("%s -> opseg: %.2f, površina: %.2f", this, opseg(), povrsina());
    }
    
     @Override
    public boolean equals(Object obj) {
        if (this==obj) {
            return true;
        }
        if (obj==null || getClass()!=obj.getClass()) {
            return false;
        }
        Oblik other=(Oblik) obj;
        return ime.equals((other.ime));
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime);
    }
}
