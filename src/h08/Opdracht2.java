package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht2 extends Applet {

    Button mannenknop;
    Button vrouwenknop;
    Button jongensknop;
    Button meisjesknop;
    int mannen;
    int vrouwen;
    int jongen;
    int meisje;
    int totaal;



    public void init() {
        mannenknop = new Button();
        mannenknop.setLabel("man");
        MannenknopListener man = new MannenknopListener();
        mannenknop.addActionListener(man);
        mannen = 0;
        add(mannenknop);




        vrouwenknop = new Button("vrouw");
        vrouwenknop.setLabel("vrouw");
        vrouwenknopListener vrouw = new vrouwenknopListener();
        vrouwenknop.addActionListener(vrouw);
        vrouwen = 0;
        add(vrouwenknop);



        jongensknop = new Button("jongen");
        JongensknopListener  jongen = new JongensknopListener();
        jongensknop.addActionListener(jongen);

        add(jongensknop);



        meisjesknop = new Button("meisje");
        MeisjesknopListener meisje = new MeisjesknopListener();
        meisjesknop.addActionListener(meisje);

        add(meisjesknop);

    }


    public void paint(Graphics g) {
        g.drawString("man: "+mannen, 50,100);
        g.drawString("vrouw: "+vrouwen,150,100);
        g.drawString("jongen: "+jongen,250,100);
        g.drawString("meisje: "+meisje,350,100);
        g.drawString("totaal: "+totaal,450,100);
        mannenknop.setLocation(50,50);
        vrouwenknop.setLocation(150,50);
        jongensknop.setLocation(250,50);
        meisjesknop.setLocation(350,50);

    }


    class MannenknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannen++;
            totaal++;
            repaint();
        }
    }
    class vrouwenknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwen++;
            totaal++;
            repaint();
        }
    }class JongensknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jongen++;
            totaal++;
            repaint();
        }
    }class MeisjesknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            meisje++;
            totaal++;
            repaint();
        }
    }
    }




