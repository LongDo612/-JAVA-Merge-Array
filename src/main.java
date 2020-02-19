public class main {
    public static void main(String[] args) {
        int c = 0;
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,8,9,10,11};
        int[] array3 = new int[array1.length+array2.length];
        System.out.println("Array 1 is: ");
        for (int x:array1) {
            System.out.println(x);
        }
        System.out.println("Array 2 is: ");
        for (int x: array2) {
            System.out.println(x);
        }

        for (int i=0;i<array3.length;i++){
            if (i < array1.length) {
                array3[i] = array1[i];
            }
            else
                while (c < array2.length){
                    array3[i] = array2[c];
                    c++;
                    break;
                }
        }

        System.out.println("Array 1 merge array 2: ");
        for (int x:array3) {
            System.out.println(x);
        }
    }
}
