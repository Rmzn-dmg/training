package vektor;


import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String >();
        vector.add("java");
        vector.add("Python");
        vector.add("c++");
        vector.add("c#");
        // 3 FARKLI ŞEKİLDE EKRANA YAZABİLİRİZ;
      /* 1--) ListIterator<String > iterator = vector.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
      /*2--)for (String s: vector){
          System.out.println(s);
      }*/
      /*  Enumeration<String > enumeration = vector.elements();// BUDA 3. YOL enumeration sınıfı ile yapılıyor.
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
*/
       /* System.out.println("İlk eleman"+ vector.firstElement());
        System.out.println(vector.lastElement());*/

        Stack<String > stack = new Stack<String>();// Stacklerde listeye son giren ilk çıkar anlayışı vardır.(Last İn First Out(LIFO))
        stack.add("Java");
        stack.push("C++");// hem push hem de add methodu ile ekleme yapılabilir.
        stack.push("php");
        stack.push("html");
        //(LIFO) MANTIĞIII
      /*  System.out.println(stack.peek());// son giren elamn ekrana çıkaran method.
        System.out.println(stack.pop());// son elamını listeden çıkaran method

        for (String s:stack){
            System.out.println(s);
        }*/
     /* while (!stack.empty()){
          stack.pop(); // bu yöntemle bütün elemanları silebilir (tersten çıkarır)
      }*/





    }
}
