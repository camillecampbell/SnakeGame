/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import audio.AudioPlayer;
import environment.Environment;
import grid.Grid;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author Camille
 */
class GalaxyEnvironment extends Environment implements CellDataProviderintf {

    private Grid grid;
    private Snake wrath;
    private ArrayList<Barrier> barriers;
    private Level space;
    private ArrayList<Item> items;

    public GalaxyEnvironment() {
        this.setBackground(Color.white);

        grid = new Grid(55, 30, 20, 20, new Point(50, 100), new Color(46, 139, 87, 128));
        wrath = new Snake(Direction.RIGHT, grid);
        space = new Level(1);

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
       
        
        items = new ArrayList<>();
        items.add(new Item(10, 5,"POWER_UP", 
                ResourceTools.loadImageFromResource("snakegame/Level_9.jpg"),
                this));
    }
    @Override
    public void initializeEnvironment() {

    }
//    int counter;

    int moveDelay = 0;
    int moveDelayLimit = 3;

    @Override
    public void timerTaskHandler() {
//        System.out.println("Ready to take snakes to space?" + ++counter)

        if (wrath != null) {
            // if counted to the limit, then move snake and reset the counter, else keep on counting
            if (moveDelay >= moveDelayLimit) {
                moveDelay = 0;
                wrath.move();
                if (wrath.selfHit()){
                    //System.out.println("OUCH, curses.....");
                    wrath.addHealth(-1000000);
                    wrath.setBodyColor(Color.yellow);
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
                    wrath.addHealth(-1000000);
                    wrath.setBodyColor(Color.yellow);

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
            space.setLevel(1);
        } else if (e.getKeyCode() == KeyEvent.VK_2) {
            System.out.println("Second Galaxy");
            space.setLevel(2);
        } else if (e.getKeyCode() == KeyEvent.VK_3) {
            space.setLevel(3);
        } else if (e.getKeyCode() == KeyEvent.VK_4) {
            space.setLevel(4);
        } else if (e.getKeyCode() == KeyEvent.VK_5) {
            space.setLevel(5);
        } else if (e.getKeyCode() == KeyEvent.VK_6) {
            space.setLevel(6);
        } else if (e.getKeyCode() == KeyEvent.VK_7) {
            space.setLevel(7);
        } else if (e.getKeyCode() == KeyEvent.VK_8) {
            space.setLevel(8);
        } else if (e.getKeyCode() == KeyEvent.VK_9) {
            space.setLevel(9);
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            space.setLevel(10);
        } else if (e.getKeyCode() == KeyEvent.VK_0) {
            AudioPlayer.play("/snakegame/ray_gun-Mike_Koenig-1169060422.wav");
        }
//</editor-fold>
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
//        if (e.getKeyCode()== KeyEvent.VK_1){
//            this.setBackground(Level_1.jpg);
//        }
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

        if (wrath != null) {
            wrath.draw(graphics);

        }
        if (barriers != null) {
            for (int i = 0; i < barriers.size(); i++) {
                barriers.get(i).draw(graphics);

            }
        }
        if(items != null){
            for (int i = 0; i < items.size(); i++) {
                items.get(i).draw(graphics);
            }
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
}
