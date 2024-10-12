//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.util.Scanner;

public class task5 {
    public task5() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter three corner points:");
        double var2 = var1.nextDouble();
        double var4 = var1.nextDouble();
        double var6 = var1.nextDouble();
        double var8 = var1.nextDouble();
        double var10 = var1.nextDouble();
        double var12 = var1.nextDouble();
        double var14 = Math.sqrt((var6 - var10) * (var6 - var10) + (var8 - var12) * (var8 - var12));
        double var16 = Math.sqrt((var2 - var10) * (var2 - var10) + (var4 - var12) * (var4 - var12));
        double var18 = Math.sqrt((var2 - var6) * (var2 - var6) + (var4 - var8) * (var4 - var8));
        double var20 = Math.toDegrees(Math.acos((var14 * var14 - var16 * var16 - var18 * var18) / (-2.0 * var16 * var18)));
        double var22 = Math.toDegrees(Math.acos((var16 * var16 - var14 * var14 - var18 * var18) / (-2.0 * var14 * var18)));
        double var24 = Math.toDegrees(Math.acos((var18 * var18 - var16 * var16 - var14 * var14) / (-2.0 * var14 * var16)));
        PrintStream var10000 = System.out;
        double var10001 = (double)Math.round(var20 * 100.0) / 100.0;
        var10000.println("The three angles are " + var10001 + (double)Math.round(var22 * 100.0) / 100.0 + (double)Math.round(var24 * 100.0) / 100.0);
    }
}
