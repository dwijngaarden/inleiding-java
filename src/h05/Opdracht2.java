package h05;


import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    int baseY = 200;
    int hoogtevalerie;
    int yvalerie;
    int hoogtejeroen;
    int yjeroen;
    int hoogtehans;
    int yhans;


    public void init() {
        hoogtevalerie = 40;
        yvalerie = baseY - hoogtevalerie;
        hoogtejeroen = 100;
        yjeroen= baseY - hoogtejeroen;
        hoogtehans = 80;
        yhans= baseY - hoogtehans;

    }

    public void paint(Graphics g) {

        g.setColor(Color.blue);
        g.fillRect(100,yvalerie,20,hoogtevalerie);
        g.setColor(Color.RED);
        g.fillRect(150,yjeroen,20,hoogtejeroen);
        g.setColor(Color.yellow);
        g.fillRect(200,yhans,20,hoogtehans);
        g.setColor(Color.BLACK);
        g.drawString("valerie",90,210);
        g.drawString("Jeroen",140,210);
        g.drawString("Hans",195,210);
        g.drawLine(95,baseY-100,95,200);
        g.drawLine(95,200,300,200);
        g.drawString("0",85,200);
        g.drawString("20",80,180);
        g.drawString("40",80,160);
        g.drawString("60",80,140);
        g.drawString("80",80,120);
        g.drawString("100",75,100);
    }

}
