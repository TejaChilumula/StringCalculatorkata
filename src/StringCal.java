
public class StringCal {
 public static int Add(String word) {
	 if(word=="")
	 return 0;
	 else if(word.length()==1)
		 return Integer.parseInt(word);
	 else {
		 int sum=0;
		 String inputNums[]=word.split(",");
		 for(String i : inputNums ) {
			 sum+=Integer.parseInt(i);
		 }
		 return sum;
	 }
 }
}
