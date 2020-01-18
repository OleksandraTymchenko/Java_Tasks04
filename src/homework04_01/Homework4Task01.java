package homework04_01;

public class Homework4Task01 {

    static  void  getUniqueSymbols(String str){
        int n = 0;

        while(n < str.length()){
            char symbol = str.charAt(n);
                if (str.indexOf(symbol) == str.lastIndexOf(symbol)){
                    System.out.print(symbol);

                }
                n++ ;
            }

        }
    public static void main(String[] args) {
        getUniqueSymbols("hello world");
    }
}
