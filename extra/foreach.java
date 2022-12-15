public class foreach {
    public static void main(String[] args) {
     int nums[] = {1,2,3,4,5,6,7,8,9,10};
     int val = 11;
     boolean found = false;
     for(int x: nums){
    if(x == val){
    found = true;
    break;
    }
     
     }
     if(found)
     System.out.println("value is found");
     else
     System.out.println("value is not found");
    }
  }
  
