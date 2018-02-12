package milestone2;

/** Class: Player
 * Summary: The NFL Player class, holds the majority of the data
 * Author: Katon Bingham
 * Date: 2/8/18
 *
 * All following work is my own. 
 * -Katon
 */

public class Player {
    Player(){}
    Player(String newName, String newPosition, String newCollege, 
            int newJerseyNumber, int newHeightFEET, int newHeightINCHES,
            int newWeight, int newAge, int newPassing, int newReceiving,
            int newFumbles, int newDefensive, int newPunting, 
            Boolean newIsDrafted){
        name = newName;
        position = newPosition;
        college = newCollege;
        jerseyNumber = newJerseyNumber;
        heightFEET = newHeightFEET;
        heightINCHES = newHeightINCHES;
        weight = newWeight;
        age = newAge;
        passing = newPassing;
        receiving = newReceiving;
        fumbles = newFumbles;
        defensive = newDefensive;
        punting = newPunting;
        isDrafted = newIsDrafted;
    }
    // data is generic by default
    private String name = "John Doe";
    private String position = "Benchwarmer";
    private String college = "Generic State College";
    private int jerseyNumber = 00;
    private int heightFEET = 6;
    private int heightINCHES = 0;
    private int weight = 200;
    private int age = 18;
    private int passing = 0;
    private int receiving = 0;
    private int fumbles = 0;
    private int defensive = 0;
    private int punting = 0;
    private Boolean isDrafted = false;
    
    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", position=" + position + 
                ", college=" + college + ", jerseyNumber=" + jerseyNumber + 
                ", heightFEET=" + heightFEET + ", heightINCHES=" + 
                heightINCHES + ", weight=" + weight + ", age=" + age + 
                ", passing=" + passing + ", receiving=" + receiving + 
                ", fumbles=" + fumbles + ", defensive=" + defensive + 
                ", punting=" + punting + ", isDrafted=" + isDrafted + '}';
    }

    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public String getCollege() {
        return college;
    }
    public int getJerseyNumber() {
        return jerseyNumber;
    }
    public String getHeight() {
        return heightFEET + "'" + heightINCHES + "\"";
    }
    public int getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }
    public int getPassing() {
        return passing;
    }
    public int getReceiving() {
        return receiving;
    }
    public int getFumbles() {
        return fumbles;
    }
    public int getDefensive() {
        return defensive;
    }
    public int getPunting() {
        return punting;
    }
    public Boolean getIsDrafted() {
        return isDrafted;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
    public void setHeightFEET(int heightFEET) {
        this.heightFEET = heightFEET;
    }
    public void setHeightINCHES(int heightINCHES) {
        this.heightINCHES = heightINCHES;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPassing(int passing) {
        this.passing = passing;
    }
    public void setReceiving(int receiving) {
        this.receiving = receiving;
    }
    public void setFumbles(int fumbles) {
        this.fumbles = fumbles;
    }
    public void setDefensive(int defensive) {
        this.defensive = defensive;
    }
    public void setPunting(int punting) {
        this.punting = punting;
    }
    public void setIsDrafted(Boolean isDrafted) {
        this.isDrafted = isDrafted;
    }
}
