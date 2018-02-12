package milestone2;
/** Class: milestone2
 * Summary: NFL driver program, tests constructors and data storage.
 * Author: Katon Bingham
 * Date: 2/11/18
 *
 * All following work is my own. 
 * -Katon
 */
public class Milestone2 {

    public static void main(String[] args) {
        // create a basic, default player with generic data
        Player player = new Player();
        
        // test various outputs
        System.out.println("\n--Default Player constructor test--");
        System.out.println("Name: " + player.getName());
        System.out.println("Position: " + player.getPosition());
        System.out.println("Passing: " + player.getPassing());
        
        // create a custom player using our own flavored data
        Player player2 = new Player("Bob Tonkas", "Quarterback", "OSU", 10, 
                5, 10, 210, 23, 1, 2, 3, 4, 5, true);
        
        System.out.println("\n--Non-default player constructor test--");
        System.out.println("Name: " + player2.getName());
        System.out.println("Position: " + player2.getPosition());
        System.out.println("Height: " + player2.getHeight());
        
        // test setters
        System.out.println("\n--Player setter test--");
        player.setName("Dale Earnhardt");
        player2.setName("Jeb Bush");
        
        System.out.println("Player and Player2 new names: " 
                + player.getName() + ", " + player2.getName());
        
        System.out.println("Player Testing Finished!");
        
        // create a basic manager class
        Manager manager = new Manager();
        // create blank players to fill the 'team'
        manager.createPlayers();
        System.out.println(manager.getArrli());
        
    }
    
}
