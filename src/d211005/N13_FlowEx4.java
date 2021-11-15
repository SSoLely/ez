package d211005;
class N13_FlowEx4 
{ 
      public static void main(String[] args) 
      { 
            int score = 88; 
            char grade =' '; 
            grade = (score >=90) ? 'A' : ((score >=80) ? 'B' : 'C');	//삼항연산	 //= 연산자는 오른쪽 연산 값을 왼쪽에 대입하는 것이다.
            
            System.out.println("당신의 학점은 " + grade + "입니다."); 
      } 
}