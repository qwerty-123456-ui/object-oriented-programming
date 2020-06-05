/*<applet code="CButton2" width=300 height=300>
 * </applet>
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class CButton2 extends Applet implements KeyListener
{
	String msg="";
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent k)
	{
		showStatus("KeyPressed");
	}
	public void keyReleased(KeyEvent k)
	{
		showStatus("KeyReleased");
	}
	public void keyTyped(KeyEvent k)
	{
		msg=msg+k.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,20,40);
	}
}
