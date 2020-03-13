public class Maximum {
    static Integer maximum = 0;
    public static Integer findMaximumNumber(Integer[] intArray) {
        for (Integer index : intArray) {
            if (index.compareTo(maximum) > 0) {
                maximum = index;
            }
        }
        return maximum;
    }
}