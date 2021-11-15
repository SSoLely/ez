package d211008.N04_overloading;
public class Calculator					//계산기 //double형의 두 개의 메소드를 정의.
{
	double areaRectangle(double width)	//areaRectangle은, double형의 값 하나를 받아서,
	{
		return width * width;			//곱셈한 값을 리턴.
	}									//정사각형
	
	double areaRectangle(double width, double height)	//매개변수가 두 개. 가로 세로를 받아서,
	{
		return width * height;							//곱한 것을 리턴.
	}	
}