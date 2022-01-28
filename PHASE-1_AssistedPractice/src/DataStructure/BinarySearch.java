package DataStructure;

public class BinarySearch {
	    public static  void main(String[] args){

	        int[] arr = {3,9,23,45,78,81,90,93,95};
	        int key = 78;
	        int arrlength = (arr.length-1); // please consider the total array length here i.e 5 
	        binarySearch(arr,0,key,arrlength);
	    }

	public static void binarySearch(int[] arr, int start, int key, int length){

	        int midValue = (start+length)/2;       
	        while(start<=length){

	            if(arr[midValue]<key){
	                start = midValue + 1;
	            } else if(arr[midValue]==key){
	                System.out.println("Element is found at index :"+midValue);
	                break;
	            }else {

	                length=midValue-1;
	            }
	            midValue = (start+length)/2;
	        }
	            if(start>length){

	                System.out.println("Element is not found");
	            }      
	    }
	}


