
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GenerateQuestions {

	public static void main(String[] args) {
		ArrayList<Question> questions = new ArrayList<Question>();
		questions.add(new SingleQuestion2("问题一：今天星期几？", 
				new String[] {"星期天","星期一","星期二", "星期三", "星期四", "星期五", "星期六"}, 
				new char[] {'F'}));
		questions.add(new MultiQuestion2("赵勇杰帅吗？", 
				new String[] {"丑", "巨丑", "非常丑"}, 
				new char[] {'A','B','C'}));
		try {
			ObjectOutputStream qout = new ObjectOutputStream(
					new FileOutputStream("question.dat"));
			for(Question question : questions) {
				qout.writeObject(question);
			}
			qout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Over");
	}

}
