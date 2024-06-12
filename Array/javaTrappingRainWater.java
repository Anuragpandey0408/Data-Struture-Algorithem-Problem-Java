public class javaTrappingRainWater {

    public static int trappedWater(int height[]){
        // calculate left max boundry - auxilary array
        int leftMax[] = new int[height.length];
        leftMax[0]  = height[0];
        for(int i = 1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // calculate right max boundry - auxilary array
        int RightMax[] = new int[height.length];
        RightMax[height.length - 1]  = height[height.length - 1];
        for(int i = height.length - 2; i>= 0; i--){
            RightMax[i] = Math.max(height[i], RightMax[i+1]);
        }
        
        //loop
        int trappedWater = 0;
        for(int i=0; i<height.length; i++){
        //waterLevel = min(left max boundry, right max boundry)
        int waterLevel = Math.min(leftMax[i], RightMax[i]);
        //trapped water = waterLevel - height[i]
        trappedWater += waterLevel - height[i];
       }
       return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }
}
