/**
*
* Description of the program goes here  // provide a brief description
*
* @author Jack Flaherty  
* @version 11/15/14 
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane; 

public class Lab06 {

     public static void main(String[] args) {
     String filename = JOptionPane.showInputDialog("What robot map?");
     Display.openWorld("maps/" + filename + ".map");     
     Display.setSpeed(8);
     Robot jack = new Robot();
     Robot jack2 = new Robot(1, 2, Display.EAST, Display.INFINITY);
     Robot jack3 = new Robot(1, 3, Display.EAST, Display.INFINITY);
     Robot jack4 = new Robot(1, 4, Display.EAST, Display.INFINITY);
     Robot jack5 = new Robot(1, 5, Display.EAST, Display.INFINITY);
     Robot jack6 = new Robot(1, 6, Display.EAST, Display.INFINITY); 
     
     while(jack.nextToABeeper()) {
         jack.move();
     }
     while(!jack2.nextToABeeper()) {
         jack2.move();
     }
     while(jack3.frontIsClear()) {
         jack3.move();
     }
    
    if(jack4.nextToABeeper()) {
             jack4.pickBeeper();
         }
     while(jack4.frontIsClear()) {       
        jack4.move();
         if(jack4.nextToABeeper()) {
             jack4.pickBeeper();
         }
     } 
    
    while(jack5.nextToABeeper()) {
             jack5.pickBeeper();
         }
     while(jack5.frontIsClear()) {       
        jack5.move();
         while(jack5.nextToABeeper()) {
             jack5.pickBeeper();
         }
     } 

     while(jack6.nextToABeeper()) {  
         jack6.move();
         }
     jack6.move();
     while(jack6.nextToABeeper()) {
         jack6.move();
         }
  
       
     }
}
