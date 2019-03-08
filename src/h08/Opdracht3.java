package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.zip.DeflaterOutputStream;

public class Opdracht3 extends Applet{


    Label label;
    Button knop;
    TextField tekstvak;
    String bedrag;





    public void init() {

tekstvak = new TextField();
        label=new Label();
        label.setText("btw uitrekenen");
        add(label);
        tekstvak=new TextField("",20);
        add(tekstvak);


        knop=new Button();
        knop.setLabel("OK");
        knopListener k2 = new knopListener() ;
        knop.addActionListener(k2);
        add(knop);
        bedrag = "0.00";





    }


    public void paint(Graphics g) {
        g.drawString(bedrag,50,60);

    }
    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String invoer = tekstvak.getText();
            Double uitkomst = Double.parseDouble(invoer);
            Double uitkomstbtw = Double.parseDouble(invoer) * 1.21;
            bedrag = uitkomstbtw+"";










            repaint();
        }
    }
}


