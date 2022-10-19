import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,50,210);
        hero.setLocation(62,208);
        Laser laser = new Laser();
        addObject(laser,62,208);
        hero.setLocation(226,221);
        removeObject(laser);
    }
    
    public void act(){
        spawnEnemy();
    }
    
    public int timerEnemy = 0;
    public void spawnEnemy(){
        if(timerEnemy == 180){//jika timer = 3 detik
            // int speed = Greenfoot.speed
            Enemy enemy = new Enemy();
            addObject(new Enemy(),600, Greenfoot.getRandomNumber(400));
            timerEnemy = 0;
        }else{
            timerEnemy++;
        }
    }
}

