import java.util.*;
class Freq{
    public List<Character> sortChar(String s){
        //Count frequency of each character in the string
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){  
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //Store map entries in a list
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        //Sort
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
            public int compare(Map.Entry<Character,Integer> a, Map.Entry<Character,Integer> b){
                return b.getValue() - a.getValue(); // Sort in descending order of frequency
            }
        });
    }
    public static void main(String args[]){

    }
}