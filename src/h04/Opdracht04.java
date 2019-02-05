package h04;


import java.awt.*;
import java.applet.*;

public class Opdracht04 extends Applet {

    int baseY = 200;

    public void init() {
    }

    public void paint(Graphics g) {

g.setColor(Color.blue);
        g.drawRect(100, baseY - 40, 20, 40);
        g.fillRect(100,baseY-40,20,40);
        g.setColor(Color.RED);
        g.drawRect(150,baseY-100,20,100);
        g.fillRect(150,baseY-100,20,100);
        g.setColor(Color.yellow);
        g.drawRect(200,baseY-80,20,80);
        g.fillRect(200,baseY-80,20,80);
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