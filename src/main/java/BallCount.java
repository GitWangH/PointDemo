/**
 * 递归方法计算一个小球从100米落下，每次反弹到一半的高度，计算反弹10次经过多少米
 */
public class BallCount {


    public static void main(String[] args) {
         come(100f);
         System.out.println("10sum"+sum);

    }

      private static int count=1;
      private static Double sum=0d;
      private static Float come(Float mi){
         System.out.println(count+" \t "+mi+" - m");
             sum+=mi;
             if(count++<10){
                 come(mi/2);
               }
              return mi;
      }
}
