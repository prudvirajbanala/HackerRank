Skip to content
This repository
Search
Pull requests
Issues
Gist
 @prudvirajbanala
 Sign out
 Watch 0
  Star 0
  Fork 0 prudvirajbanala/HackerRank
 Code  Issues 0  Pull requests 0  Projects 1  Wiki  Pulse  Graphs  Settings
Branch: master Find file Copy pathHackerRank/Java_Loop_1.java
8ca443c  an hour ago
@prudvirajbanala prudvirajbanala Update Java_Loop_1.java
1 contributor
RawBlameHistory     
50 lines (38 sloc)  858 Bytes
/*
Objective 
In this challenge, we're going to use loops to help us do some simple math.
Task 
Given an integer, N, print its first 10 multiples. Each multiple Nxi(where 1<=i<=10) should be printed on a new line 
in the form: N x i = result.
Input Format
A single integer, N.
Constraints
2<=N<=20
Output Format
Print 10 lines of output; each line  (where 1<=i<=10) contains the  result of Nxi in the form: 
N x i = result.
Sample Input
2
Sample Output
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
*/
import java.util.Scanner;

public class Java_Loop_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int N = in.nextInt();
	    for(int i=1; i<=10; i++){
	        int r = N * i;
	        System.out.println(N + " x " + i + " = " + r);
	    }
	}

}

