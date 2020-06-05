/*<applet code="B3" width=400 height=400>
 * </applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class B3 extends Applet implements KeyListener
{
        Label l1;
        TextField t1;
        //Button b1,b2,b3,b4;
        public void init()
        {
                //setLayout(null);
                l1=new Label("Enter 1 no");
                l1.setBounds(20,50,120,50);
                t1=new TextField(40);
                t1.setBounds(150,50,100,50);
                add(l1);add(t1);
		t1.addKeyListener(this);
	}
	public void keyPressed(KeyEvent k)
	{
		int m=0,r=0;
		if(k.getKeyChar()=='r' || k.getKeyChar()=='R')
		{
			/*int i=Integer.parseInt(t1.getText());
			/while(i!=0)
			{
				r=i%10;
				m=m*10+r;
				i=i/10;
			}*/
			String sa=t1.getText();
			StringBuffer sb=new StringBuffer(sa);
		        showStatus(sb.reverse().toString());
		}
	}
	public void keyTyped(KeyEvent k)
	{
	}
	public void keyReleased(KeyEvent k){}
}

                

