	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	
public class Caidan2 extends MouseAdapter implements ActionListener {

	JFrame mf = new JFrame("菜单");
	JPanel p1 = new JPanel();
	JMenuBar mb = new JMenuBar();
	JPopupMenu pm = new JPopupMenu();
	JTextArea ta = new JTextArea();
	
	JMenu m1 = new JMenu("文件");
	JMenu m2 = new JMenu("编辑");
	JMenu m3 = new JMenu("格式");
	JMenu m4 = new JMenu("settings");
	
	
	JMenuItem mi1 = new JMenuItem("new");
	JMenuItem mi2 = new JMenuItem("save");
	JMenuItem mi3 = new JMenuItem("insert");
	JMenuItem mi4 = new JMenuItem("save and quit");
	JMenuItem mi5 = new JMenuItem("界面");
	JMenuItem mi6 = new JMenuItem("图像");
	
	JMenuItem mi7 = new JMenuItem("复制");
	JMenuItem mi8 = new JMenuItem("粘贴");
	JMenuItem mi9 = new JMenuItem("剪贴");
	JMenuItem mi10 = new JMenuItem("全选");
	JMenuItem mi11 = new JMenuItem("");
	JMenuItem mi12 = new JMenuItem("");
	JMenuItem mi13 = new JMenuItem("");
	
	JLabel l1 = new JLabel();
	
	
	
	
	
	
public void go() {
	mf.setLayout(new BorderLayout());
	mf.setJMenuBar(mb);
	mb.add(m1);
	mb.add(m2);
	mb.add(m3);
	m1.add(mi1);
	mi1.addActionListener(this);
	m1.add(mi2);
	mi2.addActionListener(this);
	m1.add(mi3);
	m1.addSeparator();
	mi3.addActionListener(this);
	m1.add(m4);
	m4.add(mi5);
	m1.addSeparator();
	mi4.addActionListener(this);
	m4.add(mi6);
	mi5.addActionListener(this);
	m1.add(mi4);
	mi6.addActionListener(this);
	mi4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, ActionEvent.ALT_MASK));  //下拉菜单
	
	
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

	pm.add(mi7);
	pm.addSeparator();
	pm.add(mi8);
	pm.addSeparator();
	pm.add(jm7);
	pm.add(mi9);
	pm.add(mi10);    //鼠标菜单
	l1.addMouseListener(this);
	
	
	ta.setEditable(false);
	mf.add(l1);
	mf.add(ta,BorderLayout.SOUTH);
	mf.setSize(400, 400);
	mf.setVisible(true);
	mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}





public static void main(String[] args){
	Caidan2 test = new Caidan2();
	test.go();

}


@Override
public void actionPerformed(ActionEvent e) {
	ta.setText(e.getActionCommand());
	if(e.getActionCommand()=="save and quit")
	{
		System.exit(0);		
	}
	
}
public void mousePressed(MouseEvent e)
{	
	maybeShowPopup(e);
}

private void maybeShowPopup(MouseEvent e)
{	if (e.isPopupTrigger()){	
	pm.show(e.getComponent(),
	e.getX(), e.getY());
}
}
}