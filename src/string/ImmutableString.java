package string;

class ImmutableString{  
	 public static void main(String args[]){  
	   String s="Sachin";  
	   s.concat(" Tendulkar");//concat() method appends the string at the end  
	   System.out.println(s);//will print Sachin because strings are immutable objects  
	 String r = "Ricky";
	 String p = "ponting";
	 String name = r.concat(p);
	 System.out.println(r);
	 System.out.println(p);
	 System.out.println(name);
	 
	 }  
	}  
