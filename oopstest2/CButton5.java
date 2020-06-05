/*<applet code="CButton5" width=200 height=200>
 * </applet>
 */
import java.awt.Button;
import java.awt.Graphics;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CButton5 extends Applet implements ActionListener
{
        String actionmsg="";
	int i,f=1;
        public void init()
        {
                Button b1=new Button("Fact");
                Button b2=new Button("Clear");
                add(b1);
                add(b2);
                b1.addActionListener(this);
                b2.addActionListener(this);
        }
        public void paint(Graphics g)
        {
                g.drawString(actionmsg,10,50);
        }
        public void actionPerformed(ActionEvent ae)
        {
                String action=ae.getActionCommand();
                if(action.equals("Fact"))
		{
			for(i=1;i<=10;i++)
				f*=i;
                        actionmsg="Factorial is "+f+"\n";
		}
		if(action.equals("Clear"))
                                actionmsg="CANCEL BUTTONPRESSED\n";
                repaint();
        }
}
