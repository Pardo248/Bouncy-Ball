import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int offsetX = 6;
    int offsetY = 6;
    public void act()
    {
        int x = getX();
        int y = getY();
        
        setLocation(x + offsetX,y + offsetY);
        
        if(getY() >= 380 || getY() <= 0){
            offsetY *= -1;
        }
        if(getX() >= 580 || getX() <= 0){
            offsetX *= -1;
        }
    }
}
