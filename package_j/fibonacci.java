package package_j;

/**
 * Class that contains fibonacci number`s value and order
 */
public class fibonacci {
    private int num;
    private int value;

    /**
     * Constuctor to assign index and value to the object of the fibonacci class
     * @param num - index of the fibonacci number
     * @param value - value of the fibonacci number
     */
    public fibonacci(int num, int value){
        this.num = num;
        this.value = value;
    }

    
    /** 
     * Method to get an index of the fibonacci number
     * @return int
     */
    public int getNum(){
        return num;
    }
    
    /** 
     * Method to get a value of the fibonacci number
     * @return int
     */
    public int getValue(){
        return value;
    }

    
    /** 
     * Method to set index and value of the fibonacci number
     * @param num
     * @param value
     */
    public void setNumValue(int num, int value){
        this.num = num;
        this.value = value;
    }

    
    /** 
     * Method to check if last digit of the value of fibonacci number
     * is the same as set number
     * @param digit - set by user number
     * @return boolean - returns true or false depending on the result of calculation
     */
    public boolean lastDigit(int digit){
        return this.value % 10 == digit;
    }
}
