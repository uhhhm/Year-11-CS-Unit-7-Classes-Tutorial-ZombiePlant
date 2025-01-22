public class ZombiePlant {
    private int maximumPontecy;
    private int treatmentsNeeded;

    public ZombiePlant(int a, int b){
        maximumPontecy = a;
        treatmentsNeeded = b;
    }

    public int getPotency(){
        return maximumPontecy;
    }
    public boolean isDangerous(){
        return treatmentsNeeded > 0;
    }

    public void treat(int a){
        if(a <= 0){
            return;
        }
        if(maximumPontecy >= a && treatmentsNeeded > 0){
            treatmentsNeeded--;
        }
        else if(maximumPontecy <= a && treatmentsNeeded >= 0){
            treatmentsNeeded++;
        }
    }

    public int treatmentsNeeded(){
        return treatmentsNeeded;
    }
}
