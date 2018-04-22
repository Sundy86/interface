package com.sc.listener;

import com.sc.model.CaseSystem;

import java.util.*;

/**
 * Created by Suncy on 2018/4/21 0021.
 */
public class ObjectCache {
    private static Map<String,Object> map =new HashMap<String,Object>();
    public static void addCache(String key,Object value){
        map.put(key,value);
    }
    public static Object get(String key){
        if(map.containsKey(key)){
          return   map.get(key);
        }
        return null;
    }
    public static void deleteCache(String key){
        if(map.containsKey(key)){
            map.remove(key);
        }
    }
    public static List<CaseSystem> getAllSystem(){
        List<CaseSystem> list = new ArrayList<CaseSystem>();
        Set<String> set = map.keySet();
        for(String s : set){
           Object object = map.get(s);
           if(object instanceof CaseSystem){
               list.add((CaseSystem) object);
           }
        }
        return list;
    }

    public static String getSystemName(String id){
        Object object = get(id);
        if(object!=null && object instanceof CaseSystem){
             return  ((CaseSystem) object).getSystemname();
        }
        return "";
    }
}
