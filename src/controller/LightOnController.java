
package controller;

import java.util.Random;
import model.LighOnModel;

public class LightOnController {
    
    
    private LighOnModel[] lampak = new LighOnModel[9];
    public static final Random RND = new Random();
    
    public LightOnController() {
        peldanyosit();
        
    }
    private void peldanyosit() {
        //int allapotallitas = RND.nextInt(2); // 1–3

        for (int i = 0; i < lampak.length; i++) {
            int allapotallitas = RND.nextInt(2);
            int lampaId = i + 1;
            lampak[i] = new LighOnModel(allapotallitas, lampaId);
        }
    }
    
}
