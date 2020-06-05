import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Mouses" width=300 height=800>
 </applet>*/
class Mouses extends Applet implements MouseListener
{
        String msg="";
	public void init()
	{
		addMouseListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString("hello",100,100);
	}
	public void mouseClicked(MouseEvent e)
	{
		msg="CLIcked";
		repaint();
	}
	  public void mouseExited(MouseEvent e)
        {
                msg="CLIcked";
                repaint();
        }
         public void mouseEntered(MouseEvent e)
        {       
                msg="CLIcked";
                repaint();
        }       
        public void mousePressed(MouseEvent e)
        {       
                msg="CLIcked";
                repaint();
        }       
        public void mouseReleased(MouseEvent e)
        {       
                msg="CLIcked";
                repaint();
        }       
}
