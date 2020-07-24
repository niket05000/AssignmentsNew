package Cards;
public class CardsDemo{
	
	public static void main (String args[]) {
		
		String cards = "D#A,D#2,D#3,D#4,D#5,D#6,D#7,D#8,D#9,D#10,D#J,D#Q,D#K,D#A";
		
        Cards c = new Cards();
        
        //public boolean checkSequence(String cards);
        System.out.println(c.checkSequence(cards));

	}
}
