package com.practise;

/* class A {

	public A(int a) {
		
		System.out.println("Inside A");
	}
}
 class B extends A{

	public B(int a) {
		super(a);
		System.out.println("Inside B");
	}
	
}*/
/*public class C {
	public static void main(String[] args) {
		String s="Print";
		String s1="Print";
		System.out.println(s1.equals(s));
		//B b=new B(5);
		//B b=new B();
		//For printing the triangle with *
		int size=3;
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=size;j++) {
				if(i+j>size) {
					System.out.print("*");
					System.out.print(" ");
					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		boolean flag=true;
		String a="keeg";
		String b="geek";
		int len1=a.length();
		int len2=b.length();
		int count=0;
		int z[]=new int[2];
		if(len1==len2) {
			char x[]=a.toCharArray();
			char y[]=b.toCharArray();
			for(int i=0;i<len1;i++) {
				if(x[i]!=y[i]) {
					z[count]=i;
				    count++;
				}
			
			}
			if(count>2) {
				flag=false;
			}else {
				char ch=x[z[0]];
				x[z[0]]=x[z[1]];
				x[z[1]]=ch;
			}
			String c=new String(x);
			if(!c.equals(b)) {
				flag=false;
			}
		}else {
			flag=false;
		}
		System.out.println(flag);
	}*/
class A 
{
    final public int GetResult(int a, int b) { return 0; } 
} 
class B extends A 
{ 
	
   // public int GetResult(int a, int b) {return 1; } 
} 
public class C
{
    public static void main(String args[]) 
    { 
        B b = new B(); 
       
        System.out.println("x = " + b.GetResult(0, 1));  
    } 


}