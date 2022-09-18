public class Task1_5{
    public static void main(String[] args){
        String fruits[] = {"みかん","りんご","ぶどう","メロン"};
        for (int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }
        // 1~100の間その数を表示させる
        int i = 1;
        while(i<=100){
            System.out.print(i);
            i++;
        }
        System.out.println();

        for(int a=1;a<=9;a++){
            System.out.print(a+"||");
            for(int  j=1;j<=9;j++){
                System.out.print((a*j)+"|");
            }
            System.out.println();
        }
    }
}