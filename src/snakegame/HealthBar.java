/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;
import components.HealthProviderIntf;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;


/**
 *
 * @author Camille
 */
public class HealthBar {
    {
        setHealthProvider(new components.Health());
        setPosition(new Point());
        setSize(new Dimension(100, 20));
        setBaseColor(DEFAULT_BASE_COLOR);
        setHealthColor(DEFAULT_HEALTH_COLOR);
        setLabel("Healthy");
    }

    public HealthBar() {
    }

    public HealthBar(Point position, Dimension size, HealthProviderIntf health) {
        this.position = position;
        this.size = size;
        this.healthProvider = health;
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Properties">
    public static Color DEFAULT_BASE_COLOR = Color.RED;
    public static Color DEFAULT_HEALTH_COLOR = Color.GREEN;

    private Point position;
    private Dimension size;
    private Color baseColor, healthColor;
    private HealthProviderIntf healthProvider;
    private String label;

    /**
     * @return the position
     */
    public Point getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Point position) {
        this.position = position;
    }

    /**
     * @return the size
     */
    public Dimension getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(Dimension size) {
        this.size = size;
    }

    /**
     * @return the baseColor
     */
    public Color getBaseColor() {
        return baseColor;
    }

    /**
     * @param baseColor the baseColor to set
     */
    public void setBaseColor(Color baseColor) {
        this.baseColor = baseColor;
    }

    /**
     * @return the healthColor
     */
    public Color getHealthColor() {
        return healthColor;
    }

    /**
     * @param healthColor the healthColor to set
     */
    public void setHealthColor(Color healthColor) {
        this.healthColor = healthColor;
    }

    /**
     * @return the healthProvider
     */
    public HealthProviderIntf getHealthProvider() {
        return healthProvider;
    }

    /**
     * @param health the healthProvider to set
     */
    public void setHealthProvider(HealthProviderIntf health) {
        this.healthProvider = health;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="ComponentDrawIntf">
    
    public void draw(Graphics graphics) {
        graphics.setColor(baseColor);
        graphics.fill3DRect(position.x, position.y, size.width, size.height, false);

        if (healthProvider.getValue() > healthProvider.getMinimumHealth()) {
            graphics.setColor(healthColor);
            graphics.fill3DRect(position.x, position.y, (int) (size.width * healthProvider.getPercentHealth() / 100.0), size.height, true);
        }
    }
//</editor-fold>

    
}
