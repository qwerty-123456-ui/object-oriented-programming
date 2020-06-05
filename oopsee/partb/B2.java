import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/* <applet code="B2" width=500 height=500>
 * </applet>*/
public class B2 extends Applet implements ActionListener
{
	Button b1,b2,b3,b4;
	TextField t1;
	TextField t2;
	TextField t3;
	Label l1,l2,l3;
	public void init()
	{
	        b1=new Button("+");
		b2=new Button("-");
		b3=new Button("*");
	        b4=new Button("/");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		l1=new Label("Enter 1st number : ");
	        l2=new Label("Enter 2nd number : ");
		l3=new Label("Result : ");
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(b1);add(b2);add(b3);add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String action=ae.getActionCommand();
		if(action.equals("+"))
		{
			t3.setText(String.valueOf((Integer.parseInt(t1.getText()))+(Integer.parseInt(t2.getText()))));
		}
		if(action.equals("-"))
                {
                        t3.setText(String.valueOf((Integer.parseInt(t1.getText()))-(Integer.parseInt(t2.getText()))));
                }
		if(action.equals("*"))
                {
                        t3.setText(String.valueOf((Integer.parseInt(t1.getText()))*(Integer.parseInt(t2.getText()))));
                }
		if(action.equals("/"))
                {
                        t3.setText(String.valueOf((Integer.parseInt(t1.getText()))/(Integer.parseInt(t2.getText()))));
                }
	}

}


