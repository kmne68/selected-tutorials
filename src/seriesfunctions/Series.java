/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriesfunctions;

/**
 *
 * @author kemery
 */
public class Series {
    
    public static int nSum(int n) {
        
    //    int sum = 0;
        
        if(n == 0) {
            return 0;
        } else {
            return n + nSum(n - 1);
        }
        
        
//        for(int i = 0; i <= n; i++) {
//            sum += i;
//        }
        
//        return sum;
    }
    
    public static int factorial(int n) {
        
        int result;
        // basecase 0
        if (n == 0) {
            return 1;
        }
        result = n * factorial(n - 1);
        
        return result;
    }
    
    
    public static int fibonacci (int n) {
        
        int result;
        
        if(n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
                
        result = fibonacci(n - 1) + fibonacci(n - 2);
        
        return result;
        
    }
}
