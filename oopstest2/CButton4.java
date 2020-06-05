/*<applet code="CButton4" width=400 height=400>
 * </applet>
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CButton4 extends Applet implements MouseListener,MouseMotionListener
{
	String msg="";
	int mx=0;
	int my=0;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseEntered(MouseEvent me)
	{
		mx=0;my=0;
		msg="mouseEntered";
		repaint();
	}
	public void mouseExited(MouseEvent me)
        {
                mx=0;my=0;
                msg="mouseExited";
                repaint();
        }
	public void mouseClicked(MouseEvent me)
        {
                mx=0;my=0;
                msg="mouseClicked";
                repaint();
        }
	public void mousePressed(MouseEvent me)
        {
                mx=0;my=0;
                msg="mousePressed";
                repaint();
        }
	public void mouseReleased(MouseEvent me)
        {
                mx=0;my=0;
                msg="mouseReleased";
                repaint();
        }
	public void mouseDragged(MouseEvent me)
        {
                mx=me.getX();
		my=me.getY();
                msg="";
		showStatus("draaging mouse at "+mx+", " +my);
                repaint();
        }
	public void mouseMoved(MouseEvent me)
        {
                showStatus("MOVing mouse at "+me.getX()+", " +me.getY());
        }
	public void paint(Graphics g)
	{
		g.drawString(msg,mx,my);
	}
}

