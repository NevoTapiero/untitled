public class Main2 {
    public static void main(String[] args) {
        /*int place = 0;
        int [] array = new int[9];
        for (int i = 0; i < 9; i++){
            array[place] = 0;
            System.out.println(array[place]);
            place++;*/
            main2();
        }
    public static void main2(){
        int [] array = new int[9];
        for (int i = 0; i < 9; i++){
            if(i % 2 == 0)
                array[i] = 2;
            else if ( i % 3 == 0)
                array[i] = 3;
            else
                array[i] = 1;
            System.out.println(array[i]);
        }
    }
}
