
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void runRace(){
    runrace();
    runrace();
    runrace();
    runrace();
    runrace();
    runrace();
    }
    public void runrace() {
        faceEast();
        findABeeperColumn();
        collectColumn();
        returnToFloor();
    }
    
    public void faceEast(){
    while(!facingEast()){
        turnLeft();
    }
}
    public void findABeeperColumn(){
        move();
        while(!nextToABeeper()){
            move(); 
        }
        turnLeft();
    }
    public void collectColumn(){
    pickBeeper();
    move();
    while (nextToABeeper()){
    pickBeeper();
    move();
    }
    }
      
    public void returnToFloor(){
    turnLeft();
    turnLeft();
    while(frontIsClear()){
        move();
    }
    }
    }
   
