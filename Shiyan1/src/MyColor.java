import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyColor implements  ActionListener{
   
	JButton button;
	JFrame   frame;
	JPanel   panel, p1 ,p2;
	int num=3;
	

public void go(){
        frame= new JFrame("Color");
		button= new JButton("Button");
	  
		panel=new JPanel();
frame.setVisible(true);
frame.pack();
frame.add(panel);
panel.add(button);
button.addActionListener(this);
frame.setSize(500, 500);

		
	}

public void actionPerformed(ActionEvent e) {
	 if(num==3){
           panel.setBackground(Color.blue);
		}
	
     else if(num==2){
          panel.setBackground(Color.black);
         }
	 
	else if(num==1){
		panel.setBackground(Color.yellow);
    }
	 
			num--;
			
	if(num==0)
	{
		num=3;
	}


}
public static void main(String[] args){
MyColor c= new MyColor();
		c.go();		
	}
}
