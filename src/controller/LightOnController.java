
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
    
    public LightOnController() {
        view = new LightOnView();
        peldanyosit();
        
        
    }
    
    public void peldanyosit() {
        //int allapotallitas = RND.nextInt(2); // 1–3

        for (int i = 0; i < lampak.length; i++) {
            int allapotallitas = RND.nextInt(2);
            int lampaId = i + 1;
            lampak[i] = new LighOnModel(allapotallitas, lampaId);
            
            if(lampak[i].getAllapot() == 1) {
                view.getElemek()[i].setBackground(Color.BLUE);
            }
            
            
        }
    }
    
    
    
    
}
