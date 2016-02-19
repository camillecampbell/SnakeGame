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

    public Level(int level) {
        setLevel(level);
    }

    private int level;
    private Image background;

    public Image getBackground() {
        return background;
    }

    public int getPowerUpCount() {
        switch (level) {
            default:
            case 1:
            case 2:
            case 3:
                return 4;

            case 4:
                return 27;

            case 5:
            case 6:
                return 10;

            case 7:
            case 8:
            case 9:
                return 5;

            case 10:
                return 6;
        }
    }

    public int getExtraLifeCount() {
        switch (level) {
            default:
            case 1:
                return 15;
            case 2:
            case 3:
                return 4;

            case 4:
                return 2;

            case 5:
                return 7;
            case 6:
                return 17;

            case 7:
            case 8:
            case 9:
                return 4;

            case 10:
                return 1;
        }
    }

    public int getInstantDeathCount() {
        switch (level) {
            default:
            case 1:
                return 0;
            case 2:
            case 3:
                return 2;

            case 4:
                return 5;

            case 5:
                return 19;
            case 6:
                return 10;

            case 7:
            case 8:
            case 9:
                return 14;

            case 10:
                return 70;
        }
    }

    //This is currently working :)

    public int getMoveDelay() {
        switch (level) {
            default:
            case 1:
            case 2:
            case 3:
                return MOVE_DELAY_EASY;

            case 4:
            case 5:
            case 6:
                return MOVE_DELAY_MEDIUM;

            case 7:
            case 8:
            case 9:
                return MOVE_DELAY_HARD;

            case 10:
                return MOVE_DELAY_INSANE;
        }
    }

    public int getGrowStrongCount() {
        switch (level) {
            default:
            case 1:
                return 2;
            case 2:
            case 3:
                return 4;

            case 4:
                return 5;

            case 5:
            case 6:
                return 10;

            case 7:
                return 5;
            case 8:
                return 21;
            case 9:
                return 7;

            case 10:
                return 4;
        }
    }

    //This is not currently working :(

    public int getGrowthCount() {
        switch (level) {
            default:
            case 1:
            case 2:
            case 3:
                return GROWTH_COUNT_EASY;

            case 4:
            case 5:
            case 6:
                return GROWTH_COUNT_MEDIUM;

            case 7:
            case 8:
            case 9:
                return GROWTH_COUNT_HARD;

            case 10:
                return GROWTH_COUNT_INSANE;
        }
    }

    public static int MOVE_DELAY_EASY = 5;
    public static int MOVE_DELAY_MEDIUM = 4;
    public static int MOVE_DELAY_HARD = 2;
    public static int MOVE_DELAY_INSANE = 1;

    public static int GROWTH_COUNT_EASY = 1;
    public static int GROWTH_COUNT_MEDIUM = 3;
    public static int GROWTH_COUNT_HARD = 7;
    public static int GROWTH_COUNT_INSANE = 15;

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
