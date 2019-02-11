package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht03 extends Applet {

int positief;
        int Positief;
        int uitkomst;

    public void init() {
       positief = 2000000000;
       Positief = 2000000000;
       uitkomst = positief + Positief;
    }

    public void paint(Graphics g) {
        g.drawString("negatief :"+uitkomst,20,30);


    }
}