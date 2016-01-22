/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

/**
 *
 * @author Camille
 */
public interface HealthProviderINTF {
    /**
     * @return the minimumHealth
     */
    public int getMinimumHealth();

    /**
     * @return the maximumHealth
     */
    public int getMaximumHealth();
    
    /**
     * @return the health
     */
    public int getValue();
    
    /**
     * @return the fraction of total possible health 
     */
    public double getFractionalHealth();

    /**
     * @return the percentage health
     */
    public double getPercentHealth();

    
}
