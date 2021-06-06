package com.lemon.day08.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @Project: java_base
 * @Create: 2021-04-10 17:54
 * @Desc：
 **/
public class HashMapLoop {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("name",9527);
        map.put("age",28);
        map.put("id",1);
        //1、keySet() + get(key)
        //接口类型（父类）=接口的实现类（子类） 多态
        Set<String> keySet = map.keySet();
        for (String key : keySet){
            int value = map.get(key);
            System.out.println(key + "=" + value);
        }
        //2、entrySet entry对象集合
        /*
            public class Entry{
                String key；
                Integer value；
                //构造get、set方法
            }
            map.put("id",100);
            Entry e1 = new Entry("id",100);
            Entry e2 = new Entry("name",100);
            Entry e3 = new Entry("age",25);
            set.add(e1);
            set.add(e2);
            set.add(e3);
            entrySet -> set<Entry<String,Integer>>
         */
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        for (Entry<String, Integer> entry : entrySet){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        //3、表达式
        map.forEach((k,v) -> {
            System.out.println(k + "=" + v);
        });
    }
}
