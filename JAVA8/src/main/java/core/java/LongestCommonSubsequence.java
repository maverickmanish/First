package core.java;

import java.util.Scanner;

import org.apache.commons.codec.binary.StringUtils;

public class LongestCommonSubsequence {
	/*
	 *2
6 6
ABCDGH
AEDFHR
3 2
ABC
AC
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCases= scanner.nextInt();
		String string[]= new String[testCases];
		boolean first=false;
		scanner.nextLine();
		for(int i=0;i<testCases;i++)
		{first=false;
		
		   string[i]=scanner.nextLine();
		   
		   
			  int stringSize1=Integer.parseInt(string[i].split(" ")[0]);
			  int stringSize2=Integer.parseInt(string[i].split(" ")[1]);
			  if(stringSize1<stringSize2)
				  first=true;
			  String strings[]=new String[2];
			  /*new StringBuilder(scanner.nextLine().trim()).reverse().toString()*/
			  strings[0]= scanner.nextLine().trim();
			  strings[1]=scanner.nextLine().trim();
			  System.out.println(LCS(strings,first));
			  System.out.println(LCSinteger(strings));
			  
		}
		scanner.close();
	}

private static int LCSinteger(String[] strings){
	String s1=strings[0], s2=strings[1];
        int n1 = s1.length();
        int n2 = s2.length();
        int[][] dp = new int[n1+1][n2+1];
        for(int i=0; i<=n1; i++){
            for(int j=0; j<=n2; j++){
                if(i == 0 || j == 0) dp[i][j] = 0;
                else if(s1.charAt(i-1) == s2.charAt(j-1)) 
                    dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }
        return dp[n1][n2];
    }
	
	private static  int LCS(String[] strings, boolean first) {
		/*System.out.println("   this is function ");
		System.out.println(strings[0]);*/
		char firstCharArray[], secondCharArray[];
		StringBuilder string= new StringBuilder();
	/*	string.append('m');
	*/	if(first)
		{	
			 firstCharArray=strings[0].toCharArray();
			secondCharArray=strings[1].toCharArray();
		}
		else
		{
			firstCharArray=strings[1].toCharArray();
			secondCharArray=strings[0].toCharArray();
		}
	int max=0;
	StringBuilder string2= new StringBuilder();
	/*	System.out.println("length of first char array is : "+firstCharArray.length+"  particular character is :"+firstCharArray[0]);
		System.out.println(firstCharArray[0]==secondCharArray[0]);
	*/	for(int i=0;i<firstCharArray.length;i++)
		{
		string.setLength(0);
			for(int j=0;j<secondCharArray.length;j++)
			{
			/*	System.out.println(firstCharArray[0]==secondCharArray[0]);
				System.out.println(firstCharArray[i]==secondCharArray[j]);
				*/if(firstCharArray[i] == secondCharArray[j])
				{ 
					
					/*System.out.println("comparing firststring's : "+firstCharArray[i]+" with second : "+secondCharArray[j]);
					*/string.append(firstCharArray[i]);
					System.out.println(string.toString());
					System.out.println("index in first string "+i);
					System.out.println("index in second string "+j);
					if(i==firstCharArray.length-1)
						break;
					else
				     	i++;
				}
				
			}
			
		if(max < string.toString().length())
			{max=string.toString().length();
				string2=new StringBuilder(string);
			}
			
		}
	System.out.println(string2.toString());
		return string2.length();
	}
}
