import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class task2 {
    public static void main(String[] args) {
        int number1 = (int)Math.random()*10;
        int number2 = (int)Math.random()*10;

        Scanner input = new Scanner(System.in);
        System.out.println("What is"+number1+"?"+number2+"?");
        int answer = input.nextInt();

        while(number1 + number2 != answer){
            System.out.println("Wrong answer.Try again");
            answer = input.nextInt();
        }
        System.out.println("You got it!");
    }
}

