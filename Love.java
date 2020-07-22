public class Love {
    public static void main(String[] args) {
        for(int i=4; i<=5; i++) {
            for(int j=1; j<=12; j++) {
                if (j>(5-i) && j<(5+i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            for(int j=1; j<=9; j++) {
                if (j>(5-i) && j<(5+i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=13;i>=1;i-=2){
            for(int j=1; j<=21; j++) {
                if (j>(11-i) && j<(11+i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
