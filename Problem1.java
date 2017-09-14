
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
      goToWall();
      side1();
      side();
      side();
      side();
      side();
    }
    public void goToWall(){
    while(frontIsClear()){
    move();
    }
    turnRight();
    }
    public void side1(){
        while(frontIsClear()){
        turnLeft();
        if (frontIsClear()){
        turnOff();
        }
        else{
        turnRight();
        move();
        }
        }
    }
    public void side(){
    turnRight();
    move();
    while(frontIsClear()){
        turnLeft();
        if (frontIsClear()){
        turnOff();
        }
        else{
        turnRight();
        move();
        }
        }
    }
    public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
    }
   
}

