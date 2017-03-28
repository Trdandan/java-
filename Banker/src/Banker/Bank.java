package Banker;

import com.sun.source.tree.WhileLoopTree;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
/**
 * Created by dangzehao on 2016/12/26.
 */
public class Bank implements ActionListener {
    int m;
    int n;
    int[][] Max;
    int[][] Allocation;
    int[][] Need;
    int[] Avaliable;

    JFrame mainFrame = new JFrame();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();

    JButton b1 = new JButton("再来一回");
    JButton b2 = new JButton("退出");

    JLabel j1 = new JLabel("Max");
    JLabel j2 = new JLabel("Allocation");
    JLabel j3 = new JLabel("Need");
    JLabel j4 = new JLabel("Available");
    JLabel j5 = new JLabel("   ");
   // JTable table = new JTable();


    JTextArea jt1 = new JTextArea(3,10);
    JTextArea jt2 = new JTextArea(3,10);
    JTextArea jt3 = new JTextArea(3,10);
    JTextArea jt4 = new JTextArea(3,10);
    JTextArea jt5 = new JTextArea(3,10);
    JTextArea jt6 = new JTextArea(3,25);

    public void Banker() {

        mainFrame.setVisible(true);
        mainFrame.setSize(500, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(p1, BorderLayout.NORTH);
        mainFrame.add(p2, BorderLayout.CENTER);
        mainFrame.add(p3, BorderLayout.SOUTH);
        //   mainFrame.pack();
        //  p1.add(ta1);

        p1.setLayout(new GridLayout(0, 5));
        p1.add(j5);
        p1.add(j1);
        p1.add(j2);
        p1.add(j3);
        p1.add(j4);

        p2.setLayout(new GridLayout(0, 5));
        p2.add(jt1);
        p2.add(jt2);
        p2.add(jt3);
        p2.add(jt4);
        p2.add(jt5);

        p3.add(jt6);
        b1.addActionListener(this);
        p3.add(b1);
        b2.addActionListener(this);
        p3.add(b2);

        Scanner s = new Scanner(System.in);
        System.out.println("请输入系统中的 进程数 和 资源类型数");
        m = s.nextInt();
        n = s.nextInt();

        Max = new int[m][n];
        Allocation = new int[m][n];
        Need = new int[m][n];
        Avaliable = new int[n];

        for (int i = 0; i < Allocation.length; i++) {
            System.out.print("请输入第" + i + "个最大需求量（Max）\n");
            for (int j = 0; j < Max[i].length; j++) {
                Max[i][j] = s.nextInt();
            }
        }


        for (int i = 0; i < Max.length; i++) {
            System.out.println("请输入第" + i + "分配数（Allocation）");

            for (int j = 0; j < Allocation[i].length; j++) {
                Allocation[i][j] = s.nextInt();
            }
        }


        for (int i = 0; i < Need.length; i++) {
            for (int j = 0; j < Need[i].length; j++) {
                Need[i][j] = Max[i][j] - Allocation[i][j];
            }
        }
        System.out.print("请输入资源的剩余数量（available）");
        for (int i = 0; i < Avaliable.length; i++) {

            Avaliable[i] = s.nextInt();
        }



        for (int i = 0; i < m; i++) {

            jt1.append("p" + i + "进程\n");
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                jt2.append("" + Max[i][j]);
                jt3.append("" + Allocation[i][j]);
                jt4.append("" + Need[i][j]);
                jt5.append("" + Avaliable[j]);

            }
            jt2.append("\n");
            jt3.append("\n");
            jt4.append("\n");
            jt5.append("\n");
        }
    }



    public void DeadBlock() {
        int[] security = new int[m];
        boolean[] param = new boolean[m];
        int[] pan = new int[n];
        int count = 0;
        int num1 = m + 1;
        int num2 = m;

        while (num1 > 0) {
            for (int i = 0; i < m; i++)
            {
                if (param[i] == false)
                {

                    param[i] = true;
                    for (int j = 0; j < n; j++) {
                        pan[j] = Avaliable[j] - Need[i][j];
                        if (pan[j] < 0) {
                            param[i] = false;
                        }
                    }
                    if (param[i] == true) {
                        for (int k = 0; k < n; k++) {
                            Avaliable[k] = Avaliable[k] + Allocation[i][k];
                        }
                        security[count] = i;
                        count++;
                        num2--;
                    }

                }
            }
            num1--;

            while ((num2 == 0) && (num1 > 0))
            {
            jt6.append("安全序列为：");
                for (int i = 0; i < m; i++) {
                    if (i == (m - 1)) {

                        jt6.append("p"+security[i]);
                    } else {

                    jt6.append("p"+security[i]+"-->");
                    }
                }

                return ;
            }
            while ((num1 == 0) && (num2 > 0)) {

                jt6.append("安全序列不存在");
                return;
            }


        }
  //  jt6.append("213123123123");
    }



    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource()==b1){
        System.out.print("\n");
        Banker();
       DeadBlock();

    }
    if (e.getSource()==b2){
        System.exit(0);

    }
    }
}
