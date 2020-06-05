

/*<applet code="CButton1" width=200 height=200>
 * </applet>
 */
import java.awt.*;
import java.awt.Graphics;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class CButton1 extends Applet implements ActionListener
{
        String msg="";
	Button b1;
                Button b2;
                Label l1;
                Label l2;
                TextField t1;
                TextField t2;
  	static int n,i;
        public void init()
        {
                b1=new Button("Compute");
                b2=new Button("Clear");
		l1=new Label("Enter a value\n");
		l2=new Label("Result");
		t1=new TextField(10);
	        t2=new TextField(10);
                add(l1);
                add(t1);
		add(b1);
		add(l2);
		add(t2);
		add(b2);
                b1.addActionListener(this);
                b2.addActionListener(this);
	       // l2.addActionListener(this);
	//	l1.addActionListener(this);
	//	t1.addActionListener(this);
	  //      t2.addActionListener(this);
        }
        public void paint(Graphics g)
        {
                g.drawString(msg,10,50);
        }

        public void actionPerformed(ActionEvent ae)
        {
		n=Integer.parseInt(t1.getText());
		int fact=1;
                String action=ae.getActionCommand();
                if(action.equals("Compute"))
		{
			if(n==0 || n==1)
			{
				fact=1;
				t2.setText(String.valueOf(fact));
			}
			else
			{
				for(i=1;i<=n;i++)
					fact *=i;
			}
			t2.setText(String.valueOf(fact));
		}
                if(action.equals("Clear"))
		{
			t1.setText("");
			t2.setText("");
		}
        }
}

