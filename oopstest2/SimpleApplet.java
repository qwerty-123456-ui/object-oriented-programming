/* <applet code="SimpleApplet" width=200 height=60>
 * </applet>
 */
import java.awt.*;
import java.applet.*;
public class SimpleApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("hello applet world ",20,20);
	}
}
