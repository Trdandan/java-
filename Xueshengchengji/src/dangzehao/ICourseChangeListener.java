package dangzehao;

import java.util.EventListener;

public interface ICourseChangeListener extends EventListener{
	
	void coursechange(CourseChangeEvent e);

}
