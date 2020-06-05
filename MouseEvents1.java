import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
      <applet code="MouseEvents1" width=300 Height=100>
      </applet>
*/
public class MouseEvents1 extends Applet implements MouseListener,MouseMotionListener
{

        String msg=" ";
        int mouseX=0,mouseY=0;  //Coordinates of mouse

        public void init()
        {
                addMouseListener(this);
                addMouseMotionListener(this);
        }
//handle Mouse Entered
        public void mouseEntered(MouseEvent me)
        {
                //save coordinates
                mouseX=0;
                mouseY=10;
                msg="Mouse Entered";
                repaint();
        }
//handle MouseExited
        public void mouseExited(MouseEvent me)
        {
                //save coordinates
                mouseX=0;
                mouseY=10;
                msg="Mouse Exited";
                repaint();
        }
//handle Mouse Button pressed
        public void mousePressed(MouseEvent me)
        {
                //save coordinates
                mouseX=me.getX();
                mouseY=me.getY();
                msg="Down";
                repaint();
        }
//handle Mouse Released
        public void mouseReleased(MouseEvent me)
        {
                //save coordinates
                mouseX=me.getX();
                mouseY=me.getY();
                msg="Up";
                repaint();
        }
//handle Mouse Dragged
        public void mouseDragged(MouseEvent me)
        {
                //save coordinates
                mouseX=me.getX();
                mouseY=me.getY();
                msg="*";
                showStatus("Dragging mouse at "+mouseX+", "+mouseY);
                repaint();
        }
//handle Mouse moved
        public void mouseMoved(MouseEvent me)
        {
                showStatus("Moving mouse at "+me.getX()+", "+me.getY());
        }
public void mouseClicked(MouseEvent m)
        {
                msg="MSRIT";
                setBackground(Color.pink);
                showStatus("Mouse Clicked");
                repaint();
        }
//Display message in applet window at current x, y location
        public void paint(Graphics g)
        {
                g.drawString(msg,mouseX,mouseY);
        }
}

