/*<applet code="B2" width=400 height=400>
 * </applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class B2 extends Applet implements ActionListener
{
        TextField t1,t2,t3;
        Label l1,l2,l3;
        Button b1,b2,b3,b4;
        public void init()
        {
                l1=new Label("Enter 1 no");
                l2=new Label("Enter 2 no");
                l3=new Label("result");
                t1=new TextField(20);
                t2=new TextField(20);
                t3=new TextField(20);
                b1=new Button("+");
                b2=new Button("-");
                b3=new Button("*");
                b4=new Button("/");
                add(l1);add(t1);add(l2);
                add(t2);
                add(l3);
                add(t3);
                add(b1);add(b2);add(b3);add(b4);
                b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
                b4.addActionListener(this);
        }
        public void actionPerformed(ActionEvent ae)
        {
                String action=ae.getActionCommand();
                if(action.equals("+"))
                {
                        t3.setText(String.valueOf(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText())));
                }
                if(action.equals("-"))
                {
                        t3.setText(String.valueOf(Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText())));
                }
                if(action.equals("*"))
                {
                        t3.setText(String.valueOf(Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText())));

                }
                if(action.equals("/"))
                {
                        t3.setText(String.valueOf(Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText())));
                }
        }
}

