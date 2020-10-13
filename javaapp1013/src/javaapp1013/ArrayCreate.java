package javaapp1013;

public class ArrayCreate {
			public static void main(String [] args) {
				//int i = 0; //(while문과 함께 사용)
				//이름 배열을 생성과 동시에 초기화
				String [] names =  {"한재석", "김재석", "박재석","최재석"};
		/*		String [] names = new String[4];
				names[0] = "한재석";
				names[1] = "김재석";
				names[2] = "박재석"; */
				
 				//온도 3개를 저장할 수 있는 배열을 만들고 값을 대입
				double [] temp = new double[4];
				temp[0] = 35.9;
				temp[1] = 36.5;
				temp[2] = 38.1;
				temp[3] = 36.1;
				
				//코로나 증상여부 3개 저장할 수 있는 배열을 만들고 값을 대입
				boolean [] check = new boolean[4];
				check[0] = false;
				check[1] = false;
				check[2] = true;
				check[3] = false;
				
			/*	while(i<= 4) {
					System.out.printf("%s의 온도는%4.1f℃이며 코로나 증상여부는 %b입니다.\n", names[i], temp[i], check[i]);
					i = i + 1 ;
				} */
				//반복문을 사용하면 유지보수에 용이함
				//3이라고 배열의 데이터 개수를 설정하는 부분을 수정해서 배열의 속성으로 설정
				//데이터가 변경이 되도 출력하는 부분을 수정할 필요가 없어집니다.
				
				//for(int i = 0 ; i < names.length ; i = i +1) {
				//	System.out.printf("%s의 온도는%4.1f℃이며 코로나 증상여부는 %b입니다.\n", names[i], temp[i], check[i]);*/
				//.  으로 접근하거나 [인덱스]로 데이터를 접근하게 되면 메모리를 한 번 더 찾아가야 합니다.
				//반복문 등에서 동일한 데이터를 여러 번 . 이나 [인덱스]를 이용해서 찾아가게 되면 비효율적
				//이런 경우에는 이 데이터를 가까운 곳에 저장해두고 접근하는 것이 좋습니다.
				int len = names.length ;
				for(int i = 0 ; i < len ; i = i + 1) {
					System.out.printf("%s의 온도는%4.1f℃이며 코로나 증상여부는 %b입니다.\n", names[i], temp[i], check[i]);
				}
				
			
				}
				
}


