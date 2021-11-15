package d211001;
class N32_OperatorEx11 
{ 
      public static void main(String[] args) 
      { 
            long a = 1000000 * 1000000;		//100만 * 100만의 결과는 int가 되어야 하기 때문에 손실이 일어난다.
            long b = 1000000 * 1000000L;
            System.out.println(a); 
            System.out.println(b); 
      } 
}