package h10;

import javax.print.DocFlavor;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {


    TextField tekstvak;
    int maxvalue;




    public void init() {


        tekstvak = new TextField("",10);
        tekstvak.addActionListener(new tekstvakListener());
        maxvalue = 0 ;

        add(tekstvak);

    }


    public void paint(Graphics g) {

        g.drawString("MAX VALUE : "+maxvalue,50,100);

    }

    class tekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int Newnumber = Integer.parseInt(tekstvak.getText());

            if (Newnumber > maxvalue){
                maxvalue = Newnumber ;



                repaint();

            }
            }



        }
    }

