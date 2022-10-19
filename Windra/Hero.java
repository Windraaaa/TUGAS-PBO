import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    int delay=0;
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("W"))
        setLocation(getX(),getY()-3);
        if (Greenfoot.isKeyDown("S"))
        setLocation(getX(),getY()+3);
        if (Greenfoot.isKeyDown("A"))
        setLocation(getX()-3,getY());
        if (Greenfoot.isKeyDown("D"))
        setLocation(getX()+3,getY());
        shooting();
        laser();
    }
    
    
    public void laser()
    {
        World w = getWorld();
        if(Greenfoot.isKeyDown("space"))
        {
            w.addObject(new Laser(), getX(), getY());
        }
        
    }
    
    public void shooting()
    {
        delay++;
        if(delay==20)
        {
            getWorld().addObject(new Laser(),getX(),getY());
            delay=0;
            Greenfoot.playSound("ammo.wav");
        }
    }
}