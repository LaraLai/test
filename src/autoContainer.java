
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class autoContainer {

	static void autoCreate(int v_num){
		ArrayList vAL = new ArrayList();
		
		for(int i=0;i<v_num;i++){
			ArrayList vSubAL = new ArrayList();
			vSubAL.add(String.valueOf(i+1)+".Apple");
			vSubAL.add(String.valueOf(i+1)+".Orange");
			vAL.add(vSubAL);
		}
		
		ListIterator it = vAL.listIterator();
		
		while(it.hasNext()){
			ArrayList vSubAL = (ArrayList)it.next();
			System.out.println(vSubAL.get(0));  
			System.out.println(vSubAL.get(0));  
			System.out.println(vSubAL.get(1));  
		}
		
		
		
		
	   //String vText = vAL.get(0).toString();
	   //String[] vArgs = vText.split(",");
		
	   //System.out.println("No1."+vArgs[0].toString());
	   //System.out.println("No2."+vArgs[1].toString());
	    //System.out.println("0: " +   vAL.get(0).toString());
		//System.out.println("1: " +   vAL.get(0));
		//System.out.println("2: " +   vAL.subList(1, 2));
		//for(int i=0;i<vAL.size();i++){
		
			//System.out.println(String.valueOf(i+1)+"列印:" + vAL.get(i).toString());
		//}
	}
	
	static void test(){
		String t="id=? and name=? and sex=?";
		String patternStr = "[?]{1}";
		
		Pattern pattern = Pattern.compile(patternStr);
		
		Matcher matcher = pattern.matcher(t);
		
		boolean matchFound = matcher.find();

		
		if (matchFound)
		{
			t=t.replaceFirst(patternStr, "123");
			t=t.replaceFirst(patternStr, "King Wang");
		    t=t.replaceFirst(patternStr, "M");
		    System.out.print(t);
		}
		else
			System.out.println("沒有出現！");
		
		
	}
	
	
	public static void main(String[] args) {
		//autoCreate(2);
		test();
	}
}
