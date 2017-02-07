package dangzehao;

public class MyCourse implements ICourseChangeListener{

	@Override
	public void coursechange(CourseChangeEvent e) {
		// TODO Auto-generated method stub
		System.out.print("事件对象中的信息:事件源"+e.getSource().getClass().getName());
		System.out.print("发生招生事件");
		System.out.println(e.toString());

		
		
	}

}
