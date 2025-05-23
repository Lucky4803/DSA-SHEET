

lletcode 
849. Maximize Distance to Closest Person

class Solution {
    public int maxDistToClosest(int[] seats) {
        //  1 means person sitting 
        // om means empty 

        if(seats.length==0) return 0;

        int result =0;
        int val=0;

        //  case 1:
        for(int i =0;i<seats.length;i++){
            if(seats[i]==1){
                val= 0;
            }
            else{
                val++;
                result = Math.max(result, (val+1)/2);
            }
        }


if(seats[0]==0 || seats[seats.length-1]==0){
        // case 2 
        for(int i =0;i<seats.length;i++){
            if(seats[i]==1){
                result = Math.max(result,i);
                break;
            }
           }
        // case 3
         for(int i =seats.length-1;i>=0;i--){
            if(seats[i]==1){
               result = Math.max(result,seats.length-1-i);
                break;
            }
           
           
        }}
return result ;


    }
}
