/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preklad;

/**
 *
 * @author MSI
 */
public class Prekladac {

    private final Slovnik zdroj;
    private final Slovnik ciel;
    
    
    Prekladac (Slovnik zdroj, Slovnik ciel){
        this.zdroj = zdroj;
        this.ciel = ciel;
        
    }
    public String prekladSlova (String nejakeSlovo){
        int id = zdroj.cisSlova(nejakeSlovo);
        if (id ==-1){
            return "????";
        }
        if(ciel.slovicko(id) == null){
            return "????";
        }
        return ciel.slovicko(id);
    }
    public String[] prekladVety (String[] nejakaVeta){
        String [] prelozenaveta = new String[nejakaVeta.length];
        int i =0;
        for (String string : nejakaVeta) {
            prelozenaveta [i] = prekladSlova (string);
            i++;
            
        }return prelozenaveta;
    }
    
}
