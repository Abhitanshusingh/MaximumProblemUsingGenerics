public class Maximum {
    //LOGIC FOR FIND MAXIMUM VALUE
    public static <E extends Comparable> E maximumValue(E[] Array) {
        E maximum = Array[0];
        for (E index : Array) {
            if (index.compareTo(maximum) > 0) {
                maximum = index;
            }
        }
        return maximum;
    }
}