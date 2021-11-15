package d211001;
class N35_OperatorEx14
{ 
      public static void main(String[] args) { 
			char c1 = 'a';						//97

			char c2 =  (char)(1 + c1);			//컴파일 에러 발생!
			char c3 = 'a'+1;					//컴파일 에러 없음.

            System.out.println(c2); 
      } 
}