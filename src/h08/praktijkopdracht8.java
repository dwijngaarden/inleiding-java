package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class praktijkopdracht8 extends Applet {

    Button keerknop;
    Button plusknop;
    Button minknop;
    Button delenknop;
    TextField tekstvak;
    TextField tekstvak2;
    String schermtekst;
    String s;



    public void init() {
        tekstvak = new TextField(10);
        add(tekstvak);

        tekstvak2 = new TextField(10);
        add(tekstvak2);

        keerknop = new Button();
        keerknop.setLabel("*");
        keerknopListener keer = new keerknopListener();
        keerknop.addActionListener(keer);
        add(keerknop);

        plusknop = new Button();
        plusknop.setLabel("+");
        plusknopListener plus = new plusknopListener ();
        plusknop.addActionListener(plus);
        add(plusknop);

        minknop = new Button();
        minknop.setLabel("-");
        minknopListener min = new minknopListener();
        minknop.addActionListener(min);
        add(minknop);

        delenknop = new Button();
        delenknop.setLabel("/");
        delenknopListener delen = new delenknopListener();
        delenknop.addActionListener(delen);
        add(delenknop);

        schermtekst = "";
        s="";




    }



    public void paint(Graphics g) {

        g.drawString(schermtekst,50,60);
        g.drawString(s,50,60);

    }

    class keerknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s=tekstvak.getText();
            tekstvak.setText("");



            repaint();
        }
    }class plusknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s=tekstvak.getText();
            tekstvak.setText("");




            repaint();
        }
    }class minknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {



            s=tekstvak.getText();
            tekstvak.setText("");




            repaint();
        }
    }
    class delenknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            s=tekstvak.getText();
            tekstvak.setText("");





            repaint();
        }
    }


}
