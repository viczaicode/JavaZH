package controller;

import model.LighOnModel;
import view.LightOnView;

class LightOnControllerTest {
    
    private LightOnController controller;
    
    
    void testPeldanyosit() {
    controller.peldanyosit();
    
    assert controller.getLampak().length == 9 
        : "Várt hossz: 9, kapott: " + controller.getLampak().length;
}

    
}
