package model;


class LighOnModelTest {
    
    private LighOnModel lampa;

    void testGetAllapot() {
        assert lampa.getAllapot() == 0 : "Várt érték: 0, kapott: " + lampa.getAllapot();
        lampa.setAllapot(1);
        assert lampa.getAllapot() == 1 : "Várt érték: 1, kapott: " + lampa.getAllapot();
    }

    void testSetAllapot() {
        lampa.setAllapot(1);
        assert lampa.getAllapot() == 1 : "Várt érték: 1, kapott: " + lampa.getAllapot();

        lampa.setAllapot(5);
        assert lampa.getAllapot() == 5 : "Várt érték: 5, kapott: " + lampa.getAllapot();
    }

    void testGetId() {
        assert lampa.getId() == 1 : "Várt érték: 1, kapott: " + lampa.getId();
    }

    void testSetId() {
        lampa.setId(2);
        assert lampa.getId() == 2 : "Várt érték: 2, kapott: " + lampa.getId();
    }

}
