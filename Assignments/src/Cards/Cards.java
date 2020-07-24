package Cards;
public class Cards{
	
	

	 public boolean checkSequence(String cards) {
		 
		 String firstSuiteChar = null;
		 int suiteNumber = 0;
		 
		 String cardsforValiation = cards.replace("A", "1").replace("J", "11").replace("Q", "12").replace("K", "13");
		 
		 String[] arratOfCards = cardsforValiation.split(",");
			
			for(int i=0 ; i<arratOfCards.length ; i++,suiteNumber++) {
				
				String card = arratOfCards[i];
				
				String[] divCard = card.split("#");
				
				if(i == 0) {
					firstSuiteChar = divCard[0];
					suiteNumber = Integer.valueOf(divCard[1]);
				}
				
				String suitChar = divCard[0];
				int cardSuiteNumber = Integer.valueOf(divCard[1]);
				 
                if(!(firstSuiteChar.equalsIgnoreCase(suitChar)) || !(suiteNumber == cardSuiteNumber)) {
                	if(suiteNumber == 14 && cardSuiteNumber == 1)
                	continue;
					return false;
				}
				
			}
		 
		 return true;
		 
	 }
	
	
}