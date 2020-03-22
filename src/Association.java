/**
 * 
 * @author Daniela Batz 19214
 *
 */

public class Association<K, V> {
    K key;
    V value;
    
    
    public void addAsociation(K key, V valor){
        this.key = key;
        this.value = value;
    }
    
    public K getKey(){
        return this.key;
    }
    
    public V getValor(){
        return this.value;
    }
}