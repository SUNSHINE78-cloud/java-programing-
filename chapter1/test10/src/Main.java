import java.util.Scanner;
public class test10 {
    public static double timeTrans(int hours, int minutes, float seconds) {
        double times;
        times = hours * 3600 + minutes * 60 + seconds;
        return times;
    }
    public static double speedAsumulate(double times, float runLenth) {
        double runSpeed = runLenth / times;
        return runSpeed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The runer has run " + "__(km)");
        float runLenth = sc.nextFloat();
        System.out.println("The time is __(hours)__(minutes)__(seconds)");
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        float seconds = sc.nextFloat();
        double times = timeTrans(hours, minutes, seconds);
        double c = speedAsumulate(times, runLenth);
        c = c * 3600 / 1.6;
        System.out.println("The run speed is " + c + "mile/h ");
    }
}
