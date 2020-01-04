package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class test extends JFrame implements ActionListener{

	JButton aButton;
	JButton bButton;
	JButton redButton;
	JButton grnButton;
	JButton sixButton;
	JButton fiveButton;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton zeroButton;
	JButton resetButton;
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	  JPanel panel4 = new JPanel();
	  JPanel panel5 = new JPanel();
	  
	  JPanel panel6 = new JPanel();
	  JPanel panel7 = new JPanel();
	  JPanel panel8 = new JPanel();
	  JPanel panel9 = new JPanel();
	  JPanel panel0 = new JPanel();
	  JPanel panelr = new JPanel();
	  JPanel pnLeft = new JPanel();
	  JPanel pnRight = new JPanel();
	  JPanel pnBot=new JPanel();
	int lock=3;
	int count=3;
	public test(String string) {
		// TODO Auto-generated constructor stub
		//super(string); //calls <JFrame> class's constructor
		//This version would be prettier
		setTitle(string);
		this.setLayout(new FlowLayout());
		
		aButton=new JButton("1");
		aButton.addActionListener(this);
		
		bButton=new JButton("2");
		bButton.addActionListener(this);
		
		redButton=new JButton("3");
		redButton.addActionListener(this);
		
		grnButton=new JButton("4");
		grnButton.addActionListener(this);
		
		fiveButton=new JButton("5");
		fiveButton.addActionListener(this);
		
		sixButton=new JButton("6");
		sixButton.addActionListener(this);
		
		sevenButton=new JButton("7");
		sevenButton.addActionListener(this);
		
		eightButton=new JButton("8");
		eightButton.addActionListener(this);
		
		nineButton=new JButton("9");
		nineButton.addActionListener(this);
		
		zeroButton=new JButton("0");
		zeroButton.addActionListener(this);
		
		resetButton=new JButton("Reset");
		resetButton.addActionListener(this);
		
		/*add(aButton);
		add(bButton);
		add(redButton);
		add(grnButton);
		add(fiveButton);
		add(sixButton);
		add(sevenButton);
		add(eightButton);
		add(nineButton);
		add(zeroButton);
		add(resetButton);*/
		add(pnLeft);
		pnLeft.setLayout( new BoxLayout( pnLeft, BoxLayout.Y_AXIS ) ); 
		pnLeft.add ( panel1 ); pnLeft.add( panel2 ); pnLeft.add ( panel3 ); pnLeft.add( panel4 ); 
		//add(panel1);
		//add(panel2);
		//add(panel3);
		//add(panel4);
		
		panel1.add(aButton); panel1.add(bButton); panel1.add(redButton);
		panel2.add(grnButton);panel2.add(fiveButton); panel2.add(sixButton);
		panel3.add(sevenButton);panel3.add(eightButton); panel3.add(nineButton);
		panel4.add(zeroButton); panel4.add(resetButton);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		//First part of class
		test frame = new test("Button Demo");
		frame.setSize(150,200);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.count--;
		System.out.println(this.lock);
		//System.out.println(this.count);
		if(e.getActionCommand().equals("7")&&this.lock==3)
		{
			this.getContentPane().setBackground(Color.blue);
			this.lock--;
		}
		else if(e.getActionCommand().equals("3")&&this.lock==2)
		{
			this.getContentPane().setBackground(Color.blue);
			this.lock--;
		}
		else if(e.getActionCommand().equals("5")&&this.lock==1)
		{
			this.getContentPane().setBackground(Color.blue);
			this.lock--;
			System.exit(0);
		}
		
		else if(e.getActionCommand().equals("Reset"))
		{
			this.getContentPane().setBackground(Color.GREEN);
			this.count=3;
			this.lock=3;
		}
		else if(this.count!=this.lock)
		{
			this.getContentPane().setBackground(Color.red);
			this.count--;
			this.lock--;
		}
				/*else if(this.count!=this.lock)
		{
			this.getContentPane().setBackground(Color.red);
			this.count--;
			this.lock--;
		}*/
		
		else
		{
			this.getContentPane().setBackground(Color.green);
			count=3;
			lock=3;
		}
		repaint();
		
		
	}

}
