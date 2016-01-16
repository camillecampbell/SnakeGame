/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;
import images.ResourceTools;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

/**
 *
 * @author Camille
 */
public class Level {
    
    public static int LEVEL_DEATH = -1;
    
    
    public Level(int level){
        setLevel(level);
    }
    
    private int level;
    private Image background;
    
    public Image getBackground(){
      return background;  
    } 
        

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
        
        //update the background image
        if (level == 1) {
            background = ResourceTools.loadImageFromResource("snakegame/Level_1.jpg");
        } else if (level == 2) {
            background = ResourceTools.loadImageFromResource("snakegame/Level_2.jpg");
        } else if (level == 3) {
            background = ResourceTools.loadImageFromResource("snakegame/Level_3.jpg");
        } else if (level == 4) {
            background = ResourceTools.loadImageFromResource("snakegame/Level_4.jpg");
        } else if (level == 5) {
            background = ResourceTools.loadImageFromResource("snakegame/Level_5.1 2.jpg");
        } else if (level == 6) {
            background = ResourceTools.loadImageFromResource("snakegame/Level_6 2.png");
        } else if (level == 7) {
            background = ResourceTools.loadImageFromResource("snakegame/Level_7 2.png");
        } else if (level == 8) {
            background = ResourceTools.loadImageFromResource("snakegame/Level_8.jpg");
        } else if (level == 9) {
            background = ResourceTools.loadImageFromResource("snakegame/Level_9.jpg");
        } else if (level == 10) {
            background = ResourceTools.loadImageFromResource("snakegame/Level_10.jpg");
        } else {
            background = ResourceTools.loadImageFromResource("snakegame/snake_death.jpg");
        }
    }
}