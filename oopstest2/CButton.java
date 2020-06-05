/*<applet code="CButton" width=200 height=200>
 * </applet>
 */
import java.awt.Button;
import java.awt.Graphics;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CButton extends Applet implements ActionListener
{
	String actionmsg="";
	public void init()
	{
		Button b1=new Button("Ok");
		Button b2=new Button("Cancel");
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
		if(action.equals("Ok"))
				actionmsg="OK BUTTONPRESSED\n";
		if(action.equals("Cancel"))
                                actionmsg="CANCEL BUTTONPRESSED\n";
		repaint();
	}
}
