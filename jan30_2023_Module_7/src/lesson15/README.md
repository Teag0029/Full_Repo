/*test
---
_ Class: Hello _
---
- String:toPrint
---
+ print(String)
+ print()
---

'
public class Hello{
	public Hello(){
		print();
	}
	
	public static print(String s){
		System.out.println(s);
	}
	
	public static print(){
		print("Hello World!");
	}
}
'
*/