package simulation.generator.app;

public class Pair<K,V>
{
    K key;V value;
    public V getValue()
    {return  value;}
    public K getKey()
    {
        return  key;
    }
    public Pair(K k, V v)
    {
        key=k;value=v;
    }
}