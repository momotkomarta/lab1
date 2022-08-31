public class fibonacci {
    private int num;
    private int value;

    public fibonacci(int num, int value){
        this.num = num;
        this.value = value;
    }

    public int getNum(){
        return num;
    }
    public int getValue(){
        return value;
    }

    public void setNumValue(int num, int value){
        this.num = num;
        this.value = value;
    }

    public boolean lastDigit(int digit){
        return (this.value % 10 == digit)? true : false;
    }
}
