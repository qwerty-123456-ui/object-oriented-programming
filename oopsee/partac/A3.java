/*<applet code="A3" width=400 height=400>
 * </applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class A3 extends Applet implements KeyListener
{
	TextField t1;
	Label l;
	public void init()
	{
		setLayout(null);
		l=new Label("Enter number");
		l.setBounds(20,50,120,20);
		add(l);
		t1=new TextField(10);
		t1.setBounds(150,50,100,20);
		add(t1);
		t1.addKeyListener(this);
	}
	public void keyPressed(KeyEvent e)
	{
		int r,m=0;
		if(e.getKeyChar()=='r' || e.getKeyChar() =='R')
		{
			int a=Integer.parseInt(t1.getText());
			while(a!=0)
			{
				r=a%10;
				m=m*10+r;
				a=a/10;
			}
			showStatus("reverse of number is "+Integer.toString(m));
		}
	}
	public void keyTyped(KeyEvent e)
	{
	}
	public void keyReleased(KeyEvent e)
	{
	}
}




