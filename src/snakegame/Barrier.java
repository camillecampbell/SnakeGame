/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Camille
 */
public class Barrier {

    public void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.fill3DRect(cellData.getSystemCoordX(x, y),
                cellData.getSystemCoordY(x, y),
                cellData.getCellWidth(),
                cellData.getCellHeight(),
                true);
    }

    public Point getLocation() {
        return new Point(x, y);
    }

//<editor-fold defaultstate="collapsed" desc="Constructors">
    public Barrier(int x, int y, Color color, boolean breakable, CellDataProviderintf cellData) {
        this.x = x;
        this.y = y;
        this.cellData = cellData;
        this.color = color;
        this.breakable = breakable;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Properties">
    private int x, y;
    private Color color;
    private boolean breakable = false;
    private CellDataProviderintf cellData;
//</editor-fold>
}
