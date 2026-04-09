import java.util.TreeSet;
public class close {
    public static void main(String[] args) {
        TreeSet<Integer> tree=new TreeSet();
        int arr[]={10,15,20,25,30};
        int target=23;
        for(int i:arr){
            tree.add(i);
        }
        int floor=tree.floor(target);
        int ceil=tree.ceiling(target);
        System.out.println((target-floor)>(target-ceil)?floor:ceil);
    }
}
