
import java.util.Objects;

public class SingleQuestion2 extends  Question {
	private char[] answer;
	public SingleQuestion2(String title, String[] options, char[] answer) {
		super(title, options);
		this.answer = answer;
	}
	public SingleQuestion2(char[] answer) {
		this.answer = answer;
	}
	public char[] getAnswer() {
		return answer;
	}
	public void setAnswer(char[] answer) {
		this.answer = answer;
	}

	@Override
	protected boolean check(char[] answers) {//子类函数③
		//  return Objects.equals(this.answer[0]);
		return this.answer[0] == answers[0];
	}
}
