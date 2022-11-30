public class OR extends Gate{

    public OR(boolean intA, boolean intB){
        super(intA, intB, "OR");
    }

    public boolean getOutput(){
        if (inputA == true || inputB == true){
            return true;
        } else{
            return false;
        }
    }
}
