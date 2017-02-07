package dangzehao;

import java.util.Vector;

public class MyCourseBean {

	private String name="";     //课程名
	private int countnum=0;     //选课学生
	private int maxnum=0;       //招生最大数
	private Vector <ICourseChangeListener> listeners = new Vector <ICourseChangeListener> ();

	public MyCourseBean()
	{
		this.name = "java";
		// TODO Auto-generated constructor stub
	}
	
	MyCourseBean(String na)
	{
		this.name = na;
	}
	
	public String getCourse()
	{
		return this.name;	
	}
	
	public void setCount(String str)
	{
		this.name = str;
		this.countnum++;
	//	notifySourseChange();
	}

	public int getCount(){     //返回选课的学生人数
		return this.countnum;
	}
	public int getMax(){     //返回招生限额
		return this.maxnum;
	}
	public void setMax(int max){    //设置新的招生线
		this.maxnum=max;
	}
	public synchronized void addCourseChangeListener(ICourseChangeListener l) {
		listeners.add(l);
	}
	public synchronized void removeCourseChangeListener(ICourseChangeListener l) {
		listeners.removeElement(l);
	}
	protected void notifySourceChange() {
		    Vector v;
		    CourseChangeEvent e = new CourseChangeEvent(this, maxnum, countnum);
		    synchronized (this) 
		    {
		      v = (Vector) listeners.clone();
		    }
		    for (int i = 0; i < v.size(); i++) 
		    {
		    	((ICourseChangeListener) v.elementAt(i)).coursechange(e);
		    }
	}
}

