package arrayPrograms;

import java.util.ArrayList;

public class A {
    public static void main(String[]args){
        ArrayList al = new ArrayList();
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        
        ArrayList all = new ArrayList();
        all.add("ABC");
        all.add("DEF");
        all.add("PQR");
        all.add("STU");
        all.add("XYZ");
        
        String [] s = new String[all.size()];
        for(int i=0, j=0;j<s.length;j++){
        	s[j]=al.get(i)+"---"+all.get(j);
        	if(i==2) {
        		i=0;
        	}
        	else {
        		i++;
        	}
            
        }
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
