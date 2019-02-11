package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht02 extends Applet {
   int seconden,uur,dag,jaar;



    public void init() {
seconden = 60;
uur = seconden*seconden;
dag = uur * 24;
jaar = dag*365;
    }

    public void paint(Graphics g) {
        g.drawString("Seconden: "+seconden,20,15);
        g.drawString("Uur: "+uur,20,30);
        g.drawString("Dag: "+dag,20,45);
        g.drawString("Jaar: "+jaar,20,60);

    }
}
