package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionScanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("数値を入力してください");
			int in = sc.nextInt();
			System.out.println(in);
			
		}catch (InputMismatchException e) {
			System.out.println("数値以外の入力を検知");
		}finally {

			sc.close();
		}
	}
}
