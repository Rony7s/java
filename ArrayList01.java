//Rony Ahmmed BDU-ICTE

import java.util.ArrayList;
public class ArrayList01{
    public static void main(String[] args){
        ArrayList<String>name = new <String>ArrayList();
        name.add("Rony");
        name.add("Tushar");
        name.add("Mowdut");
        System.out.println(name);
        
        name.add(1,"Sojib");
        System.out.println(name);
        
        String name_single = name.get(2);
        System.out.println(name_single);
        
        name.set(2,"Labib");
        System.out.println(name);
        
        name.remove(2);
        System.out.println(name);
        
        name.remove(2);
        System.out.println(name);
        
        name.clear();
        System.out.println(name);
/*
[Rony, Tushar, Mowdut]
[Rony, Sojib, Tushar, Mowdut]
Tushar
[Rony, Sojib, Labib, Mowdut]
[Rony, Sojib, Mowdut]
[Rony, Sojib]
[]

*/
        
    }
} 
