
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/*<applet code="B3" width=400 height=400>
 * </applet>*/
public class B3 extends Applet implements ActionListener
{
        TextField t;
        public void init()
        {
                t=new TextField(10);
                Button b=new Button("R");
		add(t);
		add(b);
		b.addActionListener(this);
        }
        public void actionPerformed(ActionEvent ae)
        {
                String action=ae.getActionCommand();
                if(action=="R")
                {
                        int m=0,r=0;
                        int i=Integer.parseInt(t.getText());
                        while(i != 0)
                        {
                                r=i%10;
                                m=m*10+r;
                                i=i/10;
                        }
                        showStatus("Reverse of number is :"+m);
                }
        }
}

