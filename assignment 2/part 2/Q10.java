import java.util.HashMap;

public class Q10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,8,6,10};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(i,arr[i]);
        }
        System.out.println("Smallest Missing element is: "+getSmallMissing(hm));
    }
    public static int getSmallMissing(HashMap<Integer, Integer> hm){
        for (int i = 1; i < 11; i++) {
           if(!hm.containsValue(i))
               return i;
        }
        return -1;
    }
}
