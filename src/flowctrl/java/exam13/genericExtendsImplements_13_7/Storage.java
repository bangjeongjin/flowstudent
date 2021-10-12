package flowctrl.java.exam13.genericExtendsImplements_13_7;

public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);
}
