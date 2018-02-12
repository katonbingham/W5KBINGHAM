package milestone2;

/** Class: Manager
 * Summary: Creates 6 players, stores other data and methods
 * Author: Katon Bingham
 * Date: 2/11/18
 *
 * All following work is my own. 
 * -Katon
 */

import java.io.*;
import java.util.*;

public class Manager {
    Manager(){}
    Manager(String newName, ArrayList<Player> newArrli){
        this.name = newName;
        this.arrli = newArrli;
    }   // difference between using this.variable and the player class approach?
    
    private String name = "Jane Manager"; 
    ArrayList<Player> arrli = new ArrayList<Player>();

    public void setName(String name) {
        this.name = name;
    }
    public void setArrli(ArrayList<Player> arrli) {
        this.arrli = arrli;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Player> getArrli() {
        return arrli;
    }
    
    // creates six players. May need to be PlayerArray?.
    public ArrayList createPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        Player p5 = new Player();
        Player p6 = new Player();
        
        arrli.add(p1);
        arrli.add(p2);
        arrli.add(p3);
        arrli.add(p4);
        arrli.add(p5);
        arrli.add(p6);
        
        return arrli;
    }

    @Override
    public String toString() {
        return "Manager{" + "name=" + name + ", arrli=" + arrli + '}';
    }
}
