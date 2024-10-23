/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preklad;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class Program {
    public static void vypisVetu (String[] veta) {
        String v= "";
        for (int i=0; i< veta.length; i++){
            v+= veta [i] +" ";
        }
        System.out.println(v);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Slovnik EN = new Slovnik("EN");
        EN.vlozSlovo(new Slovo (68, "computer", "EN"));
        EN.vlozSlovo(new Slovo (27, "expensive", "EN"));
        EN.vlozSlovo(new Slovo (45, "is", "EN"));
        EN.vlozSlovo(new Slovo (46, "not", "EN"));
        EN.vlozSlovo(new Slovo (84, "this", "EN"));
        
        Slovnik SK = new Slovnik("SK");
        SK.vlozSlovo(new Slovo (11, "ano", "SK"));
        SK.vlozSlovo(new Slovo (27, "drahy", "SK"));
        SK.vlozSlovo(new Slovo (27, "nakladny", "SK"));
        SK.vlozSlovo(new Slovo (45, "je", "SK"));
        SK.vlozSlovo(new Slovo (68, "PC", "SK"));
        SK.vlozSlovo(new Slovo (84, "tento", "SK"));
        
        Prekladac ENSK = new Prekladac(EN, SK);
        
        String [] anjVeta = {"this", "comp","is", "expensive"};
        Program.vypisVetu(anjVeta);
        
        Program.vypisVetu (ENSK.prekladVety(anjVeta));
        
        
    }
    
    
}
