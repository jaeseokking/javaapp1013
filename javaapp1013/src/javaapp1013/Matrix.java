package javaapp1013;

public class Matrix {
	public static void main(String [] args) {
		//문자열 2차원 배열을 생성
		String [][] names = {
			// 행 열	
				{"태연","유리","윤아"}, //1행 1열
				{"지수","제니","로사"}  //1행 2열 
		};
		
		/*
		//행의 순회
		for(int i = 0 ; i <names.length ; i = i +1) { //행의 개수
			//열의 순회
			for(int j = 0; j <names[i].length ; j = j + 1) { //열의 개수
				System.out.printf("%10s", names[i][j]); 
				
			}
		System.out.printf("\n");
		}
		*/
		
		/*
		//빠른 열거 이용
		//배열의 배열이므로 처음에는 배열에 저장하고
		for(String [] temp : names) { //names에 있는 배열을 temp에 저장
			//그 배열을 다시 순서대로 순회
			for(String imsi : temp) { //temp의 데이터를 순서대로 imsi에 대입하여 { }에 있는내용 반복
				System.out.printf("%15s",imsi);
			}
		System.out.printf("\n");
		}
		*/
		
			//일차원 배열을 이차원 배열처럼 이용
			//이 구조는 실무에서도 많이 이용
			String [] players = {
					"한유미", "배유나", "문정원",
					"문성민", "신영석", "최민호"
			};
			
			for(int i = 0 ; i <players.length ; i = i + 1) { //행의 갯수만큼 반복 (6번)
				System.out.printf("%15s", players[i]); 
				if(i % 3 == 2) { //0 ~ 2 까지는 1행으로 //3~5까지는 2행
					System.out.printf("\n");
				}
			}
		
		
	}

}
