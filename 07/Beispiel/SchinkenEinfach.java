import java.util.Arrays;

public class SchinkenEinfach implements Comparable<SchinkenEinfach>{
    private int size;
    private int weight;
    
    SchinkenEinfach(int s, int w) {
        size = s;
        weight = w;
    }
    
    @Override
    public int compareTo(SchinkenEinfach another) {
        if (this.size < another.size){
            return -1;
        } else if (this.size == another.size) {
            if (this.weight < another.weight) {
                return -1;
            } else if (this.weight == another.weight) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }
    
    
    public static void main(String[] args) {
        SchinkenEinfach hans = new SchinkenEinfach(3,5);
        SchinkenEinfach herbert = new SchinkenEinfach(24,78);
        
        System.out.println(hans.compareTo(herbert));
        
 
        SchinkenEinfach[] arr = {hans, herbert, new SchinkenEinfach(32,2)};
        Arrays.sort(arr);
        for (SchinkenEinfach i : arr) {
            System.out.println(i.size);
        }

    }
}