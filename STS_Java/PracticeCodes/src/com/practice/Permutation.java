package com.practice;

public class Permutation 
{ 
    public static void main(String[] args) 
    { 
        String str = "ABCDE"; 
        int n = str.length(); 
        Permutation permutation = new Permutation();
        System.out.println("First call to permute");
        permutation.permute(str, 0, n-1); 
    } 
  
    private void display(String comment, String str, int start, int end) {
    	System.out.println("[" +comment+"]" + "[" +start+"][" +end +"] :" +str);
    }
    /** 
     * permutation function 
     * @param str string to calculate permutation for 
     * @param l starting index 
     * @param r end index 
     */
    private void permute(String str, int l, int r) 
    { 
    	display("Permute", str, l, r);
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                display("SWAP 1", str, l, i);
                permute(str, l+1, r); 
                str = swap(str,l,i);
                display("SWAP 2", str, l, i);
            } 
        } 
    } 
  
    /** 
     * Swap Characters at position 
     * @param a string value 
     * @param i position 1 
     * @param j position 2 
     * @return swapped string 
     */
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
  
} 