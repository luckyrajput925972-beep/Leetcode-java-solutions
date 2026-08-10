class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n=nums1.length;
        int m=nums2.length;
        int arr[]=new int[n+m];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            arr[n+i]=nums2[i];
        }
        Arrays.sort(arr);
        int len=arr.length;
    if(len%2!=0){
        return arr[len/2];
    }
    return (arr[len/2-1]+arr[len/2])/2.0;
        
    }
}