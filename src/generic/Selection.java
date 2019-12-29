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
public class Selection<E> {
    
    public E[] aSelection(E[] array){
        for(int i=0;i<array.length-1;i++){
            String s, t;
            E temp = array[i];
            int index = i;
            for(int k=i+1;k<array.length;k++){
                s = String.valueOf(temp);
                t = String.valueOf(array[k]);
                if(s.hashCode()>t.hashCode()){
                    temp = array[k];
                    index = k;
                }
            }
            if(index!=i){
                array[index] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
    
    public E[] dSelection(E[] array){
        for(int i=0;i<array.length-1;i++){
            String s, t;
            E temp = array[i];
            int index = i;
            for(int k=i+1;k<array.length;k++){
                s = String.valueOf(temp);
                t = String.valueOf(array[k]);
                if(s.hashCode()<t.hashCode()){
                    temp = array[k];
                    index = k;
                }
            }
            if(index!=i){
                array[index] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
    
}
