import java.util.List;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Child child = new Child();
		child.hello();
		child.hi();
		child.sup();
		System.out.println(child.n);
	}
}

abstract public class Mother {
	public int n;
	public Mother() {
	}
	public Mother(int n) {
		this.n = n;
	}
	abstract public void hello();
	public void hi() {
		System.out.println("hi");
	}
}

public class Child extends Mother {
	public Child() {
	}
	public Child(int n) {
		super(n);
	}

	@Override
	public void hello() {
		System.out.println("hello");
	}
	public void sup() {
		System.out.println("sup");
	}
}
