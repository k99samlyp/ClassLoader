import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by LiYangpan on 2019-03-02  10:55.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class Tester {

    private int a;

    int age = 9;

    //yyyy

    volatile int r = 680;

    String g = "123";

    int yyy = 9800;



    String tf = "celeronD";

    String mem = "kingston";

    boolean mk = false;

    transient int anInt = 9;

    transient int anInt1 = 9;

    public static void main(String[] args){
        List<String> al = new ArrayList<String>();

        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");

        for (int t = 0; t < 4; t++){
            al.remove(0);
        }


//        for (String _t : al){
//            al.remove(_t);
//        }

//        for (Iterator iterator = al.iterator(); iterator.hasNext(); iterator.next()){
//            iterator.remove();
//        }

//        Iterator iterator = al.iterator();
//        while (iterator.hasNext()){
//            iterator.next();
//            iterator.remove();

      //  }

        System.out.println("fin");


        String aaa = "aaa";
        String bbb = new String("bbb");

        //WeakReference
    }

}
