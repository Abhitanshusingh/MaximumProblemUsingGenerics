public class Maximum<E extends Comparable> {
    E firstVariable;
    E secondVariable;
    E thirdVariable;

    //DECLEARED PARAMETERIZED CONSTRUCTOR
    Maximum(E firstVariable, E secondVariable, E thirdVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
        this.thirdVariable = thirdVariable;
    }

    //LOGIC FOR FIND MAXIMUM VALUE
    public <E extends Comparable> E maximumValue() {

        if (firstVariable.compareTo(secondVariable) > 0 && firstVariable.compareTo(thirdVariable) > 0)
            return (E) firstVariable;
        else if (secondVariable.compareTo(firstVariable) > 0 && secondVariable.compareTo(thirdVariable) > 0)
            return (E) secondVariable;
        else
            return (E) thirdVariable;
    }
}