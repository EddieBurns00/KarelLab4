
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
        findWall();
        checkWalls();
        for (int x=0; x<3; x++) {
            checkWalls();
        }
    }
   
    public void findWall() {
     while (frontIsClear()) {
         move();
        }
    }
    
    public void checkWalls() {
         while (!frontIsClear()) {
            turnLeft();
        }
        
        while (frontIsClear()) {
            move();
            turnRight();
            if(frontIsClear()) {
                move();
                turnOff();
            }   
            if(!frontIsClear()) {
              turnLeft();      
            }
        }
        
    }
    
    public void faceEast() {
        while (!facingEast()) {
            turnLeft();
        }
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

