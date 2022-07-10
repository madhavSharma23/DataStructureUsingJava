package Arrays;

import java.util.Arrays;

public class BuildingFromArray {
    void printBuilding(int[] building) {
        int[] temp = new int[building.length];

        System.arraycopy(building, 0, temp, 0, temp.length);

        int[] left= new int[temp.length];
        int[] right= new int[temp.length];
        int[] water= new int[temp.length];

        for(int i=0;i<temp.length;i++){
            if(i==0){
                left[0]=temp[0];
                right[temp.length-1]=temp[temp.length-1];
            }else{
                left[i]=Math.max(left[i-1],temp[i]);
                right[right.length-1-i]=Math.max(right[right.length-i],temp[temp.length-1-i]);
            }
        }

        for(int i=0;i<temp.length;i++){
            water[i]=Math.min(left[i],right[i])-temp[i];
        }
//        System.out.println("Building-->"+ Arrays.toString(temp));
//        System.out.println("           "+Arrays.toString(right)+"<----Right");
//        System.out.println("Left-->    "+Arrays.toString(left));
//        System.out.println("Water-->   "+Arrays.toString(water));

        int max = 0;
        for (int i = 0; i < building.length -1; i++) {
            if(max< Math.max(building[i], building[i + 1])){
                max = Math.max(building[i], building[i + 1]);
            }
        }


        String[][] building2d = new String[max][building.length];
        int waterQuantity = 0;
        for (int i = max - 1; i >= 0; i--) {
            for (int j = 0; j < building.length; j++) {
                if (building[j] != 0) {
                    building2d[i][j] = "[B]";
                    building[j] = building[j] - 1;
                } else {
                    if(water[j]!=0){
                        building2d[i][j]=" - ";
                        waterQuantity++;
                        water[j]--;
                    }else {
                        building2d[i][j] = "   ";
                    }
                }
            }
        }
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < building.length; j++) {
                System.out.print(building2d[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Total water ---> "+waterQuantity);
    }
    public static void main(String[] args) {
        int[] building = {10, 9, 5, 11, 3, 5, 8, 1, 7, 13, 3, 2, 9,2};
        BuildingFromArray bui = new BuildingFromArray();
        bui.printBuilding(building);
    }
}
