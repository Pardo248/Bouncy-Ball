import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Actor
{
    /**
     * Act - do whatever the Bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int offsetX = 5;
    private int offsetY = 5;
    
    public void act()
    {
        int x = getX();
        int y = getY();
        Bomb bomb = new Bomb();
        
        setLocation(x + offsetX,y + offsetY);
        
        if(getY() >= 380 || getY() <= 0){
            offsetY *= -1;
        }
        if(getX() >= 580 || getX() <= 0){
            offsetX *= -1;
        }
        
        Turtle turtle = (Turtle)getOneIntersectingObject(Turtle.class);
            
        if(turtle != null){
            World world = getWorld();
            
            world.addObject(bomb,x,y);
            
        }
    }
}
