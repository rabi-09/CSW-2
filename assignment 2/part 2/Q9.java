import java.util.HashSet;

public class Q9 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,4,6,8,1,2,6,5,4};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j])
                    hs.add(arr[i]);
            }
        }
        System.out.println(hs);
    }
}
