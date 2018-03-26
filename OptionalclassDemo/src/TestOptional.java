import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer v1=null;
		Integer v2=new Integer(10);
		Optional<Integer> a=Optional.ofNullable(v1);
		Optional<Integer> a1=Optional.ofNullable(v2);
		Optional<Integer> b=Optional.ofNullable(v1);
		System.out.println(b.isPresent());
		Optional<Integer> b1=Optional.of(v2);
		System.out.println(a);
		System.out.println(a1);
		System.out.println(b);
		System.out.println(b1);

	}

}
