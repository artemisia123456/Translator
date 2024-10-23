/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preklad;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class Slovnik {

    private String nazovjazyka;
    private ArrayList<Slovo> kontajnerslov = new ArrayList<Slovo>();

    Slovnik(String typjazyka) {
        nazovjazyka = typjazyka;
        
    }
    Slovnik(String typjazyka, ArrayList<Slovo> kontajner) {
        nazovjazyka = typjazyka;
        kontajnerslov= kontajner;
        
    }

    public boolean vlozSlovo(Slovo vlozslovo) {
        if (vlozslovo.getJazyk().equals(nazovjazyka)) {
            kontajnerslov.add(vlozslovo);
            return true;
        } else {
            return false;
        }
    }

    public int cisSlova(String vlozslovo) {
        for (Slovo slovo : kontajnerslov) {
            if (vlozslovo.equals(slovo.getSlovicko())) {
                return slovo.getCislo();
            }
        }
        return -1;

    }

    public String slovicko(int id) {
        String S = "";
        for (Slovo slovo : kontajnerslov) {
            if (id == slovo.getCislo()) {
                if (!(S.isBlank())) {
                    S += "/";
                }
                S += slovo.getSlovicko();
            }
        }
        if (S.isBlank()) {
            return null;
        } else {
            return S;
        }
    }

}
