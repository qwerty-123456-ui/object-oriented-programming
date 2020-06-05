/*<applet code="App" width=400 height=400>
 * </applet>
 */
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Button;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class App extends Applet implements ActionListener 
{
	String msg="";
	Label l1;
	Label l2;
	TextField t1;
	TextField t2;
	public void init()
	{
		Button b1=new Button("Ok");
		Button b2=new Button("Cancel");
		l1=new Label("ENTER A VALUE");
		l2=new Label("RESULT");
		t1=new TextField(10);
		t2=new TextField(10);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);

	//	setForeground(Color.RED);
                setBackground(Color.RED);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.drawString(msg,100,100);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int f=1;
		int n=Integer.parseInt(t1.getText());
		String action=ae.getActionCommand();
		if(action.equals("Ok"))
		{
			if(n==0 || n==1)
			{
				f=1;
				t2.setText(String.valueOf(f));
			}
			else
			{
				for(int i=1;i<=n;i++)
					f*=i;
			}
			t2.setText(String.valueOf(f));
		}
		if(action.equals("Cancel"))
		{
			t1.setText("");
		        t2.setText("");
		}
		repaint();
	}
	

}
