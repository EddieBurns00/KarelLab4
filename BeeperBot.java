
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    
    public void runRace() {
        collectBeepers();
        for ( int x=0; x<4; x++) {
        collectBeepers();
    }
    }
   
    public void collectBeepers() {
        faceEast();
        findABeeperColumn();
        collectColumn();
        returnToFloor();
    }
    
    public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    }
    
    public void findABeeperColumn() {
        while(!nextToABeeper()) {
           move();
        }
        turnLeft();
    }
    
    public void collectColumn() {
        while(nextToABeeper()) {
            move();
        }
    }
    
    public void returnToFloor() {
        turnLeft();
        turnLeft();
        move();
        while(nextToABeeper()) {
            pickBeeper();
            move();
            if(!frontIsClear()) {
            faceEast();
        }
        }
    }
}