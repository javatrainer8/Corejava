package garbagecollection;

public class Shutdown{  
	 public static void main(String args[])throws Exception{  
	  Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");  
	 }  
	}  