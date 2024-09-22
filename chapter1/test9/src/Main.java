import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        double area, width, height;
        System.out.println("请输入矩阵的长：");
        height = sc.nextDouble();
        System.out.println("请输入矩阵的宽：");
        width = sc.nextDouble();
        area = width * height;
        System.out.println("The area is :" + area);

    }
}
