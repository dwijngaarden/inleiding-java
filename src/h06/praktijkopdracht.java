package h06;

import java.awt.*;
import java.applet.*;


public class praktijkopdracht extends Applet {

    double cijfer1;
        double cijfer2;
                double cijfer3;
                double cijfers;
double gemiddelde;
int convert;
double uitkomst;

    public void init() {
        cijfers = 5.9+6.3+6.9 ;

        gemiddelde =  cijfers/3;
        convert= (int) gemiddelde*10;
        uitkomst=convert /10 ;


    }

    public void paint(Graphics g) {
        g.drawString("Gemiddelde cijfers = "+uitkomst,20,30);

    }
}
