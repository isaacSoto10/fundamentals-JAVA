package JavaBasics;

import java.util.*;

public class BasicJava {
	public void oneto255() {
		for(int i = 1; i < 255; i++ ) {
			System.out.println(i);
		}
	}
	public void odd() {
		for (int i= 0; i< 255; i++){
			if(i % 3 == 0 ) {
				System.out.println();
			}
		}
	}
	public void sum() {
		for(int i = 1; i < 255; i++ ) {
			int sum = 0;
			sum = i + sum;
			System.out.println(String.format("New number : %s Sum: %s", i, sum));
		
		}
	}
	public void iteratingArray(int[] myArray){
        for (int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
    }
    public void findMax(int[] myArray){
        int max = myArray[0];
        for (int i=1;i<myArray.length;i++){
            if (max<myArray[i]){
                max = myArray[i];
            }
        }
        System.out.println("Max Number in Array = "+max);
    }
    public void findAvg(int[] myArray){
        double avg;
        int sum = 0;
        for (int i=0;i<myArray.length;i++){
            sum += myArray[i];
        }
        avg = sum/myArray.length;
        System.out.println("Average number in Array = "+avg);
    }
    @SuppressWarnings("rawtypes")
	public ArrayList arrayOddNumber(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i=1;i<256;i++){
            if (i%2 ==  1){
                myArray.add(i);
                
            }
        }
        myArray.forEach((num) ->  System.out.println(num));
        return myArray;
    }
    public int greaterThanY(int[] myArray, int y){
        int count =0;
        for (int i=0;i<myArray.length;i++){
            if (myArray[i]>y){
                count ++;
            }
        }
        return count;
    }
    public int[] squareValue(int[] myArray){
    	
        for(int i=0;i<myArray.length;i++){
            myArray[i] *= myArray[i];
        }
        
        for (int num : myArray) {
        	System.out.println(num);
        }
        return myArray;
    }
    
    public int[] eliminateNegative(int[] myArray){
        for (int i=0; i<myArray.length;i++){
            if (myArray[i]<0){
                myArray[i] = 0;
            }
        }
        
        for (int num : myArray) {
        	System.out.println(num);
        }
        return myArray;
    }
    public String maxMinAvg(int[] myArray){
        int max = myArray[0];
        int min = myArray[0];
        int sum = 0;
        for (int i=0;i<myArray.length;i++){
            if (myArray[i]>max){
                max = myArray[i];
            }else if (myArray[i]<min){
                min = myArray[i];
            }
            sum += myArray[i];
        }
        return String.format("max: %s, min: %s, sum: %s", max, min, sum/myArray.length);
    }

    public int[] shiftingValue(int[] myArray){
        for (int i=1;i<myArray.length;i++){
            myArray[i-1]= myArray[i];
        }
        myArray[myArray.length-1] = 0;
        
        for (int num : myArray) {
        	System.out.println(num);
        }
        return myArray;
    }
}
	

