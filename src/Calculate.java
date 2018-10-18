
public class Calculate {
	public int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isOverNumber(int number) {
		if(this.number >= 0 && this.number <= 9) {
			return true;
		}
		else {
			return false;
		}
	}
	public String calculate() {
		
		String[] array = {"zero","one","two","three","fore","five","six","seven","eight","nine"};
		
		if(this.isOverNumber(number) == true) {
			
			return array[this.number];
		}else {
			return "Input 0-9";
		}
		
	}
}