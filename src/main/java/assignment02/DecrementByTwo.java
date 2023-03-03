package assignment02;

// QUESTION 5;
public class DecrementByTwo {
    public static void main(String[] args){
        // The decrement can either be called within the for-loop condition or inside the for-loop block
        for(int i = 1000; i >= 0; /* i -= 2 */){
            System.out.println(i);
            i -= 2;
        }
    }
}
