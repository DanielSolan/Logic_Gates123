public class AND extends Gate{


    public AND(boolean intA, boolean intB){
        super(intA, intB, "AND");
    }

    public boolean getOutput(){
        if (inputA == true && inputB == true){
            return true;
        } else{
            return false;
        }
    }


}
