
public class StringCal {
 public static int Add(String word) {
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
	 else{
		 sum=0;
			word.replaceAll("\n",",");
			String numList[] = word.split(",");
			for(String i : numList ) {
				 sum+=Integer.parseInt(i);
			 }
			return sum;	
		}
 }
}
