package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {
    TextField maandtekstvak;
    TextField jaartekstvak;
    Label maandlabel;
    Label jaarlabel;
    String s, tekst;
    int maand;
    int jaar;


    public void init() {
        maandlabel = new Label("typ een maandnummer in");
        add(maandlabel);

        maandtekstvak = new TextField("",10);
        add(maandtekstvak);

        jaarlabel = new Label("typ een jaargetal in");
        add(jaarlabel);

        jaartekstvak = new TextField("",10);
        jaartekstvak.addActionListener(new jaartekstvaklistener());
        add(jaartekstvak);
        tekst = "";



    }


    public void paint(Graphics g) {
        g.drawString(tekst,50,50);


    }
    class jaartekstvaklistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = maandtekstvak.getText();
            maand = Integer.parseInt(s);


            if (( (jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                    jaar % 400 == 0 ) ){
                tekst = "Februari,29 dagen";


            }

            switch (maand){
                case 1:
                    tekst = "Januari, 31 dagen";
                    break;
                case 2:
                    tekst = "Februari, 28 dagen";
                    break;
                case 3:
                    tekst = "Maart, 31 dagen";
                    break;
                case 4:
                    tekst = "April, 30 dagen";
                    break;
                case 5:
                    tekst = "Mei, 31 dagen";
                    break;
                case 6:
                    tekst = "Juni, 30 dagen";
                    break;
                case 7:
                    tekst = "Juli, 31 dagen";
                    break;
                case 8:
                    tekst = "Augustes, 31 dagen";
                    break;
                case 9:
                    tekst = "September, 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober, 31 dagen";
                    break;
                case 11:
                    tekst = "November, 30 dagen";
                    break;
                case 12:
                    tekst = "December, 31 dagen";
                    break;
                default:
                    tekst= "typ een juist maandnummer in";
                    break;


            }
            repaint();
        }
    }
}
