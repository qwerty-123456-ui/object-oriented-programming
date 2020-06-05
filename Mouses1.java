import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Mouses1" width="300" height="800">
 </applet>*/
public class Mouses1 extends Applet implements MouseListener
{
        String msg="";
        public void init()
        {
                addMouseListener(this);
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
	  public void paint(Graphics g)
        {
                g.drawString(msg,100,100);
        }

}

