package Problem2;

public class Call {
	public static int priceForAMinute;
	String caller;
	String reciever;
	int duration;
	
	double getSumForCalls(GSM interestedParty){
		return interestedParty.outgoingCallsDuration*priceForAMinute;
	}
	
}
