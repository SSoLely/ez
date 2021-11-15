package d211001;
class N36_OperatorEx15
{ 
      public static void main(String[] args) 
      { 
            char c = 'a';						//소문자로 출력
            for(int i=0; i<26; i++)				//반복문.
            {           
                        System.out.print(c++);	//26번을 반복해서 1만큼 증가시킨다.
            } 
            
            System.out.println();

            c = 'A';							//대문자로 출력
            for(int i=0; i<26; i++) {
                        System.out.print(c++);  
            } 

            System.out.println(); 

            c='0';								//숫자로 출력
            for(int i=0; i<10; i++) {        
                        System.out.print(c++);
            } 
            System.out.println(); 
      } 
}