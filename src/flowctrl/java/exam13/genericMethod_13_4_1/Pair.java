package flowctrl.java.exam13.genericMethod_13_4_1;

public class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public void setKey(K key) { this.key = key; }
	public void setValue(V value) { this.value = value; }
	public K getKey()   { return key; }
	public V getValue() { return value; }
}
