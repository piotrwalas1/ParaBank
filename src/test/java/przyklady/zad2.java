package przyklady;

import java.util.HashMap;
import java.util.Map;

public class zad2 {
    public static void main(String[] args) {
        liczbaWystapien(new String[]{"na","na","on","on","on","ba","ca"});
    }
    public static void liczbaWystapien(String[] numbers){
        Map<String,String> occurences = new HashMap<>();
        for(int i=0; i< numbers.length; i++){
            if(occurences.containsKey(numbers[i])) {
                String value = occurences.get(numbers[i]);
                occurences.put(numbers[i], value+1);
            }else {
                occurences.put(numbers[i], "1");
            }
        }
        System.out.println("ilosc elementow w mapie : "+ occurences.size());




     }
             }
    


