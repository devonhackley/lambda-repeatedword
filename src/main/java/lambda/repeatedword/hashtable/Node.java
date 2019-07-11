package lambda.repeatedword.hashtable;


public class Node<T> {
    private String key;
    private T value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node(String key, T value){
        this.key = key;
        this.value = value;
    }

    public String toString() {
        return this.key + ": " + this.value;
    }

}
