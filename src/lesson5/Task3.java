package lesson5;
//Поменять ключи и значения в Map.
//Напишите метод, который получает на вход Map<K, V> и возвращает Map, где ключи и значения поменяны местами.
// Если карта состоит из 6 пар ключ-значение, то итоговая карта должна состоять из 6 пар ключ-значение.

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<Integer,String>();
        hash.put(1,"Value1");
        hash.put(2,"Value2");
        hash.put(3,"Value3");
        hash.put(4,"Value4");
        hash.put(5,"Value5");
        hash.put(6,"Value6");
        for (Map.Entry entr : hash.entrySet()){
            System.out.println(entr.getKey() + " " + entr.getValue());
        }
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (Map.Entry<Integer, String> entry: hash.entrySet()){
            map.put(entry.getValue(), entry.getKey());
        }
        for (Map.Entry<String, Integer>entry :map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
