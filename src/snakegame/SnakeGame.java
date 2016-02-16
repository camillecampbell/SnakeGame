/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import environment.ApplicationStarter;
import java.awt.Dimension;

/**
 *
 * @author Camille
 */
public class SnakeGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationStarter.run(new String[0], "Space Snakes", new Dimension(2500, 1550), new GalaxyEnvironment());
    }

}
