package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {

    TextField tekstvak;
    int cijfer;
    String s, tekst;
    Label label;

    public void init() {
        label = new Label("voer een cijfer in");
        add(label);
        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new tekstvaklistener());
        add(tekstvak);
        tekst = "";

    }


    public void paint(Graphics g) {
        g.drawString(tekst,50,60);

    }


    class tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            tekstvak.setText("");


            if (cijfer > 5.4 ){
                tekst = "voldoende";}
                else { tekst = "onvoldoende";}
                repaint();



        }
    }
}

