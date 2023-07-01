public class Main {
    public static void main(String[] args) {
        String[][] harf = new String[9][5];
        for (int i=0; i<harf.length; i++) {
            for(int a=0; a<harf[i].length; a++) {
                if (i == 0 || i==4 || i==8) {
                    harf[i][a] = " * ";
                } else if (a==0 || a==4) {
                    harf[i][a] = " * ";
                } else {
                    harf[i][a] = "   ";
                }}}
        for(String[] row : harf) {
            for(String column : row) {
                System.out.print(column);}
            System.out.println();}
    }}