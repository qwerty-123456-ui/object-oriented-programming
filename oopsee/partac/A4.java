/*<applet code="A4" width=400 height=400>
 * </applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class A4 extends Applet
{
	String msg="";
	public void init()
	{
		addMouseListener(new MouseAdapter()
				{
					public void mouseClicked(MouseEvent me)
					{
						msg="WELCOME";
						repaint();
					}
					public void mouseReleased(MouseEvent me)
					{
						msg="GOOD BYE";
						repaint();
					}
				});
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,20,20);
	}
}
