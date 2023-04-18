package string1;

public class AA_Practice {
		  public static void main(String[] args) {
		        String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		        s1=removeSpace(s1);
		        boolean t=isPanagram(s1);
		        if(t){
		            System.out.println("Panagram");
		        }
		        else{
		            System.out.println("Not panagram");
		        }
		        
		    }
		    public static String removeSpace(String s){
		        String s1="";
		        for(int i=0;i<s.length();i++){
		            if(s.charAt(i)!=' '){
		                s1=s1+s.charAt(i);
		            }
		            
		        }
		        return s1;
		    }
		    public static boolean isPanagram(String s){
		        int []a=new int [26];
		        for(int i=0;i<s.length();i++){
		            a[s.charAt(i)-'A']++;
		        }
		        for(int i=0;i<a.length;i++){
		            if(a[i]==0){
		                return false;
		            }
		            
		        }
		        return true;
		    }
}
