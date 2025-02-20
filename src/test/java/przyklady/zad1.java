package przyklady;

import java.util.HashMap;
import java.util.Map;
// zliczamy wystapienia danej liczby
public class zad1 {
    public static void main(String[] args) {
        liczbaWystapien(new int[]{1, 1, 2, 2, 2, 4, 5, 7,});
    }
    public static void liczbaWystapien(int[] numbers){
            Map<Integer,Integer> occurences = new HashMap<>();
          for(int i=0; i< numbers.length; i++){
              if(occurences.containsKey(numbers[i])) {
                  Integer value = occurences.get(numbers[i]);
                  occurences.put(numbers[i], value + 1);
              }else {
                  occurences.put(numbers[i],1);
              }
          }
        System.out.println("ilosc elementow w mapie : "+ occurences.size());



            for (Integer key : occurences.keySet()){
                System.out.println("liczba "+ key + "wystepuje" + occurences.get(key));
        }
    }}

