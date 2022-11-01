public class Main {
    public static boolean isFind(int[] Array,int number){
        for (int i:Array){
            if (number==i){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers={1,4,8,3,6,4,9,1,5,7,8,};
        int[] duplicate=new int[numbers.length];
        int startIndex=0;
        for (int i=0;i< numbers.length;i++){
            for (int j=0;j< numbers.length;j++){
                if ((i!=j)&&(numbers[i]==numbers[j])){
                    if (numbers[i]%2==0) {
                        if (!isFind(duplicate, numbers[i])) {
                            duplicate[startIndex++] = numbers[i];
                        }
                    }
                }

            }
        }
        for (int sayi:duplicate){
            if (sayi!=0){
                System.out.println("Dizide tekrar eden çift sayılar:"+ sayi);
            }
        }
    }
}