package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        // 인스턴스 생성 제약
    }

    public static int sum(int[] values) {
        int total = 0;

        for (int v : values) {
            total += v;
        }

        return total;
    }

    public static double average(int[] values) {

        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];

        for (int v : values) {
            if (v < minValue) {
                minValue = v;
            }
        }

        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = 0;

        for (int v : values) {
            if (v > maxValue) {
                maxValue = v;
            }
        }

        return maxValue;
    }
}
