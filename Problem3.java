 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Problem1
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        checkWalls();
    }
   
    public void checkWalls() {
        while (frontIsClear()) {
            move();
            turnLeft();
            if (nextToABeeper()) {
                turnOff();
            } else {
                       if(frontIsClear()) {
                    putBeeper();
                }   
                turnRight();
                if(!frontIsClear()) {
                  turnRight();      
                }
            }
        }
    }
}

