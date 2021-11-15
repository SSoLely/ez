package d211005;
class N12_FlowEx3 
{ 
      public static void main(String[] args)		//타입에 []가 붙는 것을 배열이라고 한다.
      { 
            int score = Integer.parseInt(args[0]);	//args[0]: 0번째 인덱스에 있는 값 //Interger: 미리 만들어진 클래스. 문자를 int로 바꿔주는 방법.
            char grade =' ';						//grade라는 변수.

            if (score >= 90) {						//if문.
                   grade = 'A';             		//score라는 값이 90점 보다 크거나 같으면 A.
            } else if (score >=80) {				
                   grade = 'B';						//80보다 크거나 같으면 B.
            } else {								
                   grade = 'C'; 					//나머지는 C.
            }
            
            System.out.println("당신의 학점은 " + grade + "입니다."); 
      } 
}