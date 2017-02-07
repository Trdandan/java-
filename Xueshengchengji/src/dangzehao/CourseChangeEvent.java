package dangzehao;

import java.util.EventObject;

public class CourseChangeEvent extends EventObject{
	
	private int maxnum = 0;
	private int stunum = 0;
	
	
	public CourseChangeEvent(Object source,int max,int stu) {
		super(source);
		this.maxnum = max;
		this.stunum = stu;
		
		String a1 = new String();
		if(stu>max){
			a1 = "超出名额"+(stu-max)+"人！";		
		}
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}
