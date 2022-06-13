

public class huefs {
	public static void main(String[] args) {
		MyThing myThing, myThing2;
		myThing = new MySubThing();
		myThing2 = new MyOtherThing();
		myThing.value = 7;
		myThing2.value = 44;
		myThing.display();
		myThing2.display();
	}
}

class MyThing {
	int value;
	public void display() {
		System.out.println("In MyThing, value is " + value);
	}
}
class MySubThing extends MyThing {
	@Override
	public void display() {
		System.out.println("in MySUBThing, value is " + value);
	}
}
class MyOtherThing extends MyThing {
	@Override
	public void display() {
		System.out.println("In MyOTHERThing, value is " + value);
	}
}
