/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

/**
 *
 * @author MAGIC
 * @param <E>
 */
public class Bubble<E> {
    
    public Bubble(){
        
    }
    
    public E[] aBubble(E[] list){
        boolean flag = true;
        String s, t;
        for(int k=1;k<list.length&&flag;k++){
            flag = false;
            for(int i=0;i<list.length-k;i++){
                s = String.valueOf(list[i]);
                t = String.valueOf(list[i+1]);
                if(s.hashCode()>t.hashCode()){
                    E swap = list[i];
                    list[i] = list[i+1];
                    list[i+1] = swap;
                    flag = true;
                }
            }
        }
        return list;
    }
    
    public E[] dBubble(E[] list){
        boolean flag = true;
        String s, t;
        for(int k=1;k<list.length&&flag;k++){
            flag = false;
            for(int i=0;i<list.length-k;i++){
                s = String.valueOf(list[i]);
                t = String.valueOf(list[i+1]);
                if(s.hashCode()<t.hashCode()){
                    E swap = list[i];
                    list[i] = list[i+1];
                    list[i+1] = swap;
                    flag = true;
                }
            }
        }
        return list;
    }
    
}
