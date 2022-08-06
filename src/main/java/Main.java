import java.util.Arrays;

public class Main {

    public static boolean isSuccess(int age) {
        return age >= 18;
    }
    public static int getsuccessfulAgesCount(int[] values){
        int completeResult = 0;


        for (int value : values) {
            if (Main.isSuccess(value)){
                completeResult++;
            }
        }
        return completeResult;

    }
}