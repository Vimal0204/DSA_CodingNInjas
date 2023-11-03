class Solution {
    public void duplicateZeros(int[] arr) {
        int length = arr.length;
        int zeros = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        int lastIndex = length - 1;
        int newIndex = length - 1 + zeros;

        while (lastIndex >= 0) {
            if (newIndex < length) {
                arr[newIndex] = arr[lastIndex];
            }

            if (arr[lastIndex] == 0) {
                newIndex--;

                if (newIndex < length) {
                    arr[newIndex] = 0;
                }
            }

            lastIndex--;
            newIndex--;
        }
    }
}
