package Basics.Patterns;

public class Pattern1 {
    public static void main(String[] args){
//        rectanglePattern();
//        rightPyramid();
//        numericRightPyramid();
//        uniNumRightPyr();
//        upperRightPyr();
//        pyramid();
    }

    static void rectanglePattern(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void rightPyramid(){
        for (int i=0; i<5; i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void numericRightPyramid(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void uniNumRightPyr(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void upperRightPyr(){
        for (int i=5; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pyramid(){
        for (int i=0; i<=1; i++){
            for (int j=0; j<=i; j++){
                System.out.print(" "+"*"+" ");
            }
            System.out.println();
        }
    }

    static void rightUppPllgrm(int n){
        for (int i=1; i<=n; i++){
            for (int j=(2*i)+2; j>=0; j--){
                System.out.println(" ");
            }
            for (int j=1; j<=5; j++){
                System.out.println("*");
            }
            for (int j=0; j<(2*i)-2; j++){
                System.out.println(" ");
            }
        }
    }
}
