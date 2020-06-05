/*<applet code="B3" width=400 height=400>
 * </applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class B3 extends Applet implements KeyListener
{
	TextField t1;
	Label l;
	public void init()
	{
		t1=new TextField(10);
		l=new Label("Enter number");
		add(l);
		add(t1);
		t1.addKeyListener(this);
	}
	public void keyTyped(KeyEvent ke)
	{
	}
	public void keyReleased(KeyEvent ke)
	{
	}
	public void keyPressed(KeyEvent ke)
	{
		if(ke.getKeyChar()=='r' || ke.getKeyChar()=='R')
		{
			int i=Integer.parseInt(t1.getText());
                        int r,m=0;
			while(i!=0)
			{
				r=i%10;
				m=m*10+r;
				i=i/10;
			}
			showStatus("Reverse of number is "+String.valueOf(m));
		}
	}
}

