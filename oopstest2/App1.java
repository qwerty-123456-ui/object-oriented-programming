/*<applet code="App1" width=400 height=400>
 * </applet>
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class App1 extends Applet implements MouseListener,MouseMotionListener,KeyListener
{
	String msg="";
	int mx=0,my=0;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,mx,my);
	}
	public void mousePressed(MouseEvent me)
	{
		msg="mouse pressed";
		mx=10;
		my=10;
		repaint();
	}
	public void mouseClicked(MouseEvent me)
        {
                msg="mouse clicked";
                mx=10;
                my=10;
                repaint();
        }
	public void mouseReleased(MouseEvent me)
        {
                msg="mouse released";
                mx=10;
                my=10;
                repaint();
        }
	public void mouseEntered(MouseEvent me)
        {
                msg="mouse enetered";
                mx=10;
                my=10;
                repaint();
        }
	public void mouseExited(MouseEvent me)
        {
                msg="mouse exited";
                mx=10;
                my=10;
                repaint();
        }
	public void mouseMoved(MouseEvent me)
        {
		msg="";
                mx=me.getX();
                my=me.getY();
		showStatus("moving at "+mx+" , "+my);
                repaint();
        }
	public void mouseDragged(MouseEvent me)
        {
		showStatus("Dragging mouse at "+me.getX()+" , "+me.getY());
         
        }
	public void keyPressed(KeyEvent k)
	{
		showStatus("key pressed");
	}
	public void keyReleased(KeyEvent k)
	{
		showStatus("key released");
	}
	public void keyTyped(KeyEvent k)
	{
		msg=msg+k.getKeyChar();
		repaint();
	}
}

