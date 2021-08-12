package execute;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMaps {
    public void  AddHashMapValue() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("IE", "Internet Explorer");
        hashMap.put("Chrome", "Google Chrome");
        hashMap.put("Firefox", "Mozilla Firefox");
        hashMap.put("Safari", "Macbook browser");
        hashMap.put("Opera", "Linux Browser");

        System.out.println("Browser Name: " + hashMap.get("IE"));   //Result showing (Browser Name: Internet Explorer)
        System.out.println("---------------------------------");
        for(Map.Entry map: hashMap.entrySet()) {
            System.out.println(map.getKey()   + ":" + map.getKey());
        }
    }

    public void hashMapWithDifferentDataType()  {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Vishal", 10);
        hashMap.put("Sachin", 30);
        hashMap.put("Shourav", 20);

        System.out.println("Size of map is: " + hashMap.size());
        System.out.println(hashMap);

        //  Result showing
        //  Size of map is: 3
        //  {Shourav=20, Vishal=10, Sachin=30}

        System.out.println(hashMap.get("Vishal"));

        // Result showing - 10

        System.out.println(hashMap.get("Visual"));

        // Result showing - null

        hashMap.remove("Vishal");
        System.out.println(hashMap);

        // Remove one out of three and showing rest od data ({Shourav=20, Sachin=30})



    }

}
