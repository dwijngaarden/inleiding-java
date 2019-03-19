package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkopdrachth10 extends Applet {

    TextField tekstvak;
    String s, tekst;
    int cijfer;
    Label label;

    public void init() {
        label = new Label("voer een cijfer in");
        add(label);

        tekstvak = new TextField("",10);
        tekstvak.addActionListener(new tekstvaklistener());
        add(tekstvak);

        tekst = "";

    }


    public void paint(Graphics g) {
        g.drawString(tekst,50,50);

    }

    class tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            tekstvak.setText("");

            switch (cijfer){

                case 1:
                    tekst = "slecht";
                    break;
                case 2:
                    tekst = "slecht";
                    break;
                case 3:
                    tekst = "slecht";
                    break;
                case 4:
                    tekst = "onvoldoende";
                    break;
                case 5:
                    tekst = "matig";
                    break;
                case 6:
                    tekst = "voldoende";
                case 7:
                    tekst = "voldoende";
                    break;
                case 8:
                    tekst = "goed";
                    break;
                case 9 :
                    tekst = "goed";
                    break;
                case 10:
                    tekst = "goed";
                    break;
                    default: tekst = "verkeerde cijfer ingevoer probeer opnieuw";




            }
repaint();

        }
    }
}
