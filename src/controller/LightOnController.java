
package controller;

import java.awt.Color;
import java.util.Random;
import javax.swing.JPanel;
import model.LighOnModel;
import view.LightOnView;

public class LightOnController {
    
    
    private LighOnModel[] lampak = new LighOnModel[9];
    private static final Random RND = new Random();
    private LightOnView view;
    //private JPanel[] elemek = new JPanel[9];
    
    public LightOnController(LightOnView view) {
        this.view = view;
        ujJatek();
    }
    
    public void ujJatek() {
        for (JPanel panel : view.getElemek()) {
            panel.setBackground(Color.BLACK);
        }
        peldanyosit();
        CounterFrissit();
    }
    
    public void peldanyosit() {
        for (int i = 0; i < lampak.length; i++) {
            int allapotallitas = RND.nextInt(2);
            int lampaId = i + 1;
            lampak[i] = new LighOnModel(allapotallitas, lampaId);
            
            if(lampak[i].getAllapot() == 1) {
                view.getElemek()[i].setBackground(Color.YELLOW);
            }
            
            
            // AI
            final int index = i;
            view.getElemek()[i].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    handlePanelClick(index);
                }
            });
            // AI VÉGE
        }
    }
    
    
    
    private void CounterFrissit() {
        int count = 0;
        for (LighOnModel lampa : lampak) {
            if (lampa.getAllapot() == 1) {
                count++;
            }
        }
        view.getjTextField1().setText(String.valueOf(count));
    }
    
    private void allapotValtoztat(int index) {
        
        if (lampak[index].getAllapot() == 1) {
                lampak[index].setAllapot(0);
                view.getElemek()[index].setBackground(Color.BLACK);
            } else {
                lampak[index].setAllapot(1);
                view.getElemek()[index].setBackground(Color.YELLOW);  
            }
        
    }
    
    private void handlePanelClick(int index) {
        
//        for (int i = 0; i < lampak.length; i++) {
//            if (lampak[i].getAllapot() == 1) {
//                
//                view.getElemek()[i].setBackground(Color.YELLOW);
//            } else {
//                view.getElemek()[i].setBackground(Color.BLACK);    
//            }
//        }
        
        
        if (lampak[index].getAllapot() == 1) {
            lampak[index].setAllapot(0);
            view.getElemek()[index].setBackground(Color.BLACK);
            
            if (index == 0) {
                //view.getElemek()[index+1].setBackground(Color.BLACK);
                //view.getElemek()[index+3].setBackground(Color.BLACK);
                //lampak[index+1].setAllapot(0);
                //lampak[index+3].setAllapot(0);
                allapotValtoztat(index+1);
                allapotValtoztat(index+3);
            }
            
            if (index == 1) {
//                view.getElemek()[index+1].setBackground(Color.BLACK);
//                view.getElemek()[index-1].setBackground(Color.BLACK);
//                view.getElemek()[index+3].setBackground(Color.BLACK);
//                lampak[index+1].setAllapot(0);
//                lampak[index-1].setAllapot(0);
//                lampak[index+3].setAllapot(0);
                allapotValtoztat(index+1);
                allapotValtoztat(index-1);
                allapotValtoztat(index+3);
            }
            
            if (index == 2) {
//                view.getElemek()[index-1].setBackground(Color.BLACK);
//                view.getElemek()[index+3].setBackground(Color.BLACK);
//                lampak[index-1].setAllapot(0);
//                lampak[index+3].setAllapot(0);
                allapotValtoztat(index-1);
                allapotValtoztat(index+3);
            }
            
            if (index == 3) {
//                view.getElemek()[index+1].setBackground(Color.BLACK);
//                view.getElemek()[index-3].setBackground(Color.BLACK);
//                view.getElemek()[index+3].setBackground(Color.BLACK);
//                lampak[index+1].setAllapot(0);
//                lampak[index-3].setAllapot(0);
//                lampak[index+3].setAllapot(0);
                allapotValtoztat(index+1);
                allapotValtoztat(index-3);
                allapotValtoztat(index+3);

            }
            
            if (index == 4) {
//                view.getElemek()[index+1].setBackground(Color.BLACK);
//                view.getElemek()[index-1].setBackground(Color.BLACK);
//                view.getElemek()[index-3].setBackground(Color.BLACK);
//                view.getElemek()[index+3].setBackground(Color.BLACK);
//                lampak[index+1].setAllapot(0);
//                lampak[index-1].setAllapot(0);
//                lampak[index-3].setAllapot(0);
//                lampak[index+3].setAllapot(0);
                allapotValtoztat(index+1);
                allapotValtoztat(index-1);
                allapotValtoztat(index-3);
                allapotValtoztat(index+3);
            }
            
            if (index == 5) {
//                view.getElemek()[index-1].setBackground(Color.BLACK);
//                view.getElemek()[index-3].setBackground(Color.BLACK);
//                view.getElemek()[index+3].setBackground(Color.BLACK);
//                lampak[index-1].setAllapot(0);
//                lampak[index-3].setAllapot(0);
//                lampak[index+3].setAllapot(0);
                allapotValtoztat(index-1);
                allapotValtoztat(index-3);
                allapotValtoztat(index+3);
            }
            
            if (index == 6) {
//                view.getElemek()[index+1].setBackground(Color.BLACK);
//                view.getElemek()[index-3].setBackground(Color.BLACK);
//                lampak[index+1].setAllapot(0);
//                lampak[index-3].setAllapot(0);
                allapotValtoztat(index+1);
                allapotValtoztat(index-3);
            }
            
            if (index == 7) {
//                view.getElemek()[index+1].setBackground(Color.BLACK);
//                view.getElemek()[index-1].setBackground(Color.BLACK);
//                view.getElemek()[index-3].setBackground(Color.BLACK);
//                lampak[index+1].setAllapot(0);
//                lampak[index-1].setAllapot(0);
//                lampak[index-3].setAllapot(0);
                allapotValtoztat(index+1);
                allapotValtoztat(index-1);
                allapotValtoztat(index-3);
            }
            
            if (index == 8) {
                view.getElemek()[index-1].setBackground(Color.BLACK);
                view.getElemek()[index-3].setBackground(Color.BLACK);
                lampak[index-1].setAllapot(0);
                lampak[index-3].setAllapot(0);
                allapotValtoztat(index-1);
                allapotValtoztat(index-3);
            }
        }
            
            
            CounterFrissit();
        }
}
    
