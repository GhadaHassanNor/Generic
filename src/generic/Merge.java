/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

/**
 *
 * @author MAGIC
 */
public class Merge<E> {
    
    public void splitA(E[] list){
        if(list.length>1){
            E[] left = (E[]) new Object[list.length/2];
            int rLength = list.length - left.length;
            E[] right = (E[]) new Object[rLength];
            System.arraycopy(list, 0, left, 0, list.length/2);
            splitA(left);
            System.arraycopy(list, list.length/2, right, 0, rLength);
            splitA(right);
            E[] temp = mergeA(left, right);
            System.arraycopy(temp, 0, list, 0, temp.length);
        }
    }
    
    public void splitD(E[] list){
        if(list.length>1){
            E[] left = (E[]) new Object[list.length/2];
            int rLength = list.length - left.length;
            E[] right = (E[]) new Object[rLength];
            System.arraycopy(list, 0, left, 0, list.length/2);
            splitD(left);
            System.arraycopy(list, list.length/2, right, 0, rLength);
            splitD(right);
            E[] temp = mergeD(left, right);
            System.arraycopy(temp, 0, list, 0, temp.length);
        }
    }
    
    public E[] mergeA(E[] list1, E[] list2){
        E[] temp = (E[]) new Object[list1.length+list2.length];
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        String s, t;
        while(index1<list1.length&&index2<list2.length){
            s = String.valueOf(list1[index1]);
            t = String.valueOf(list2[index2]);
            if(s.hashCode()<t.hashCode())
                temp[index3++] = list1[index1++];
            else
                temp[index3++] = list2[index2++];
        }
        while(index1<list1.length)
            temp[index3++] = list1[index1++];
        while(index2<list2.length)
            temp[index3++] = list2[index2++];
        return temp;
    }
    
    public E[] mergeD(E[] list1, E[] list2){
        E[] temp = (E[]) new Object[list1.length+list2.length];
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        String s, t;
        while(index1<list1.length&&index2<list2.length){
            s = String.valueOf(list1[index1]);
            t = String.valueOf(list2[index2]);
            if(s.hashCode()>t.hashCode())
                temp[index3++] = list1[index1++];
            else
                temp[index3++] = list2[index2++];
        }
        while(index1<list1.length)
            temp[index3++] = list1[index1++];
        while(index2<list2.length)
            temp[index3++] = list2[index2++];
        return temp;
    }
    
}
