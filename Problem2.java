
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        putBeeper();
        move();
        wall();
    }
    public void wall(){
    turnLeft();
    while(!nextToABeeper()){
    putBeeper();
    turnRight();
    move();
    turnLeft();
    checkFront();
    checkRight();
    
    }
}
public void checkFront(){
    if(frontIsClear()){
    move();
    turnLeft();
    move();
    turnLeft();
    }
    }
    public void checkRight(){
    turnRight();
    if(!frontIsClear()&&!nextToABeeper()){
    putBeeper();
    turnRight();
    move();
    turnLeft();
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
   


