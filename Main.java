public class Main {

    public static int order1=1,order2=0,order3=1;

    public static void main(String[] args) {

        System.out.println("Perfect Squares:");
        perfSquare();
        System.out.println("Perfect Cubes:");
        perfCube();
        System.out.println("Fibonacci Sequences");
        fibonacciSeq();
        System.out.println("Prime Numbers");
        primNum();
        System.out.println("Triangle Numbers");
        triNum();


    }

    public static void perfSquare(){

        while (order1<11){
            int sqr=order1*order1;
            System.out.println(sqr);
            order1 = order1 +1;
        }
        order1=1;
    }

    public static void perfCube(){
        while (order1<11){
            int cube=order1*order1*order1;
            System.out.println(cube);
            order1 = order1 +1;
        }
        order1=1;
    }

    public static void fibonacciSeq(){
        while(order1<11){
            int res1=order3+order2;
            System.out.println(res1);
            order2=order3;
            order3=res1;
            order1=order1+1;
        }
        order2=0;
        order1=1;
        order3=1;
    }

    public static void triNum(){
        while(order1<11){
            int res1=order2+order3;
            System.out.println(res1);
            order2=res1;
            order3=order3+1;
            order1=order1+1;
        }
        order1=1;
    }

    public static void primNum(){
        while(order1<30) {

            if (2==order1){
                System.out.println(order1);
            }
            if (3==order1){
                System.out.println(order1);
            }
            if (5==order1){
                System.out.println(order1);
            }
            if (!(order1==1)) {
                if (!(order1 % 2 == 0)) {
                    if (!(order1 % 3 == 0)) {
                        if (!(order1 % 5 == 0))
                            System.out.println(order1);

                    }
                }
            }
            order1=order1+1;
        }
        order1=1;

    }
}
