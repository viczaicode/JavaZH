/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.LightOnController;
import view.LightOnView;

/**
 *
 * @author ViczaiPéterMilán(Szf
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LightOnView view = new LightOnView();
                LightOnController controller = new LightOnController(view);
                view.setController(controller);
                view.setVisible(true);
            }
        });
    }
    
}
