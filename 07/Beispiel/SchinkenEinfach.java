import java.util.Arrays;

public class Schinken implements Comparable<Schinken>{
    private int size;
    private int weight;
    
    Schinken(int s, int w) {
        size = s;
        weight = w;
    }
    
    @Override
    public int compareTo(Schinken another) {
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
        Schinken hans = new Schinken(3,5);
        Schinken herbert = new Schinken(24,78);
        
        System.out.println(hans.compareTo(herbert));
        
/*        
        if (hans < herbert) {
            System.out.println("ente");
        }
*/
        Schinken[] arr = {hans, herbert, new Schinken(32,2)};
        Arrays.sort(arr);
        for (Schinken i : arr) {
            System.out.println(i.size);
        }

    }
}