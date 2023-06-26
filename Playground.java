package com.mycompany.playground;

import java.util.Scanner;

public class Playground {
    
    public static void main(String[] args) {
        
        StringBuilder bt = new StringBuilder();
        bt.append ("""
                   Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod 
                   tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. 
                   At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd 
                   gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum 
                   dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor 
                   invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero 
                   eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no 
                   sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, 
                   consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et 
                   dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo 
                   duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est 
                   Lorem ipsum dolor sit amet.   
                 
                   Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie 
                   consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan 
                   et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis 
                   dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, consectetuer 
                   adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna 
                   aliquam erat volutpat.""")
                ;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nach welchem Wort soll gesucht werden: ");
        String search = scanner.nextLine();
        scanner.close();
 
        int counter = 0;
        for (int i = 0; i <= bt.length() - search.length(); i++) {
            String s = bt.substring(i, i + search.length());
            if (search.equals(s)) {
                
                counter++;
                
        int j = i;
        int count = j;
        for (j = 0; j <= bt.indexOf(search) - search.indexOf(search); j++) {
            String st = bt.substring(j);
            st = bt.substring(j, j + search.length());
            if (search.equals(bt.indexOf(search, count))) {

            }
                count++;       
        }
 
        System.out.println("Das Wort \"" + search + "\" wurde zum " + counter + ". mal gefunden an Indexposition: "+ count);
                
            }
        } System.out.println("Textlänge: " + bt.length()+" Zeichen.");
        
    }
}
