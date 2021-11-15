package d211001;
class OperatorEx12 
{ 
      public static void main(String[] args) 
      { 
            int a = 1000000 * (100000 / 1000000);	//(10만/100만)은 0.1이지만, 0.1은 int가 아니기 때문에 값은 0이 된다.
            int b = (1000000 / 100000) * 1000000;
            System.out.println(a); 
            System.out.println(b); 
      } 
}