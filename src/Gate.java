public class Gate {
    protected boolean inputA;
    protected boolean inputB;
    protected String name;

    //constructor
    public Gate(boolean intA, boolean intB, String inputName){
        valueSet(intA, intB);
        name = inputName;
    }
    //method to read the output
    public void gateOutput(){;
    }

    public boolean getOutput(){
        return false;
    }


    //method to set both inputs at 1.
    public void valueSet(boolean intA, boolean intB){
        inputA = intA;
        inputB = intB;
    }
    //method to display truth table
    public void truthTable(){
        System.out.println("A | B | Q");
        System.out.print("F | F | ");
        valueSet(false, false);
        System.out.println(getOutput());
        System.out.print("F | T | ");
        valueSet(false, true);
        System.out.println(getOutput());
        System.out.print("T | F | ");
        valueSet(true, false);
        System.out.println(getOutput());
        System.out.print("T | T | ");
        valueSet(true, true);
        System.out.println(getOutput());
    }

}
