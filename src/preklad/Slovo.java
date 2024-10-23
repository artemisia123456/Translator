/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preklad;

/**
 *
 * @author MSI
 */
public class Slovo {
    private int cislo;
    private String slovicko;
    private String jazyk;
    
    Slovo (int num, String slovicko, String language){
        cislo = num;
        this.slovicko = slovicko;
        jazyk = language;
    }

    public int getCislo() {
        return cislo;
    }

    public void setCislo(int cislo) {
        this.cislo = cislo;
    }

    public String getSlovicko() {
        return slovicko;
    }

    public void setSlovicko(String slovicko) {
        this.slovicko = slovicko;
    }

    public String getJazyk() {
        return jazyk;
    }

    public void setJazyk(String jazyk) {
        this.jazyk = jazyk;
    }
    
    
    
    
}
