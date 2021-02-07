public class test1 {
    public static void main(String[] args) {
/*
        int num2 = 12;
        num2%=5;//num2 = num2 % 5;
        System.out.println(num2);
        int m2 = -12;
        int n2 = 5;
        System.out.println("m2 % n2 = " + m2 % n2);

        short s1 = 10;
       // s1 = s1 + 2;//编译失败
        s1 += 2;//结论：不会改变变量本身的数据类型

        System.out.println(s1);
*/
        /*boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if(b1 & (num1++ > 0)){
            System.out.println("我现在在北京");
        }else{
            System.out.println("我现在在南京");
        }

        System.out.println("num1 = " + num1);*/
        //开发中，推荐使用||

        for(int j = 1;j <= 4;j++ ){
            for(int i = 1;i <= 6;i++){
                System.out.print('*');
            }
            System.out.println();
        }


    }

}
