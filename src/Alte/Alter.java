package Alte;

public class Alter {
    public static void main (String[]args){
        int x=1;
        int y=1;
        int z=1;
        int erg = 1;
        for (int xx = 0; x==36 || y==36 || z==36; z++){
            for (int xxx=0; x==36 || y==36 || z==36; y++){
                for (int xxxx=0; x==36 || y==36 || z==36; x++){
                    boolean kleinergleich=x<=y;
                    boolean kleinergleich2=y<=z;
                    boolean erg36=erg==36;
                    if(kleinergleich&&kleinergleich2&&erg36){
                        System.out.println(x+" T1; "+y+" T2; "+z+" T3");
                    }
                }
            }
        }
    }
}
