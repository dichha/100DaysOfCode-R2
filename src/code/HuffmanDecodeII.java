/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;
import java.util.Comparator; 
import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue; 

/**
 *
 * @author dichha
 */
class MinHeapNode{
    char data; 
    int freq; 
    MinHeapNode left, right; 
    MinHeapNode(char data, int freq){
        this.data = data; 
        this.freq = freq; 
        left=right=null; 
    }
}
class CustomComparator implements Comparator<MinHeapNode>{
    public int compare(MinHeapNode n1, MinHeapNode n2){
        return n1.freq - n2.freq;
    }
}

public class HuffmanDecodeII {
  
  public static Map<Character, String> codes = new HashMap<Character, String>();
  public static void calcFreq(Map<Character, Integer> map, String s){
    for(int i=0; i<s.length(); i++){
        char c = s.charAt(i); 
        if(map.containsKey(c))
            map.put(c, map.get(c)+1);
        else
            map.put(c, 1);
    }  
  }
  public static void printCodes(MinHeapNode root, String s){
      if(root == null)
          return; 
      if(root.left == null && root.right == null && Character.isLetter(root.data))
          System.out.println(root.data + " " + s);
      
      printCodes(root.left, s + "0"); 
      printCodes(root.right, s + "1");
  }
  
  public static void storeCodes(MinHeapNode root, String s){
      if(root == null)
          return;
      if(root.left == null && root.right == null && Character.isLetter(root.data)){
          codes.put(root.data, s);
      }
      storeCodes(root.left, s + "0"); 
      storeCodes(root.right, s + "1");
          
  }
  
  public static String decode_file(MinHeapNode root, String encode){
      String ans = "";
      MinHeapNode curr = root; 
      for(int i=0; i<encode.length(); i++){
          if(encode.charAt(i) == '0')
              curr = curr.left; 
          else 
              curr = curr.right; 
          if(curr.left == null && curr.right == null && Character.isLetter(curr.data)){
              ans += curr.data;
              curr=root; 
          }
      }
      return ans; 
  } 
  /*
  public static void main(String[] args){
    String s = "sunshineonshinysea"; 
    Map<Character, Integer> map = new HashMap<Character, Integer>(); 
    
    calcFreq(map, s);
    
    // Making a priority queue to put MinHeapNode 
    PriorityQueue<MinHeapNode> q = new PriorityQueue<MinHeapNode>(s.length(), new CustomComparator());
    map.forEach((k, v) -> {
        char c = k; 
        int f = v; 
        MinHeapNode n = new MinHeapNode(c, f); 
        q.add(n);
    });
    
    // Printing key val pairs for map
    /*
    Iterator<Map.Entry<Character, Integer>> itr = map.entrySet().iterator();
    while(itr.hasNext()){
        Map.Entry<Character, Integer> entry = itr.next(); 
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    */
    //printing out queue
    /*
    while(q.size() > 0){
        System.out.println(q.peek().data + " " + q.peek().freq); 
        q.poll(); 
    }
    */
    /*
    // Making a Huffman Tree
    MinHeapNode root = null; 
    while(q.size() > 1){
        MinHeapNode n1 = q.peek(); 
        q.poll(); 
        MinHeapNode n2 = q.peek(); 
        q.poll(); 
        
        MinHeapNode p = new MinHeapNode('#', n1.freq + n2.freq);
        p.left = n1; 
        p.right = n2; 
        root = p; 
        q.add(p);
    }
    
    
    // print out the codes
    printCodes(root, ""); 
    
    storeCodes(root, ""); 
    String encode = ""; 
    System.out.println("Encoding"); 
    for(int i=0; i<s.length(); i++){
        encode += codes.get(s.charAt(i));
    }
    System.out.println(encode);
    
    System.out.println("Decoding"); 
    String decode = decode_file(root, encode); 
    System.out.println(decode);
  }
*/
  

  
}
