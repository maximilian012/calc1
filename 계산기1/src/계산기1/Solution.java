package 계산기1;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int sum = 0;
			int n = sc.nextInt(); // 101, 83...
			int arr[][] = new int[n][n];
			
			for (int i = 0; i < 1; i++) {
				String str = sc.next(); // 9+8+5+9+2+4+...
				for(int j = 0; j < n; j++) {
					arr[i][j] = str.charAt(j) - '0'; // 한줄 쫙나온거 하나씩 쪼개어 int배열에 넣기 그래서 '0'을빼줘서 아스키코드상의 숫자로 계산
					
					if (arr[i][j] != -5) { // +는 아스키코드에서 43, 0은 48 즉 43-48 = -5 => -5가 아니면(+가아니면) 다 push해줌
						s.push(arr[i][j]);
					}
				}
			}
			while (!s.isEmpty()) {
				sum += s.pop();
			}

			System.out.println("#" + tc + " " + sum);
		}

	}

}
