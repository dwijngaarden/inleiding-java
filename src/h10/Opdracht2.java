package h10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {


    TextField tekstvak;
    int maxvalue;
    int minvalue;
    boolean firstNumber = true;


    public void init() {


        tekstvak = new TextField("",10);
        tekstvak.addActionListener(new tekstvakListener());
        maxvalue = 0 ;
        minvalue = 0 ;

        add(tekstvak);

    }


    public void paint(Graphics g) {

        g.drawString("MAX VALUE : "+maxvalue,50,100);
        g.drawString("MIN VALUE : "+minvalue, 50, 150);

    }

    class tekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int newNumber = Integer.parseInt(tekstvak.getText());

            if (firstNumber) {
                maxvalue = newNumber;
                minvalue = newNumber;
                firstNumber = false;
            } else {
                if (newNumber > maxvalue) {
                    maxvalue = newNumber;
                }
                if (newNumber < minvalue){
                    minvalue = newNumber;
                }
            }





                repaint();

            }
        }



    }


