
import java.io.Serializable;

public abstract class  Question implements Serializable{
    private  String title;   //题干
    private  String[] options;  //选项
    public Question(String title, String[] options) {
        this.title = title;
        this.options = options;
    }
    public Question() {
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String[] getOptions() {
        return options;
    }
    public void setOptions(String[] options) {
        this.options = options;
    }
    protected void  print() {//函数①
    	if(options.length > 1) {
    		System.out.print("（多选）");
    	} else {
    		System.out.print("（单选）");
    	}
        System.out.println(title);//输出问题X
        for (int i = 0; i < options.length ; i++) {//循环选项个数
            System.out.print((char)('A'+i)+"."+options[i]+" ");//输出第几个选项+“.”+选项几
        }
        System.out.println();
    }
    protected abstract boolean check(char[] answers);//抽象类函数②，子类函数③④
}
