package Arrays;

import java.util.Arrays;

public class RainWaterTrapping {

    int water(int[] building){
       int[] left= new int[building.length];

       int[] right= new int[building.length];

       for(int i=0;i<building.length;i++){
           if(i==0){
               left[0]=building[0];
               right[building.length-1]=building[building.length-1];
           }else{
               left[i]=Math.max(left[i-1],building[i]);
               right[right.length-1-i]=Math.max(right[right.length-i],building[building.length-1-i]);
           }

       }
        System.out.println("Building-->"+Arrays.toString(building));
        System.out.println("           "+Arrays.toString(right)+"<----Right");
        System.out.println("Left-->    "+Arrays.toString(left));
       int water=0;
       for(int i=0;i<building.length;i++){
           water+=(Math.min(right[i],left[i])-building[i]);
       }
       return water;
    }
    public static void main(String[] args) {
        int[] building = {3,1,2,4,0,1,2,3,2};
        RainWaterTrapping r = new RainWaterTrapping();
        System.out.println(r.water(building));
    }
}
