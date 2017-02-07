package dangzehao;

public class XTest {
	public static void main(String[] args){
		MyCourse c=new MyCourse();
		MyCourseBean bean=new MyCourseBean();
		bean.addCourseChangeListener(c);
		bean.setMax(5);
		bean.setCount("C语言");
		System.out.println("报名人数:"+bean.getCount()+          "课程名:"+bean.getCourse()+         "招生限额:"+bean.getMax());
		bean.setCount("java");
		System.out.println("报名人数:"+bean.getCount()+          "课程名:"+bean.getCourse()+         "招生限额:"+bean.getMax());
		bean.setCount("C++");
		System.out.println("报名人数:"+bean.getCount()+          "课程名:"+bean.getCourse()+         "招生限额:"+bean.getMax());
	}

}
