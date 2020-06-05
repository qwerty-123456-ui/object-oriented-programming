import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/*<applet code="B4" width=400 height=400>
 * </applet>*/
public class B4 extends Applet //implements MouseListener
{
        String msg="";
        int mouseX=0,mouseY=0;
        public void init()
        {
                addMouseListener(new MouseAdapter()
                                {
                                        public void mouseClicked(MouseEvent me)
                                        {
                                                msg="WELCOME";
                                                mouseX=0;
                                                mouseY=10;
                                                repaint();
                                        }
                                        public void mouseReleased(MouseEvent me)
                                        {
                                                msg="iGOOD BYE";
                                                mouseX=0;
                                                mouseY=10;
                                                repaint();
                                        }
                                        public void mousePressed(MouseEvent me){
                                        }
                                        public void mouseEntered(MouseEvent me){
                                        }
                                        public void mouseExited(MouseEvent me)
					{
                                                mouseX=0;mouseY=0;
                                                msg="mouseExited";
                                                repaint();
                                        }
					

                                });
        }
        public void paint(Graphics g)
        {
                g.drawString(msg,mouseX,mouseY);
        }
}

