# ArrayList

==import java.util.ArrayList==
an __ArrayList__ is an ordered list of reference type items
Each item in an _ArrayList_ is called an __Element__

ArrayList<Integer> vals = new ArrayList<Integer>();
creates a new list of Integers, called vals

ArrayList<int> vals = new ArrayList<int>();
//^^ can't do this: type has to be a Class Reference type

![Here are some ArrayList Methods](ArrayListMethods.PNG)
### Array Methods:
- add(element) //adds element ot end of list
- get(index) //starting at 0
- set(index, element) // sets arr[indx] to elem
- size() //returns # of elements in list