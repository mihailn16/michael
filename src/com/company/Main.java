package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String str = generate();

        HashMap<Character, Integer> lettersAmount = new HashMap<>();
        for(int i = 0; i< str.length(); i++)
        {
            char let = str.charAt(i);
            if(!lettersAmount.containsKey(let)){
                lettersAmount.put(let,1);
            }
            else {
                int amount = lettersAmount.get(let)+1;
                lettersAmount.put(let, amount);
            }
        }
        for(HashMap.Entry<Character, Integer> pair: lettersAmount.entrySet()){
            System.out.println(pair.getKey() + ": "+pair.getValue());
        }




        HashMap<String, String> users = new HashMap<>();
        users.put("aaa@gmail.com", "aaa");
        users.put("bbb@gmail.com", "bbb");
        users.put("ccc@gmail.com", "ccc");

//        users.put("bbb@gmail.com", "zzz");
        //System.out.println(users.get("bbb@gmail.com"));
        HashSet<String> userNames = new HashSet<>();
        userNames.add("Valera");
        userNames.add("Michael");
        userNames.add("Andrey");
        userNames.add("Maxim");
        userNames.add("Valera");
        for (String name : userNames)
            System.out.println(name);

        for(HashMap.Entry<String, String> entry: users.entrySet())
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("_____________________");
        }
    }
    private static String generate()
    {
        String ret = "";
        Random rand = new Random();
        int length = rand.nextInt(1000)+10;
        for(int i = 0; i<length; i ++)
        {
            ret+=(char)(rand.nextInt('Z'-'A')+'A');

        }
        return ret;
    }
}
