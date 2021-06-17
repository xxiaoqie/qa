
import java.util.Arrays;

public class MultiQuestion2 extends Question {
	char[] answers;
	public MultiQuestion2(String title, String[] options, char[] answers) {
		super(title, options);
		this.answers = answers;
	}
	public MultiQuestion2(char[] answers) {
		this.answers = answers;
	}
	public char[] getAnswers() {
		return answers;
	}
	public void setAnswers(char[] answers) {
		this.answers = answers;
	}
	@Override
	protected boolean check(char[] answers) {//子类函数④
		Arrays.sort(answers);	
		return Arrays.equals(this.answers,answers);
	}
}
