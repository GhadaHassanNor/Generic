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
public class Insertion<E> {
    
    public E[] aInsertion(E[] array){
        for(int i=1;i<array.length;i++){
            E temp = array[i];
            int k;
            for(k=i-1;k>=0&&String.valueOf(array[k]).hashCode()>String.valueOf(temp).hashCode();k--){
                array[k+1] = array[k];
            }
            array[k+1] = temp;
        }
        return array;
    }
    
    public E[] dInsertion(E[] array){
        for(int i=1;i<array.length;i++){
            E temp = array[i];
            int k;
            for(k=i-1;k>=0&&String.valueOf(array[k]).hashCode()<String.valueOf(temp).hashCode();k--){
                array[k+1] = array[k];
            }
            array[k+1] = temp;
        }
        return array;
    }
    
}
