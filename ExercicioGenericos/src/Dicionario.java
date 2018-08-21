public class Dicionario<K, V> {

	private K[] keys = (K[]) new Object[10];
	private V[] values = (V[]) new Object[10];

	public void add(K key, V value) {
		for (int i = 0; i < keys.length; i++) {
			if (keys[i] == key) {
				values[i] = value;
			}
		}
	}
	
	public V getV(K key) {
		for (int i = 0; i < keys.length; i++) {
			if (keys[i] == key) {
				return values[i];
			}
		}
		
		return null;
	}
}
