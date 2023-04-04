import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    HashTable hashTable = new HashTable(10);
	    HashNode hashNode = new HashNode(22,"Sayali");
	    hashTable.add(hashNode);
	    hashTable.add(new HashNode(15,"Pranav"));
	    hashTable.add(new HashNode(12,"Ankita"));
	    hashTable.printHashTable();
		System.out.println("Value : " + hashTable.get(15));
	}
}

class HashNode {
    int key;
    String value;
    
    public HashNode(int key, String value) {
        this.key = key;
        this.value = value;
    }
    
    public int getKey() {
        return this.key;
    }
    
    public String getValue() {
        return this.value;
    }
    
    @Override
    public String toString() {
        return("Key : " + key + " Value : " + value);
    }
}

class HashTable {
    
    ArrayList<HashNode> buckets;
    int size;
    
    public HashTable(int size) {
        this.size = size;
        buckets = new ArrayList<>(size);
        for(int i=0;i<size;i++) {
            buckets.add(null);
        }
    }
    
    public int hash(int key) {
        return key%10;
    }
    
    public void add(HashNode hashNode) {
        int hashValue = hash(hashNode.getKey());
        buckets.set(hashValue, hashNode);
    }
    
    public String get(int key) {
        int hashValue = hash(key);
        return buckets.get(hashValue).getValue();
    }
    
    public void printHashTable() {
        System.out.println(buckets);
    }
}
