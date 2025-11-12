
package model;


public class LighOnModel {
    
    private int allapot;
    private int id;
    
    
    
    public LighOnModel(int allapot, int id) {
        setAllapot(allapot);
        setId(id);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAllapot() {
        return this.allapot;
    }

    public void setAllapot(int allapot) {
        this.allapot = allapot;
    }
    
    
}
