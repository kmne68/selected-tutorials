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
    
}
