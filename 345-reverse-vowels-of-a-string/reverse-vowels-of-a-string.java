class Solution {
    
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }
    public String reverseVowels(String s) {
          char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
        if(isVowel(arr[left]) &&   isVowel(arr[right])){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        else{
            if (isVowel(arr[right]) && !isVowel(arr[left])) {
                left++;
            }

           else if (isVowel(arr[left]) &&   !isVowel(arr[right])) {
                right--;
            }
            else {
                left++;
                right--;
            }
            }}

        return new String(arr);
    }

}