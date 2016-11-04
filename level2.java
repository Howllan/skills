import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by hasee on 2016/11/4.
 */
public class level2 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        Iterator<String> iter = arrayList.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        for(int i = 0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
