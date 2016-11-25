package Dangzehao;
import javax.swing.*;
import java.awt.*;

public class Jianli {

	JFrame j1 = new JFrame("简历");
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();
	JPanel p7 = new JPanel();
	JPanel p8 = new JPanel();
	
	JTextField t1 = new JTextField(5);
	JTextField t2 = new JTextField(5);
	JTextField t3 = new JTextField(5);
	JTextField t4 = new JTextField(5);
	JTextField t5 = new JTextField(5);
	JTextField t6 = new JTextField(5);
	JTextField t7 = new JTextField(5);
	JTextField t8 = new JTextField(5);
	
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();

	JLabel l1 = new JLabel("姓名");
	JLabel l2 = new JLabel("性别");
	JLabel l3 = new JLabel("出生年月");
	JLabel l4 = new JLabel("学历");
	JLabel l5 = new JLabel("毕业学校");
	JLabel l6 = new JLabel("身高");
	JLabel l7 = new JLabel("主修专业");
	JLabel l8 = new JLabel("联系电话");
	JLabel l9 = new JLabel("实习经历");
	JLabel l10 = new JLabel("1.");
	JLabel l11 = new JLabel("2.");
	
	JCheckBox c1 = new JCheckBox("c语言");
	JCheckBox c2 = new JCheckBox("java");
	JCheckBox c3 = new JCheckBox("数据库");
	JCheckBox c4 = new JCheckBox("数据结构");
	JCheckBox c5 = new JCheckBox("汇编语言");
	
	JRadioButton r1 = new JRadioButton("男");
	JRadioButton r2 = new JRadioButton("女");
	ButtonGroup g1 = new ButtonGroup();
	JRadioButton r3 = new JRadioButton();
	JRadioButton r4 = new JRadioButton();
	
	JTextArea jt1 = new JTextArea(2,30);
	JTextArea jt2 = new JTextArea(2,30);
public void go(){
	j1.setLayout(new GridLayout(8,0));
	
	p1.setLayout(new FlowLayout(5,10,10));
	p1.add(l1);
	p1.add(t1);  //xingm
	p1.add(l2);
	g1.add(r1);
	g1.add(r2);
	p1.add(r1);	 //xingb
	p1.add(r2);
	
	p2.setLayout(new FlowLayout(5));
	p2.add(l3);
	p2.add(t2);	//chus
	p2.add(l4);
	p2.add(t3); 	// xueli

	p3.setLayout(new FlowLayout(5));
	p3.add(l5);
	p3.add(t4);
	p3.add(l6);
	p3.add(t5);
	
	p4.setLayout(new FlowLayout(5));
	p4.add(l7);
	p4.add(t6);
	p4.add(l8);
	p4.add(t7);
	
	p5.setLayout(new FlowLayout(5));
	p5.add(c1);
	p5.add(c2);
	p5.add(c3);
	p5.add(c4);
	p5.add(c5);
	
	p6.setLayout(new FlowLayout(10));
	p6.add(l9);
	
//	p7.setLayout(new GridLayout(1, 2));
	p7.add(l10);
	p7.add(jt1);
	
//	p8.setLayout(new GridLayout(1,2));
	p8.add(l11);
	p8.add(jt2);
	
	jt1.setLineWrap(true);
	jt2.setLineWrap(true);
	
	j1.add(p1);
	j1.add(p2);
	j1.add(p3);
	j1.add(p4);
	j1.add(p5);
	j1.add(p6);
	j1.add(p7);
	j1.add(p8);
	j1.pack();
	j1.setSize(400, 300);
	j1.setVisible(true);
	j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
}
}