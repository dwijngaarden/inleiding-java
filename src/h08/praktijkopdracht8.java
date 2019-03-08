package h08;

import javax.xml.crypto.dom.DOMCryptoContext;
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







    }



    public void paint(Graphics g) {

        g.drawString(schermtekst  ,50,60);


    }

    class keerknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

//            String invoer =  tekstvak.getText() + tekstvak2.getText();
//            Double keer = Double.parseDouble(invoer);
//            Double uitkomst = Double.parseDouble(invoer)*num1*num2 ;

            double input1 = Double.parseDouble(tekstvak.getText());
            double input2 = Double.parseDouble(tekstvak2.getText());
            double uitkomst = input1 * input2;
            schermtekst = uitkomst+"";





            repaint();
        }
    }class plusknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double input1 = Double.parseDouble(tekstvak.getText());
            double input2 = Double.parseDouble(tekstvak2.getText());
            double uitkomst = input1 + input2;
            schermtekst = uitkomst+"";





            repaint();
        }
    }class minknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            double input1 = Double.parseDouble(tekstvak.getText());
            double input2 = Double.parseDouble(tekstvak2.getText());
            double uitkomst = input1 - input2;
            schermtekst = uitkomst+"";





            repaint();
        }
    }
    class delenknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            double input1 = Double.parseDouble(tekstvak.getText());
            double input2 = Double.parseDouble(tekstvak2.getText());
            double uitkomst = input1 / input2;
            schermtekst = uitkomst+"";





            repaint();
        }
    }


}
