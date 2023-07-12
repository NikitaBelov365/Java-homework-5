public class Fifth {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i==0 & j==0 | i==1 & j==2 | i==2 & j==4 | i==3 & j==6 | i==4 & j==1 | i==5 & j==3 | i==6 & j==5 | i==7 & j==7) {
                    System.out.print("|X|");
                }
                else {
                    System.out.print("|_|");
                }
                
            }
            System.out.println();
        }
    }
}
