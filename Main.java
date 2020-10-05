public class Main { //интерфейсы необходимы для создания "иерархии" объектов
	public static void main(String[] args) {
		
		Mi8 mi8 = new Mi8();
		Boeing737 boeing737 = new Boeing737();
		
		Test test = new Test();
		test.foo(boeing737); //просит ввести летающий объект с цепи наследования: либо flyingObject, либо его потомки
		test.foo1(mi8); //подходит только для вертолётов
	}
}