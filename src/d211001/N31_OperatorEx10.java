package d211001;
class N31_OperatorEx10 
{ 
      public static void main(String[] args) 
      { 
            int a = 1000000;				// 1,000,000   1백만
            int b = 2000000;				// 2,000,000   2백만
            int c = a * b;					// 연산 결과 2,000,000,000,000가 나와야 하지만 21억을 넘어가기 때문에 손실이 생긴다.
            System.out.println(c); 
      }
}