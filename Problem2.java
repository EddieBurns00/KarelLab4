
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Problem1
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        while(!nextToABeeper()) {
            turnLeft();
            if(!frontIsClear()) {
                turnRight();
                putBeeper();
                move();
            }
            else {
                move();
            }
            if (!frontIsClear()) {
                turnRight();
            }
        }
   
    }
}

