public class No5 {
    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int i = 1;
        while (d <=81) {
            if (d>0) {
            System.out.print(d+ " ");
            }
            if (i==1){
                d=1; 
            } else if (i == 2){
                d=1;
            } else {
                a=b;
                b=c;
                c=d;
                d=a+b+c;
            }
            i++;
            
            
        }
        
    }
}
