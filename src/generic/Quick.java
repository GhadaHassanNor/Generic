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
public class Quick<E> {
    
    public void quickA(E[] list){
        quickA(list, 0, list.length-1);
    }
    public void quickD(E[] list){
        quickD(list, 0, list.length-1);
    }
    public void quickA(E[] list, int first, int last){
        if(last>first){
            int pivotIndex = partitionA(list, first, last);
            quickA(list, first, pivotIndex-1);
            quickA(list, pivotIndex+1, last);
        }
    }
    public void quickD(E[] list, int first, int last){
        if(last>first){
            int pivotIndex = partitionD(list, first, last);
            quickD(list, first, pivotIndex-1);
            quickD(list, pivotIndex+1, last);
        }
    }
    public int partitionA(E[] list, int first, int last){
        E pivot = list[first];
        int low = first + 1;
        int high = last;
        while(high>low){
            while(low<=high&&String.valueOf(list[low]).hashCode()<=String.valueOf(pivot).hashCode())
                low++;
            while(low<=high&&String.valueOf(list[high]).hashCode()>String.valueOf(pivot).hashCode())
                high--;
            if(high>low){
                E temp = list[low];
                list[low] = list[high];
                list[high] = temp;
            }
        }
        while(high>first&&String.valueOf(list[high]).hashCode()>=String.valueOf(pivot).hashCode())
            high--;
        if(String.valueOf(pivot).hashCode()>String.valueOf(list[high]).hashCode()){
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else
            return first;
    }
    public int partitionD(E[] list, int first, int last){
        E pivot = list[first];
        int low = first + 1;
        int high = last;
        while(high>low){
            while(low<=high&&String.valueOf(list[low]).hashCode()>=String.valueOf(pivot).hashCode())
                low++;
            while(low<=high&&String.valueOf(list[high]).hashCode()<String.valueOf(pivot).hashCode())
                high--;
            if(high>low){
                E temp = list[low];
                list[low] = list[high];
                list[high] = temp;
            }
        }
        while(high>first&&String.valueOf(list[high]).hashCode()<=String.valueOf(pivot).hashCode())
            high--;
        if(String.valueOf(pivot).hashCode()<String.valueOf(list[high]).hashCode()){
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else
            return first;
    }
    
}
