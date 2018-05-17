
package question7;

/**
 * This program finds the total sum of permutations of an array 
 * @author WahabEhsan
 */
public class Question7 {

    /**
     * Calls the sequence method.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        System.out.println(sequence(arr,new int[arr.length], 0, 1, 0, 0));
    }

    /**
     * This method recursively finds the total sum of the permutations
     * @param arr the array with the elements to be summed
     * @param multarr the array that is being filled
     * @param total the total sum
     * @param indxa first index for moving marker for array
     * @param indxb second index for creating array with appropriate length
     * @param indxc third index for the element to be multiplied by.
     * @return total sum of the permutations 
     */
    public static int sequence(int[] arr, int[] multarr, int total, int indxa, int indxb, int indxc) {
        if(indxb > arr.length - 1){
            return total;
            
        }
        multarr[indxb] = arr[indxa - 1];
        if(indxa == 1){
            sequence(arr,multarr, total, indxa + 1,indxb + 1, indxc);
        }
        total = (multarr[indxc] * multarr[multarr.length - 1]);
        return total + sequence(arr, multarr, total, indxa + 1,indxb + 1, indxc + 1) + sequence(arr, multarr, total, indxa + 1,indxb + 1, indxa);        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
/*public static int sequence(int[] arr, int total, int indx) {
if (indx > arr.length - 1) {
return total;
}
if (indx == 0) {
total = (arr[indx] * arr[indx + 1]);
} else if (indx + 1 > arr.length - 1) {
total = (arr[indx] * arr[indx - 1]);
} else {
total = (arr[indx] * arr[indx - 1]) + (arr[indx] * arr[indx + 1]);
}
return total + sequence(arr, total, indx + 1);
}*/