import Controll.KontoController;
import Model.Konto;
import View.KontoView;

public class MainProgramm {

    public static void main(String[] args){
        KontoView kontoView=new KontoView(new KontoController(new Konto()));
    }
}
