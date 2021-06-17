import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Question2Demo {
    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<Question>();
        	ObjectInputStream qin;
			try {
				qin = new ObjectInputStream(
						new FileInputStream("question.dat"));
				while(true) {
					questions.add((Question)qin.readObject());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        
        
        Scanner in = new Scanner(System.in);//输入待检测答案
        for (Question question:questions) {//循环数组
            if(question != null){//非空数组判断
                question.print();//输出标题 问题选项，调用函数①
                System.out.print("答案: ");
                String s = in.next().toUpperCase();//输入元素内容赋给s字符串
                char[] result = s.toCharArray();//字符串转变为字符数组
                if(question.check(result)){//字符数组对比
                    System.out.println("正确");
                } else {
                    if(question instanceof SingleQuestion2) {
                    	System.out.println("错误"+((SingleQuestion2) question).getAnswer()[0]+"为正确选项");
                    } else{
                        System.out.print("错误，以下为正确选项");

                        for (int i = 0; i < ((MultiQuestion2)question).getAnswers().length; i++) {
                            System.out.print(((MultiQuestion2)question).getAnswers()[i]);
                        }
                    }
                }
            }
        }
    }
}
