/*<applet code="B2" width=400 height=400>
 * </applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class B2 extends Applet implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
        Button b1,b2,b3,b4;
	public void init()
	{
		//setLayout(null);
		l1=new Label("Enter 1 no");
		l1.setBounds(20,50,120,50);
		l2=new Label("Enter 2 no");
		l2.setBounds(20,50,120,50);
		l3=new Label("result");
		l3.setBounds(20,50,120,50);
		t1=new TextField(20);
		t1.setBounds(150,50,100,50);
		t2=new TextField(20);
		t2.setBounds(150,50,100,50);
		t3=new TextField(20);
		t3.setBounds(1500,50,100,50);
		Button b1=new Button("+");
		Button b2=new Button("-");
		Button b3=new Button("*");
		Button b4=new Button("/");
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
			t3.setText(String.valueOf(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText())));
		}
		if(action.equals("-"))
                {
                        t3.setText(String.valueOf(Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText())));
                }
		if(action.equals("*"))
                {
                        t3.setText(String.valueOf(Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText())));
                }
		if(action.equals("/"))
                {
                        t3.setText(String.valueOf(Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText())));
                }
	}
}

