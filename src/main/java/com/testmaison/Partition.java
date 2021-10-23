package com.testmaison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Partition {

   public static List<Integer> split(List<Integer> list, int size)throws Exception{
       if(list == null || size <= 0) {
           throw new Exception("the size can't be zero or null");
       } 
	   List<Integer> listToReturn = new ArrayList<Integer>();
       Iterator<Integer> listIterator = list.iterator();
       for (int i = 0; i < size; i++) {
           if(listIterator.hasNext()) {
               listToReturn.add(list.get(0));
               list.remove(0);
           }
       }   
       	return listToReturn;
   }
    public static List<List<Integer>> partition(List<Integer> list, int size) throws Exception
    {
		List<List<Integer>> liste = new ArrayList<>();
		while(list.size()>0) {
			liste.add(split(list, size));
		}
		return liste;
	}

    public static void main(String[] args) throws Exception {
		List<Integer> liste = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    	System.out.println(Partition.partition(liste, 3));
    }
}
