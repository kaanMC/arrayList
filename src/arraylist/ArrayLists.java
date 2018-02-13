/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;
import java.util.ArrayList;

/**
 *
 * @author mucis
 */
public class ArrayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> names = new ArrayList<String>();
        names.add("test");
        names.add("test2");
        names.add("Git");
        System.out.println(names.get(2));
        
    }
    
}
