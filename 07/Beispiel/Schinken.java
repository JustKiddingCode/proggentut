import java.util.Arrays;

class Fleisch implements Comparable <Fleisch>{
    private int size;
    private int weight;

    Fleisch (int s, int w){
        size = s;
        weight = w;
    }
    @Override
    public int compareTo(Fleisch another) {
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
    
}

public class Schinken extends Fleisch{
    private String name;
    
    Schinken(int s, int w, String n) {
        super(s, w);
        name = n;
    }
    

    
    public static void main(String[] args) {
        Schinken hans = new Schinken(3,5, "hans");
        Schinken herbert = new Schinken(24,78, "herbert");
        
       
        Schinken[] arr = {hans, herbert, new Schinken(32,2, "hieronymos")};
        Arrays.sort(arr);
        for (Schinken i : arr) {
            System.out.println(i.name);
//            System.out.println(i.size);
        
        }

    }
}