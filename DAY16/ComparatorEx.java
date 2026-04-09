import java.util.*;

class Students implements Comparator<Students> {
    String name;
    int mark;
    int id;
    Students (int id,String name,int mark){
        this.id=id;
        this.name=name;
        this.mark=mark;
    }
    @Override
    public int compare(Students a, Students b){
        return a.id - b.id;     
    }
    @Override
    public String toString(){  //to print the object in a readable format
        return id+" "+name+" "+mark;
    }
}
public class ComparatorEx {
    public static void main(String[] args) {
        List<Students> s=new ArrayList<>();
        s.add(new Students(6,"A", 90));
        s.add(new Students(4,"B", 45));
        s.add(new Students(2,"C", 60));
        s.add(new Students(5,"D", 75));
        Comparator<Students> byId=new Comparator<Students>() {
            public int compare(Students a,Students b){
                return a.id-b.id;
            }
        };
        Collections.sort(s, byId);
        System.out.println("Sorted by ID: " + s);
        Collections.sort(s,(a,b)->a.mark-b.mark);
        System.out.println("Sorted by Mark: " + s);
    }
}

