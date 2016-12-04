	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

public class Caidan extends MouseAdapter implements ActionListener
{
	JFrame mainframe;
	JPanel jp1;
	JMenuBar jmb;
	
	JPopupMenu jpm;
	
	JTextArea ta;
	
	public static void main(String args[])
	{
		Caidan menu = new Caidan();
		menu.go();
	}
	
	public void go()
	{
		mainframe = new JFrame("记事本");
		
		jpm = new JPopupMenu();
		
		jp1 = new JPanel();
		
		JLabel jl1 = new JLabel();
		
		JCheckBoxMenuItem jcb1 = new JCheckBoxMenuItem("控制字符");
		JRadioButtonMenuItem jrb1 = new JRadioButtonMenuItem("MFC",true);
		JRadioButtonMenuItem jrb2 = new JRadioButtonMenuItem("STL");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
		
		jmb = new JMenuBar();
		JMenu m1 = new JMenu("文件");
		
		JMenu m2 = new JMenu("编辑");
		
		JMenu jm6 = new JMenu("插入");
		jm6.add(jcb1);
		jm6.addSeparator();
		jm6.add(jrb1);
		jm6.add(jrb2);
		
		JMenu m3 = new JMenu("格式");
		
		JMenuItem m6 = new JMenuItem("新建");
		m6.addActionListener(this);
		JMenuItem m7 = new JMenuItem("另存为");
		m7.addActionListener(this);
		JMenu m8 = new JMenu("页面设置");
		JMenuItem m9 = new JMenuItem("退出");
		m9.addActionListener(this);
		m9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, ActionEvent.ALT_MASK));
		
		JMenuItem m0 = new JMenuItem("页眉");
		m0.addActionListener(this);
		JMenuItem m11 = new JMenuItem("页脚");
		m11.addActionListener(this);
		
		JMenuItem m12 = new JMenuItem("撤销");
		m12.addActionListener(this);
		m12.setEnabled(false);
		JMenuItem m13 = new JMenuItem("全选");
		m13.addActionListener(this);
		
		JCheckBoxMenuItem m14 = new JCheckBoxMenuItem("自动换行");
		
		JMenuItem m16 = new JMenuItem("状态栏");
		m16.setEnabled(false);
		
		m1.add(m6);
		m1.add(m7);
		m1.addSeparator();
		m1.add(m8);
		m1.addSeparator();
		m1.add(m9);
		m8.add(m0);
		m8.add(m11);
		
		m2.add(m12);
		m2.add(jm6);
		m2.add(m13);
		
		m3.add(m14);
		
		jmb.add(m1);
		jmb.add(m2);
		jmb.add(m3);
		
		JMenuItem jm0 = new JMenuItem("撤销");
		jm0.setEnabled(false);
		JMenuItem jm1 = new JMenuItem("粘贴");
		jm1.addActionListener(this);
		JMenuItem jm2 = new JMenuItem("复制");
		jm2.addActionListener(this);
		JMenuItem jm3 = new JMenuItem("剪切");
		jm3.addActionListener(this);
		JMenuItem jm4 = new JMenuItem("段落");
		jm4.addActionListener(this);
		JMenuItem jm5 = new JMenuItem("全选");
		jm5.addActionListener(this);
	
		JMenu jm7 = new JMenu("字体");
		JRadioButtonMenuItem jrb3 = new JRadioButtonMenuItem("宋体");
		JRadioButtonMenuItem jrb4 = new JRadioButtonMenuItem("黑体");
		JRadioButtonMenuItem jrb5 = new JRadioButtonMenuItem("方正幼圆");
		JRadioButtonMenuItem jrb6 = new JRadioButtonMenuItem("楷体");
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(jrb3);
		bg2.add(jrb4);
		bg2.add(jrb5);
		bg2.add(jrb6);
		
		jm7.add(jrb3);
		jm7.add(jrb4);
		jm7.add(jrb5);
		jm7.add(jrb6);
		jpm.add(jm0);
		jpm.add(jm1);
		jpm.add(jm7);
		jpm.add(jm2);
		jpm.addSeparator();
		jpm.add(jm3);
		jpm.addSeparator();
		jpm.add(jm4);
		jpm.add(jm5);
		jl1.addMouseListener(this);
		
		ta = new JTextArea();
		ta.setEditable(false);
		
		//jp1.add(ta);
		Container cp = mainframe.getContentPane();
		cp.add(ta,BorderLayout.SOUTH);
		cp.add(jl1);
		
		mainframe.setJMenuBar(jmb);
		//mainframe.add(cp);
		
		mainframe.setSize(500, 500);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.setLocationRelativeTo(null);
		mainframe.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		ta.setText(e.getActionCommand());

		if (e.getActionCommand()=="退出")
		{	
			System.exit(0);
		}
	}

	public void mousePressed(MouseEvent e)
	{	
		maybeShowPopup(e);
	}

	public void mouseReleased(MouseEvent e)
	{	
		maybeShowPopup(e);
	}
	
	private void maybeShowPopup(MouseEvent e)
	{	if (e.isPopupTrigger()){	//判断是否单击了引发弹出式菜单的鼠标键
		jpm.show(e.getComponent(),
		e.getX(), e.getY());
	}
}
}   

