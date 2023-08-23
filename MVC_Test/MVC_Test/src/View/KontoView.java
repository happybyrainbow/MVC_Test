package View;

import Controll.KontoController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;import java.awt.event.InputMethodListener;

public class KontoView extends JFrame{
    private JPanel panel1;
    private JButton einzahlen;
    private JTextField textField1;
    private JButton abheben;
    private JLabel stand;
    private KontoController kc;

    public KontoView(KontoController kc) {

        setContentPane(panel1);
        setTitle("Konto");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        this.kc = kc;

        createButtons();

    }

    private void createButtons(){

        einzahlen.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                kc.erhoeheKontostand(Integer.parseInt(textField1.getText()));
                stand.setText("Stand: " + kc.getGuthaben());

            }
        });

        abheben.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                kc.geldAbheben(Integer.parseInt(textField1.getText()));
                stand.setText("Stand: " + kc.getGuthaben());

            }
        });

    }
}
