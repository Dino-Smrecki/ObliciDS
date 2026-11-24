package hr.obskc.oblicids;

public class ObliciDS {

    public static void main(String[] args) {
        System.out.println("Oblici:");
        
        Oblik[] skup={
            new Krug("Kotač", 22.2),
            new Krug("Tacna", 13.4),
            new Pravokutnik("Stolnjak", 102, 33.5),
            new Trokut("Miroslav", 3.4, 6.4, 4.3),
            new Kvadrat("Pločica", 32, 32)
        };
        
        for (Oblik Oblik:skup) {
        System.out.println(Oblik.summary());
        }
        
         }
    
    }
