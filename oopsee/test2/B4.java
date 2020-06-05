/*<applet code="B4" width=400 height=400>
 * </applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class B4 extends Applet //implements MouseListener
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
		g.drawString(msg,10,10);
	}
}


