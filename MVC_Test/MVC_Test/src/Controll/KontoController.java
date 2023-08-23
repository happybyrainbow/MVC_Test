package Controll;

import Model.Konto;

public class KontoController {

    private Konto konto;

    public KontoController(Konto konto){
        this.konto=konto;
    }

    public void erhoeheKontostand(int amount){

        konto.setGuthaben(konto.guthaben += amount);

    }

    public void geldAbheben(int amount){

        konto.setGuthaben(konto.guthaben -= amount);

    }

    public int getGuthaben(){
        return konto.guthaben;
    }
}
