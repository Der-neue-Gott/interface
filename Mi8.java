public class Mi8 extends Helicopter implements VerticalTakeoff { //наследование только от 1 класса, реализация от множества интерфейсов
	
	@Override
	public void fly() {
		System.out.println("Helicopter Mi8");
	}
	@Override
	public void verticalTakeoff() {
		System.out.println("Helicopter Mi8 vertical");
	}
	
}