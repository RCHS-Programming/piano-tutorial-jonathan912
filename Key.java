import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
public class Key extends Actor{
    private boolean isDown;
    private String key;
    private String sound;
    private String upImage;
    private String downImage;
    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile, String img1, String img2)
    {
        isDown=false;
        key = keyName;
        sound= soundFile;
        upImage = "white-key.png";
        downImage = "white-key-down.png";
        setImage (upImage);
    }
    /**
     * Do the action for this key.
     */
    public void act()
    {
        if( !isDown && Greenfoot.isKeyDown(key))
            {
            Greenfoot.playSound(sound);
            setImage(downImage);
            isDown= true;
            }
        if( isDown && !Greenfoot.isKeyDown(key))
            {
                setImage(upImage);
                isDown = false; 
            }
    }
}
