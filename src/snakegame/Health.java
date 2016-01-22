/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Camille
 */
public class Health implements HealthProviderINTF{
    {
        setMinimumHealth(DEFAULT_MIN_HEALTH);
        setMaximumHealth(DEFAULT_MAX_HEALTH);
        value = getMaximumHealth();
    }

    public Health() {
    }

    public Health(int health) {
        this.value = health;
    }

    public Health(int health, int minimumHealth, int maximumHealth) {
        this.minimumHealth = minimumHealth;
        this.maximumHealth = maximumHealth;
        this.value = health;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Properties">
    public static int DEFAULT_MIN_HEALTH = 0;
    public static int DEFAULT_MAX_HEALTH = 100;

    private int value;
    private int minimumHealth;
    private int maximumHealth;

    /**
     * @param minimumHealth the minimumHealth to set
     */
    public void setMinimumHealth(int minimumHealth) {
        this.minimumHealth = minimumHealth;
    }

    /**
     * @param maximumHealth the maximumHealth to set
     */
    public void setMaximumHealth(int maximumHealth) {
        this.maximumHealth = maximumHealth;
    }

    /**
     * @param quantity the amount of value to add (this can be a negative
 number)
     * @return the value of value after the change is applied
     */
    public int addHealth(int quantity) {
        this.setValue(this.getValue() + quantity);

        return getValue();
    }
    

//<editor-fold defaultstate="collapsed" desc="HealthProviderIntf">
    /**
     * @return the value
     */
    @Override
    public int getValue() {
        return value;
    }
        
    /**
     * @return the minimumHealth
     */
    @Override
    public int getMinimumHealth() {
        return minimumHealth;
    }

    /**
     * @return the fraction of total possible value 
     */
    @Override
    public double getFractionalHealth() {
        double fractionalHealth = 0.0;
        try {
            fractionalHealth = (value * 1.0) / maximumHealth;
        } catch (Exception e) {
            //nothing... bury it
        }
        return fractionalHealth;
    }

    /**
     * @return the percentage value
     */
    @Override
    public double getPercentHealth() {
        return getFractionalHealth() * 100;
    }

    /**
     * @return the maximumHealth
     */
    @Override
    public int getMaximumHealth() {
        return maximumHealth;
    }


//</editor-fold>

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;

        if (this.value < getMinimumHealth()) {
            this.value = getMinimumHealth();
        } else if (this.value > getMaximumHealth()) {
            this.value = getMaximumHealth();
        }
    }
//</editor-fold>
    
}
