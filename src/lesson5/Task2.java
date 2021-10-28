package lesson5;



//Постройте частотный словарь букв русского (или английского) алфавита.
//Т.е. Сколько раз каждая буква алфавита повторяется в введенной строке.
//Alphabet.put(“A”, 0)

import java.util.HashMap;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a",0);
        map.put("b",0);
        map.put("c",0);
        map.put("d",0);
        map.put("e",0);
        map.put("f",0);
        map.put("g",0);
        map.put("h",0);
        map.put("j",0);
        map.put("q",0);
        map.put("w",0);
        map.put("r",0);
        map.put("t",0);
        map.put("y",0);
        map.put("u",0);
        map.put("i",0);
        map.put("o",0);
        map.put("p",0);
        map.put("s",0);
        map.put("k",0);
        map.put("l",0);
        map.put("m",0);
        map.put("n",0);
        map.put("v",0);
        map.put("x",0);
        map.put("z",0);

        Integer freque;
        System.out.println("ВВедите свой родной алфавит: ");
        String str = new Scanner(System.in).nextLine();
        char ch[] = str.toCharArray();
        for( int i = 0; i < ch.length;i++ ){
            if(!String.valueOf(ch[i]).equals(" ")){
            freque = map.get(String.valueOf(ch[i]));
            map.put(String.valueOf(ch[i]),freque == null ? 1 : ++freque );
                }
        }
        System.out.println(map);
            }
        }





