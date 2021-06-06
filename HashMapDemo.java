package com.lemon.day08.map;

import java.util.HashMap;

/**
 * @Project: java_base
 * @Create: 2021-04-10 17:46
 * @Desc：
 **/
public class HashMapDemo {
    public static void main(String[] args) {
        //双列集合  键值对 key value：无序，无索引，不可重复
        HashMap<String,Integer> map = new HashMap<>();
        //put(k,v) 新增
        map.put("name",9527);
        map.put("age",28);
        map.put("id",1);
        //put如果key相同就覆盖原来的value
        map.put("age",28);
        map.put("age",25);
        //get(key) 取出来
        System.out.println(map.get("id"));
        System.out.println(map.get("age"));
        //size() 长度
        System.out.println(map.size());
        //containsKey(key)  判断是否包含某个键
        System.out.println(map.containsKey("id"));
    }
}
