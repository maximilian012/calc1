package ����1;

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
					arr[i][j] = str.charAt(j) - '0'; // ���� �ӳ��°� �ϳ��� �ɰ��� int�迭�� �ֱ� �׷��� '0'�����༭ �ƽ�Ű�ڵ���� ���ڷ� ���
					
					if (arr[i][j] != -5) { // +�� �ƽ�Ű�ڵ忡�� 43, 0�� 48 �� 43-48 = -5 => -5�� �ƴϸ�(+���ƴϸ�) �� push����
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
