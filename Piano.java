import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kolling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        makeKeysWork();
        
    }
    
    public void makeKeysWork()
    {
            int i = 0;
            while (i<12)
            {
            i=i +1;
            

        
        
            addObject(new Key("g", "3a.wav"), i*63 + 0, 140);
        }
    }
}