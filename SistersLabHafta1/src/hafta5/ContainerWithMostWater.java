package hafta5;

public class ContainerWithMostWater {
	 public static int maxArea(int[] height) {

	        int maxArea=0;
	        int left=0;
	        int right=height.length-1;
	        int shorterLine=0;
	        int distance=0;

	        while(left<right){
	            shorterLine=Math.min(height[left],height[right]);
	            distance=right-left;
	            maxArea=Math.max(maxArea,shorterLine*distance);
	            if(height[left]<height[right]){
	                left++;
	            }else{
	                right--;
	            }

	        }
	        return maxArea;
	}

	    public static void main(String[] args){

	       var height=new int[]{6,2,5,7,2,8,0,1};
	       System.out.println(maxArea(height));
	    }

	
}
