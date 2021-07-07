package ir.far5had.weather.util;

public class TextUtils {

    public static String splitByInter(String text){
        char[] chars = text.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (Character s : chars) {
            stringBuilder.append(s).append("\n");
        }
        return stringBuilder.toString();
    }
}
