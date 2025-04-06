class Pair<K,V>{
    private K key;
    private V value;
    public Pair(K key, V value){
        this.value = value;
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "key=" + key +", value=" + value;
    }
}
public class Q1
{
    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<>(1,"Rabi");
        System.out.println(p);
    }
}
