import java.util.Scanner;

public class Jumble {
	public static String jumblingSentence(String in1,int in2){
		String result="";
		if(in2==1){
			result=method1(in1);
		}
		if(in2==2){
			result=method2(in1);
		}
		String output=result.trim();
		return output;
	}
	public static String method1(String s1){  /*in this method first letter as same and left to right add the add posion letters
		and right to left even position letters */
		String[] array=s1.split(" ");
		String result="";
		for(int i=0;i<array.length;i++){
			String str=array[i];
			String temp=str.charAt(0)+"";
			for(int j=1;j<str.length();j++){
				if(j%2==0){
					temp+=str.charAt(j);
				}
			}
			for(int j=str.length()-1;j>0;j--){
				if(j%2==1){
					temp+=str.charAt(j);
				}
			}
			result+=temp+" ";
		}
		return result;
	}
	public static String method2(String s2){  /*in this method first letter as same and left to right add the add posion letters
		and again left to right even position letters */
		String[] array=s2.split(" ");
		String result="";
		for(int i=0;i<array.length;i++){
			String str=array[i];
			String temp=str.charAt(0)+"";
			String temp1="";
			for(int j=1;j<str.length();j++){
				if(j%2==0){
					temp+=str.charAt(j);
				}
				if(j%2==1){
					temp1+=str.charAt(j);
				}
			}
			result+=temp+temp1+" ";
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String input1=in.nextLine();
		int input2=in.nextInt();
		System.out.println(jumblingSentence(input1,input2));
		in.close();
	}
}
