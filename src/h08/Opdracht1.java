package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht1 extends Applet {
    Button knop;
    TextField tekstvak;
Label label;
String s;
String schermtekst;

    public void init() {
schermtekst="  ";
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
        tekstvak = new TextField("",20);
        add(tekstvak);
        label = new Label("typ iets in het tekstvakje");
        add(label);
        add(tekstvak);
        knop = new Button("reset");
        KnopListener K2 = new KnopListener();
        knop.addActionListener( K2 );
        add(knop);
        s = "";

    }

    public void paint(Graphics g) {
        g.drawString(s,50,60);
        g.drawString(schermtekst,50,60);

    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            repaint();
           tekstvak.setText(" ");




            repaint();
        }

    }


    }
