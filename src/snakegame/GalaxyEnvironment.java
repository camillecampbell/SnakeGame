/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import audio.AudioPlayer;
import components.HealthBar;
import components.HealthProviderIntf;
import components.ScoreEventListenerIntf;
import environment.Environment;
import grid.Grid;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author Camille
 */
class GalaxyEnvironment extends Environment implements CellDataProviderintf, HealthProviderIntf, ScoreEventListenerIntf {

    private Grid grid;
    private Snake wrath;
    private ArrayList<Barrier> barriers;
    private Level space;
    private ArrayList<Item> items;
    private HealthBar bar;
    private MySoundManager soundManager;
    private int score;

    private void setLevel(int level) {
        if (space == null) {
            space = new Level(level);
        }

        space.setLevel(level);
        setUpGame();
    }

    public GalaxyEnvironment() {
        this.setBackground((new Color(213, 213, 213)));

        grid = new Grid(55, 30, 20, 20, new Point(50, 100), new Color(46, 139, 87, 128));
        wrath = new Snake(Direction.RIGHT, grid);
        space = new Level(1);
        bar = new HealthBar(new Point(500, 5), new Dimension(200, 25), this);

//<editor-fold defaultstate="collapsed" desc="Top horrisontal barriers">
        barriers = new ArrayList<>();
        barriers.add(new Barrier(0, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(1, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(2, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(3, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(4, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(5, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(6, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(7, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(8, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(9, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(10, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(11, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(12, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(13, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(14, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(15, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(16, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(17, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(18, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(19, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(20, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(21, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(22, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(23, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(24, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(25, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(26, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(27, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(28, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(29, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(30, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(31, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(32, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(33, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(34, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(35, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(36, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(37, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(38, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(39, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(40, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(41, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(42, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(43, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(44, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(45, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(46, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(47, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(48, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(49, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(50, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(51, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(52, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(53, 0, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 0, Color.GRAY, true, this));

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Left Vertical barriers">
        barriers.add(new Barrier(0, 1, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 2, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 3, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 4, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 5, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 6, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 7, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 8, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 9, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 10, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 11, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 12, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 13, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 14, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 15, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 16, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 17, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 18, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 19, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 20, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 21, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 22, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 23, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 24, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 25, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 26, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 27, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 28, Color.GRAY, true, this));
        barriers.add(new Barrier(0, 29, Color.GRAY, true, this));
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="bottom horizontal barriers">
        barriers.add(new Barrier(0, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(1, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(2, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(3, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(4, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(5, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(6, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(7, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(8, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(9, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(10, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(11, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(12, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(13, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(14, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(15, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(16, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(17, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(18, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(19, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(20, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(21, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(22, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(23, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(24, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(25, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(26, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(27, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(28, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(29, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(30, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(31, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(32, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(33, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(34, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(35, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(36, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(37, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(38, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(39, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(40, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(41, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(42, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(43, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(44, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(45, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(46, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(47, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(48, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(49, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(50, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(51, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(52, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(53, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 29, Color.GRAY, true, this));
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="right vertical barriers">
        barriers.add(new Barrier(54, 29, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 28, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 27, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 26, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 25, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 24, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 23, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 22, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 21, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 20, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 19, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 18, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 17, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 16, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 15, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 14, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 13, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 12, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 11, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 10, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 9, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 8, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 7, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 6, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 5, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 4, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 3, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 2, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 1, Color.GRAY, true, this));
        barriers.add(new Barrier(54, 0, Color.GRAY, true, this));
//</editor-fold>

        setUpGame();
        //setUpSound();
        soundManager = MySoundManager.getSoundManager();
    }

    public void setUpGame() {
        //clear and set up the items
        items = new ArrayList<>();

        //add PowerUps!
        for (int i = 0; i < space.getPowerUpCount(); i++) {
            items.add(new Item(randomGridLocation(),
                    5,
                    Item.ITEM_TYPE_POWER_UP,
                    ResourceTools.loadImageFromResource("snakegame/Candy! 2.gif"),
                    this));

        }
        for (int i = 0; i < space.getExtraLifeCount(); i++) {
            items.add(new Item(randomGridLocation(),
                    1,
                    Item.ITEM_TYPE_EXTRA_LIFE,
                    ResourceTools.loadImageFromResource("snakegame/1up.png"),
                    this));
        }

        for (int i = 0; i < space.getInstantDeathCount(); i++) {
            items.add(new Item(randomGridLocation(),
                    -10,
                    Item.ITEM_TYPE_INSTANT_DEATH,
                    ResourceTools.loadImageFromResource("snakegame/star 2.png"),
                    this));
        }

        for (int i = 0; i < space.getGrowStrongCount(); i++) {
            items.add(new Item(randomGridLocation(),
                    4,
                    Item.ITEM_GROW_STRONG,
                    ResourceTools.loadImageFromResource("snakegamE/BonBon.gif"),
                    this));

        }
        //Set the move delay limit and growth abilities
        moveDelayLimit = space.getMoveDelay();
        growthCount = space.getGrowthCount();

        AudioPlayer.play("/snakegame/ray_gun-Mike_Koenig-1169060422.wav");
    }

    public Point randomGridLocation() {
        return new Point(randomInt(1, grid.getColumns() - 2), randomInt(1, grid.getRows() - 2));
    }

    public int randomInt(int min, int max) {
        return (int) (min + (Math.random() * (max - min + 1)));
    }

    @Override
    public void initializeEnvironment() {

    }
//    int counter;

    public static int MOVE_DELAY_EASY = 5;
    public static int MOVE_DELAY_MEDIUM = 4;
    public static int MOVE_DELAY_HARD = 2;
    public static int MOVE_DELAY_INSANE = 1;
    int moveDelay = 0;
    int moveDelayLimit = MOVE_DELAY_EASY;

    private Difficulty difficulty;

    public static int GROWTH_COUNT_EASY = 1;
    public static int GROWTH_COUNT_MEDIUM = 3;
    public static int GROWTH_COUNT_HARD = 7;
    public static int GROWTH_COUNT_INSANE = 15;
    int growthDelay = 0;
    int growthDelayLimit = GROWTH_COUNT_INSANE;
    int growthCount = GROWTH_COUNT_EASY;

    @Override
    public void timerTaskHandler() {
//        System.out.println("Ready to take snakes to space?" + ++counter)

        if (wrath != null) {
            // if counted to the limit, then move snake and reset the counter, else keep on counting
            if (moveDelay >= moveDelayLimit) {
                moveDelay = 0;
                wrath.move();
                if (wrath.selfHit()) {
                    //System.out.println("OUCH, curses.....");
                    wrath.setHealth(-1);
                    wrath.setBodyColor(Color.yellow);
                    AudioPlayer.play("/snakegame/Raven.wav");
                    space.setLevel(Level.LEVEL_DEATH);
                }
            } else {
                moveDelay++;
            }
            checkIntersections();
        }

    }

    public void checkIntersections() {
        if (barriers != null) {
            for (int i = 0; i < barriers.size(); i++) {
                if (barriers.get(i).getLocation().equals(wrath.getHead())) {
                    //put own logic here
                    wrath.setHealth(wrath.getHealth() - wrath.getHealth());
                    wrath.setBodyColor(Color.yellow);
                    space.setLevel(Level.LEVEL_DEATH);
                    AudioPlayer.play("/snakegame/Raven.wav");
                }
            }
        }

        if (items != null) {
            for (Item item : items) {
                if (item.getLocation().equals(wrath.getHead())) {
                    if (item.getType().equals(Item.ITEM_TYPE_POWER_UP)) {
                        //add points..
                    } else if (item.getType().equals(Item.ITEM_TYPE_INSTANT_DEATH)) {
//                        wrath.setHealth(wrath.getHealth() - 25);
                        wrath.addHealth(-25);
                    } else if (item.getType().equals(Item.ITEM_TYPE_EXTRA_LIFE)) {
                        wrath.setHealth(wrath.getHealth() + 25);
                    } else if (item.getType().equals(Item.ITEM_GROW_STRONG)) {
                        wrath.addGrowth(growthCount);
                    }

                    score += item.getValue();
                    item.setLocation(randomGridLocation());
                    AudioPlayer.play("/snakegame/Shooting_Star");

                }
            }
        }

    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
//        System.out.println("Key Press" + e.getKeyChar());
//        System.out.println("Key Press" + e.getKeyCode());

        if (e.getKeyCode() == KeyEvent.VK_W) {
            wrath.setDirection(Direction.UP);
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            wrath.setDirection(Direction.LEFT);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            wrath.setDirection(Direction.DOWN);
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            wrath.setDirection(Direction.RIGHT);
        } //<editor-fold defaultstate="collapsed" desc="Galaxy stuff">
        else if (e.getKeyCode() == KeyEvent.VK_1) {
            setLevel(1);
        } else if (e.getKeyCode() == KeyEvent.VK_2) {
            setLevel(2);
        } else if (e.getKeyCode() == KeyEvent.VK_3) {
            setLevel(3);
        } else if (e.getKeyCode() == KeyEvent.VK_4) {
            setLevel(4);
        } else if (e.getKeyCode() == KeyEvent.VK_5) {
            setLevel(5);
        } else if (e.getKeyCode() == KeyEvent.VK_6) {
            setLevel(6);
        } else if (e.getKeyCode() == KeyEvent.VK_7) {
            setLevel(7);
        } else if (e.getKeyCode() == KeyEvent.VK_8) {
            setLevel(8);
        } else if (e.getKeyCode() == KeyEvent.VK_9) {
            setLevel(9);
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            setLevel(10);
        }
//</editor-fold>
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {

    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (space != null) {
            graphics.drawImage(space.getBackground(), 0, 0, this);
        }

        if (grid != null) {
            grid.paintComponent(graphics);
        }
        
        
        graphics.setFont(new Font("Calibri", Font.ITALIC, 30));
        graphics.drawString("Score : " + score, 25, 25);

        if (wrath != null) {
            wrath.draw(graphics);

            if (bar != null) {
                bar.draw(graphics);
            }
        }

        if (barriers != null) {
            for (int i = 0; i < barriers.size(); i++) {
                barriers.get(i).draw(graphics);

            }
        }
        if (items != null) {
            for (int i = 0; i < items.size(); i++) {
                items.get(i).draw(graphics);
            }
        }
        if (bar != null) {
            bar.draw(graphics);
        }

    }

//<editor-fold defaultstate="collapsed" desc="Barrier Implementations">
    @Override
    public int getSystemCoordX(int x, int y) {
        return grid.getCellSystemCoordinate(x, y).x;

    }

    @Override
    public int getSystemCoordY(int x, int y) {
        return grid.getCellSystemCoordinate(x, y).y;

    }

    @Override
    public int getCellWidth() {
        return grid.getCellWidth();
    }

    @Override
    public int getCellHeight() {
        return grid.getCellHeight();

    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="HealthProviderIntf">
    @Override
    public int getMinimumHealth() {
        return 0;
    }

    @Override
    public int getMaximumHealth() {
        return 500;
    }

    @Override
    public int getValue() {
        return wrath.getHealth();
    }

    @Override
    public double getFractionalHealth() {
        return (1.0 * wrath.getHealth() / getMaximumHealth());
    }

    @Override
    public double getPercentHealth() {
        return ((100.0 * wrath.getHealth() / getMaximumHealth()));
    }
//</editor-fold>

    /**
     * @return the difficulty
     */
    public Difficulty getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;

        if (difficulty == Difficulty.EASY) {
            growthCount = GROWTH_COUNT_EASY;
            moveDelayLimit = MOVE_DELAY_EASY;

        } else if (difficulty == Difficulty.MEDIUM) {
            growthCount = GROWTH_COUNT_MEDIUM;
            moveDelayLimit = MOVE_DELAY_MEDIUM;

        } else if (difficulty == Difficulty.HARD) {
            growthCount = GROWTH_COUNT_HARD;
            moveDelayLimit = MOVE_DELAY_HARD;

        } else if (difficulty == Difficulty.INSANE) {
            growthCount = GROWTH_COUNT_INSANE;
            moveDelayLimit = MOVE_DELAY_INSANE;
        }

    }

    @Override
    public void onScoreEvent(int scoreValue, String eventName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
