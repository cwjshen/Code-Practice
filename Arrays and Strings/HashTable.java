class LinkedListNode {
	String key;
	int value;
	LinkedListNode next;

	LinkedListNode (String key, int value){
		this.key = key;
		this.value = value;
		this.next = null;
	}

}

public class HashTable {
	private int num_elements;
	private int num_buckets;
	private LinkedListNode table[];

	public HashTable (int num_buckets) {
		num_elements = 0;
		num_buckets = num_buckets;
		table = new LinkedListNode[num_buckets];

	}

	public int getNumElements () {
		return num_elements;
	}

	public int getNumBuckets () {
		return num_buckets;
	}

	public boolean isNull (int hash_val) {
		if (table[hash_val] == null) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean keyExists (String key) {
		int hash_val = hash(key) % num_buckets;
		if (hash_val < 0) {
			hash_val += num_buckets;
		}
		LinkedListNode entry = table[hash_val];
		if (entry == null) {
			return false;
		}
		else {
			while (entry.next != null) {
				if (entry.key.equals(key)) {
					return true;
				}
				entry = entry.next;
			}
		}
		return false;
	}

	public void insert (String key, int value) {		
		int hash_val = hash(key);
		
		if (this.isNull(hash_val)){
			table[hash_val] = new LinkedListNode(key, value);
		}
		else {
			LinkedListNode new_entry = new LinkedListNode(key,value);
			LinkedListNode entry = table[hash_val];
			if (this.keyExists(key) == false) {
				while (entry.next != null) {
					entry = entry.next;
				}
				entry.next = new_entry;	
			}
			else {
				entry.value = value;
			}
			
		}
	}

	public void remove(String key, int value) {
		int hash_val = hash(key);
		LinkedListNode entry = table[hash_val];
		while (!entry.key.equals(key)){
			entry = entry.next;
		}
		entry = null;

	}

	public int hash (String key) {

		int hash_val = key.hashCode() % num_buckets;
		if (hash_val < 0) {
			hash_val += num_buckets;
		}
		return hash_val;
	}
}