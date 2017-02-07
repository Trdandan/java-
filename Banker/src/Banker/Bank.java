package Banker;

import java.util.Scanner;

public class Bank 
{	
	int m;
	int n;
	int [][] Max;
	int [][] Allocation;
	int [][] Need;
	int [][] Avaliable;
	
public Bank()
{
	Scanner s = new Scanner(System.in);
	System.out.println("请输入系统中的 进程数 和 资源类型数");
	m = s.nextInt();
	n = s.nextInt();
		
	Max = new int[m][n];
	Allocation = new int[m][n];
	Need = new int[m][n];	
	Avaliable = new int[m][n];

	for(int i=0;i<Max.length;i++)
	{
		System.out.println("请输入第"+i+"个进程的各个资源数");
		
		for(int j=0;j<Max[i].length;j++){
			
			
		}
	}


}




}
