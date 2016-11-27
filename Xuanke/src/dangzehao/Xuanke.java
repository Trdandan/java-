package dangzehao;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Xuanke implements ActionListener{

	JFrame j1;
	JPanel p1,p2,p3;
	JButton b1,b2,b3,b4;
	JTextArea ta1;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JCheckBox cb1,cb2,cb3;
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
	
	cb1 = new JCheckBox("c语言");
	cb1.addActionListener(this);
	cb2 = new JCheckBox("java");
	cb2.addActionListener(this);
	cb3 = new JCheckBox("数据结构");
	cb3.addActionListener(this);
	
	p1.add(l1);
	p1.add(t1);
	p1.add(l2);
	p1.add(t2);
	p1.add(b1);
	p2.add(cb1);
	p2.add(cb2);
	p2.add(cb3);
	
	p3.add(ta1);
	
	j1.add(p1,BorderLayout.NORTH);
	j1.add(p2,BorderLayout.CENTER);
	j1.add(p3,BorderLayout.SOUTH);
	j1.pack();
	j1.setLayout(new BorderLayout());
	
	j1.setVisible(true);
	j1.setSize(300, 400);
	j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}

public void actionPerformed(ActionEvent e)
{

		if(e.getSource() == cb1)
	{
		 ta1.append("\n " + t1.getText()+"   "+t1.getText()+"   "+cb1.getText()+"   "+cb1.isSelected());
	}
	else if(e.getSource() == cb2)
	{
		ta1.append("\n " + t1.getText()+"   "+t1.getText()+ "   "+cb2.getText()+ "   "+cb2.isSelected());
	}
	else if(e.getSource() == cb3)
	{
		ta1.append("\n " + t1.getText()+"   "+t1.getText()+"   "+ cb3.getText()+ "   "+cb3.isSelected());
	}

	}

}
