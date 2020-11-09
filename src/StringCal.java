/*************
 * Created by Teja Chilumula 11-9-2020
 */

import java.lang.*;
public class StringCal {
 public static int Add(String word) throws Exception  {
	 //String Greater[]=word.split(",");
	 int sum=0;
	 if(word=="")
	 return 0;
	 else if(word.length()==1)
		 return Integer.parseInt(word);
	 else if(word.length()==2) {
		 sum=0;
		 String inputNums[]=word.split(",");
		 for(String i : inputNums ) {
			 sum+=Integer.parseInt(i);
		 }
		 return sum;
	 }
	 else if(word.indexOf("|\n")==-1){
		 sum=0;
			String numList[] = word.split(",|\n");
			for(String i : numList ) {
				 sum+=Integer.parseInt(i);
			 }
			return sum;	
		}
	
	 
	 else {
		 
		 //String inputNums[]=word.split(",");
		 //return summ(inputNums);
		 String delimiter = ",";
			if(word.matches("//(.*)\n(.*)")){
				delimiter = Character.toString(word.charAt(2));
				word = word.substring(4);
			}

			String numList[] = word.split( delimiter + "|\n");
			return summ(numList);
		 
         
		 }
		 
	 }
public static int greater(String word) {
	String Gre[]=word.split(",");
	int a=summ(Gre);
	return a;
	
}
 
 public static int summ(String[] word) {
	 int sum=0;
	 String Negative="";
	 for(String i:word) {
		 if(Integer.parseInt(i)<0) {
			 if(Negative.equals("")) {
				 Negative=i;
			 }
			 else
				 Negative+=(","+i);
		 }
		 else if(Integer.parseInt(i)<1000) {
			 
			 sum+=Integer.parseInt(i);
		 }
		 if(!Negative.equals("")) {
			 throw new IllegalArgumentException("Neagtives not allowed: "+Negative);
		 }
 }
 return sum;
}
 }
	
