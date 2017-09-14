 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void closeAllWindows(){
        while(anyBeepersInBeeperBag()){
            turnRight();
            if (frontIsClear()) {
                move();
            }
            turnLeft();
            checkWall();      
        }
    }

    public void checkWall(){
        if (frontIsClear()){
            putBeeper();
        }
        else{
            turnRight();
            move();
        }
        handleCorner();
    }
 
    public void handleCorner(){
        turnRight();
        if (!frontIsClear()){
            turnLeft();
            turnLeft();
            turnLeft();
            move();
        }
        else{
        turnLeft();
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
}

