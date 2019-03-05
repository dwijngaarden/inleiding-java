package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht1 extends Applet {
    Button okknop;
    Button resetknop;
    TextField tekstvak;
Label label;
String s;
String schermtekst;

    public void init() {
schermtekst="  ";
        okknop = new Button("Ok");
        okknopListener  kl = new okknopListener();
        okknop.addActionListener( kl );
        add(okknop);
        tekstvak = new TextField("",20);
        add(tekstvak);
        label = new Label("typ iets in het tekstvakje");
        add(label);
        add(tekstvak);
        resetknop = new Button("reset");
        resetknopListener K2 = new resetknopListener();
        resetknop.addActionListener( K2 );
        add(resetknop);
        s = "";

    }

    public void paint(Graphics g) {
        g.drawString(s,50,60);
        g.drawString(schermtekst,50,60);

    }

    class okknopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();

           tekstvak.setText(" ");




            repaint();
        }

    }
    class resetknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();

            


            repaint();
        }
    }

    }
