import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public  class Tmp implements ActionListener{
	
	
	JFrame j1 = new JFrame("温度转换");
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	
	JLabel l1 = new JLabel("    华氏度");
	JLabel l2 = new JLabel("    摄氏度");
	JLabel l3 = new JLabel("      k");
	
	JTextField t1 = new JTextField(15);
	JTextField t2 = new JTextField(15);
	JTextField t3 = new JTextField(15);
	
	//JButton b1 = new JButton("转换");
	
	
//		j1.setVisible(true);
//		j1.setSize(500, 500);
	public void go(){	
		p1.setLayout(new GridLayout(3, 2));
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		//p2.add(b1);
		
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		
		j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j1.add(p1);
		//j1.getContentPane().add(p2, "South");
		j1.setVisible(true);
		j1.setSize(500, 500);
		j1.pack();
		
		
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==t1){
			String a =t1.getText();
            int b=Integer.parseInt(a);
            
            int c=(b-32)*5/9;
      
			t2.setText(c+"");
            int d=c+273;
            t3.setText(d+"");  
			
		}		
	}


	public static void main(String[] args) {
		Tmp a = new Tmp();
		a.go();
	

}

}
