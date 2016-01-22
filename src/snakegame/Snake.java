/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import grid.Grid;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Camille
 */
public class Snake {
    //When dead will begin to move again in one minute
    //Doesn't respect item collision

    public Snake(Direction direction, Grid grid) {
        this.direction = direction;
        this.grid = grid;

        //Create the snake body
        body = new ArrayList<>();
        body.add(new Point(5, 7));
        body.add(new Point(5, 6));
        body.add(new Point(5, 5));
        body.add(new Point(5, 4));
        body.add(new Point(5, 3));
        body.add(new Point(5, 2));
        body.add(new Point(5, 1));
        body.add(new Point(5, 0));

    }
    
    public void draw(Graphics graphics) {
        
        graphics.setColor(bodyColor);

        for (int i = 0; i < body.size(); i++) {
//            System.out.println("Body Location =" + body.get(i).toString());
            graphics.fillOval(grid.getCellSystemCoordinate(body.get(i)).x,
                    grid.getCellSystemCoordinate(body.get(i)).y,
                    grid.getCellWidth(),
                    grid.getCellHeight());

        }
    }

    public void move() {
        //only moves if snake is alive because of statement if (isAlive())
        if (isAlive()) {
            //make a copy of the current head location
            Point newHead = new Point(getHead());

            if (getDirection() == Direction.LEFT) {
                newHead.x--;
            } else if (getDirection() == Direction.RIGHT) {
                newHead.x++;
            } else if (getDirection() == Direction.DOWN) {
                newHead.y++;
            } else if (getDirection() == Direction.UP) {
                newHead.y--;
            }
            //add new head   
            body.add(HEAD_POSITION, newHead);

            //delete the tail
            body.remove(body.size() - 1);
        }
    }
    
    public boolean selfHit(){
        //if the head occupies the same coordinates as any OTHER body part
        for (int i = 1; i < body.size(); i++) {
            if (body.get(i).equals(getHead())) {
                return true; //cleary, the head is contact with the body
            }
        }
        return false; //hey, we're good
    }
    

//<editor-fold defaultstate="collapsed" desc="Properties">
    private static final int HEAD_POSITION = 0;
    private Direction direction = Direction.LEFT;
    private ArrayList<Point> body;
    private Grid grid;
    private Color bodyColor = Color.MAGENTA;
    public int health = 100;

    /**
     * @return the direction
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * @param bodyColor the bodyColor to set
     */
    public void setBodyColor(Color bodyColor) {
        this.bodyColor = bodyColor;
    }

    public Point getHead() {
        return body.get(HEAD_POSITION);
    }

    public int getHealth() {
        return health;
    }

    public void addHealth(int health) {
        this.health += health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isAlive() {
        return (health > 0);
    }
    //</editor-fold>
}
