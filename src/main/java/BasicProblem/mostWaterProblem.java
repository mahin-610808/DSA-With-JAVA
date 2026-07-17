package BasicProblem;

import static java.lang.Math.min;

public class mostWaterProblem {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int l=0;
        int r=height.length-1;
        int currentArea;
        int maxArea = 0;
        while(l<r){
            int width=r-l;

            currentArea=width*min(height[l],height[r]);
            if(currentArea>maxArea){
                maxArea=currentArea;
            }
            if(height[l]<height[r]){
               l++;
           }else{
              // currentArea=width*min(height[l],height[r]);
               r--;
           }
        }
        System.out.print(maxArea);
    }
}
