public class Par<T, U> {

	private T obj1;
	private U obj2;

	public Par(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public String toString() {
		return "Obj1 = " + obj1 + ", Obj2 = " + obj2;
	}
}
