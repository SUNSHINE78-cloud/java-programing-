import java.util.Scanner;//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println();
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                array[row][column] = input.nextInt();
            }
        }
        input.close();
    }
}