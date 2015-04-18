
package fibonacci;


public class Fibonacci {

    
    public static void main(String[] args) {
        
        int sumEvenValued = 0;
        int term = 0;
        
        for(int i = 0; ; i++) {
            term = fib(i);
            
            if( fib(i) < 4000000) { //перевірка чи член не перевищує значення 4000000
                if (fib(i)%2 == 0){ //перевірка на парність
                    
                    sumEvenValued = sumEvenValued + term;
                }
            } else {
                break;
            }
        }
        
        System.out.println(sumEvenValued);
                
    }
    
    private static int fib (int arg) {   // рекурсивна функція для розрахунку членів послідовності Фібоначчі
        if (arg == 0){
            return 0;
        }
        if (arg == 1) {
            return 1;
        }
        else{
            return fib(arg -2) + fib (arg -1);
        }
    }
}
