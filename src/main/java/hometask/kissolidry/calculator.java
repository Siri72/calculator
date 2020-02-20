package hometask.kissolidry;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class calculator extends JApplet implements ActionListener {
	
	JFrame f;
	JTextField t;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,bs;
	double a=0,b=0,result=0;
	int op=0;
	String msg="",val="",opt="";
	public void init()
	{
		f=new JFrame("MYCALCULATOR");
		t=new JTextField(20);
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b10=new JButton("0");
		b11=new JButton(".");
		b12=new JButton("+");
		b13=new JButton("-");
		b14=new JButton("*");
		b15=new JButton("/");
		b16=new JButton("%");
		b17=new JButton("clear");
		b18=new JButton("=");
		bs=new JButton("<-");
		t.setBounds(200, 200, 200 , 50);
		f.add(t);
		b1.setBounds(100, 300, 100, 50);
		f.add(b1);
		b2.setBounds(300,300,100,50);
		f.add(b2);
		b3.setBounds(500, 300, 100, 50);
		f.add(b3);
		b4.setBounds(100,400,100,50);
		f.add(b4);
		b5.setBounds(300, 400, 100, 50);
		f.add(b5);
		b6.setBounds(500,400,100,50);
		f.add(b6);
		b7.setBounds(100, 500, 100, 50);
		f.add(b7);
		b8.setBounds(300,500,100,50);
		f.add(b8);
		b9.setBounds(500, 500, 100, 50);
		f.add(b9);
		b10.setBounds(100,600,100,50);
		f.add(b10);
		b11.setBounds(300, 600, 100, 50);
		f.add(b11);
		b12.setBounds(500,600,100,50);
		f.add(b12);
		b13.setBounds(100, 700, 100, 50);
		f.add(b13);
		b14.setBounds(300,700,100,50);
		f.add(b14);
		b15.setBounds(500, 700, 100, 50);
		f.add(b15);
		b16.setBounds(100,800,100,50);
		f.add(b16);
		b17.setBounds(300, 800, 100, 50);
		f.add(b17);
		b18.setBounds(500,800,100,50);
		f.add(b18);
		bs.setBounds(500, 200, 100, 50);
		f.add(bs);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(1000, 1000);
		b1.addActionListener((ActionListener) this);
		b2.addActionListener((ActionListener) this);
		b3.addActionListener((ActionListener) this);
		b4.addActionListener((ActionListener) this);
		b5.addActionListener((ActionListener) this);
		b6.addActionListener((ActionListener) this);
		b7.addActionListener((ActionListener) this);
		b8.addActionListener((ActionListener) this);
		b9.addActionListener((ActionListener) this);
		b10.addActionListener((ActionListener) this);
		b11.addActionListener((ActionListener) this);
		b12.addActionListener((ActionListener) this);
		b13.addActionListener((ActionListener) this);
		b14.addActionListener((ActionListener) this);
		b15.addActionListener((ActionListener) this);
		b16.addActionListener((ActionListener) this);
		b17.addActionListener((ActionListener) this);
		b18.addActionListener((ActionListener) this);
		bs.addActionListener((ActionListener) this);
	}
	public void itemStateChanged(ItemEvent ie) {
		repaint();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
		t.setText(t.getText().concat("1"));
		}
		if(e.getSource()==b2)
			t.setText(t.getText().concat("2"));
		if(e.getSource()==b3)
			t.setText(t.getText().concat("3"));
		if(e.getSource()==b4)
			t.setText(t.getText().concat("4"));
		if(e.getSource()==b5)
			t.setText(t.getText().concat("5"));
		if(e.getSource()==b6)
			t.setText(t.getText().concat("6"));
		if(e.getSource()==b7)
			t.setText(t.getText().concat("7"));
		if(e.getSource()==b8)
			t.setText(t.getText().concat("8"));
		if(e.getSource()==b9)
			t.setText(t.getText().concat("9"));
		if(e.getSource()==b10)
			t.setText(t.getText().concat("0"));
		if(e.getSource()==b11)
			t.setText(t.getText().concat("."));
		if(e.getSource()==b12) {
			a=Double.parseDouble(t.getText());
			op=1;
			t.setText("");}
		if(e.getSource()==b13)
		{
			a=Double.parseDouble(t.getText());
			op=2;
			t.setText("");}
		if(e.getSource()==b14)
		{
			a=Double.parseDouble(t.getText());
			op=3;
			t.setText("");}
		if(e.getSource()==b15)
		{
			a=Double.parseDouble(t.getText());
			op=4;
			t.setText("");}
		if(e.getSource()==b16)
		{
			a=Double.parseDouble(t.getText());
			op=5;
			t.setText("");}
		
		if(e.getSource()==b18)
		{
			b=Double.parseDouble(t.getText());
			switch(op) 
			{
			case 1:
				result=a+b;
				break;
			case 2:
				result=a-b;
				break;
			case 3:
				result=a*b;
				break;
			case 4:
				result=a/b;
				break;
			case 5:
				result=a%b;
				break;
			default:result=0;
			}
			t.setText(""+result);
			}
		if(e.getSource()==b17)
			t.setText("");
		if(e.getSource()==bs)
		{
			String s=t.getText();
			t.setText("");
			for(int i=0;i<s.length()-1;i++)
			{
				t.setText(t.getText()+s.charAt(i));
			}
}
	}
	

}


