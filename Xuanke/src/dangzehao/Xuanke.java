package dangzehao;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Xuanke implements ActionListener{

	JFrame j1;
	JPanel p1,p2,p3;
	JButton b1,b2,b3,b4;
	JTextArea ta1;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	
public void go(){
	
	
	j1 = new JFrame("选课系统");
	p1 = new JPanel();
	p2 = new JPanel();
	p3 = new JPanel();
	b1 = new JButton("提交");
	b1.addActionListener(this);
	b2 = new JButton();
	b3 = new JButton();
	b4 = new JButton();
	ta1 = new JTextArea(20,20);
	l1 = new JLabel("姓名");
	l2 = new JLabel("班级");
	l3 = new JLabel("学号");
	t1 = new JTextField(5);
	t2 = new JTextField(5);
	t3 = new JTextField(5);
	
	p1.add(l1);
	p1.add(t1);
	p1.add(l2);
	p1.add(t2);
	p1.add(b1);
	p3.add(ta1);
	
	j1.add(p1);
	j1.add(p2);
	j1.add(p3);
	j1.pack();
	j1.setLayout(new FlowLayout(5));
	j1.setVisible(true);
	j1.setSize(500, 500);
	j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
}
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		String s1 =t1.getText();
		ta1.setText(s1);
	}

}
