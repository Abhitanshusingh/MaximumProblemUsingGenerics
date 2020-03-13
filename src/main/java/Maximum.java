public class Maximum {
    //LOGIC FOR FIND INTEGER MAXIMUM VALUE
    public static Integer findMaximumNumber(Integer[] intArray) {
        Integer maximum = 0;
        for (Integer index : intArray) {
            if (index.compareTo(maximum) > 0) {
                maximum = index;
            }
        }
        return maximum;
    }

    //LOGIC FOR FIND FLOAT MAXIMUM VALUE
    public static Float MaximumFloatValue(Float[] intArray) {
        Float maximum = 0f;
        for (Float index : intArray) {
            if (index.compareTo(maximum) > 0) {
                maximum = index;
            }
        }
        return maximum;
    }

    //LOGIC FOR FIND STRING MAXIMUM VALUE
    public static String MaximumStringValue(String[] intArray) {
        String maximum = "";
        for (String index : intArray) {
            if (index.compareTo(maximum) > 0) {
                maximum = index;
            }
        }
        return maximum;
    }
}