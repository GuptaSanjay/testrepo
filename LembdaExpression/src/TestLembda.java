import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*@FunctionalInterface
interface Lembda{
	public int getsum(int a,int b);
}*/
public class TestLembda {
public static void main(String[] args) {
	Lembda l=(a,b)->a+b;
	System.out.println(l.getsum(5,8));
	Display d=()->{System.err.println("hello Lembda");};
	d.display();
	SquareRoot sq=(a)->Math.sqrt(a);
	System.out.println("SquareRoot is="+sq.getsqrt(36));
	List<String> words = 
            Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
   //words.stream().filter(st)forEach(System.out::println);
   System.out.println(words.get(2));
}
}
