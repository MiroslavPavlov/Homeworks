package Problem2;

public class GSM {
	String model;
	boolean hasSimCard = false;
	String simMoblileNumber;
	int outgoingCallsDuration;
	String lastIncomingCall;
	String lastOutgoingCall;

	void insertSim(String simNumber) {
		if (simNumber.charAt(0) == '0' && simNumber.charAt(1) == '8' && simNumber.length() == 10) {
			this.hasSimCard = true;
			this.simMoblileNumber = simNumber;
		} else {
			System.out.println("Please insert a valid sim card number");
		}
	}

	void removeSimCard() {
		this.hasSimCard = false;
	}

	void call(GSM reciever, int duration) {
		if (duration >= 0) {
			if (reciever.hasSimCard == true) {
				this.lastOutgoingCall = reciever.simMoblileNumber;
				reciever.lastIncomingCall = this.simMoblileNumber;
				this.outgoingCallsDuration += duration;
			} else {
				System.out.println("Reciever has no sim");
			}

		} else {
			System.out.println("Invalid call duration");
		}

	}

	void printLastOutgoingCall() {
		if (this.lastOutgoingCall.length() != 0) {
			System.out.println("Your last call was towards: " + this.lastOutgoingCall);
		} else {
			System.out.println("You have no last outgoing calls");
		}
	}

	void printLastIncomingCall() {
		if (this.lastIncomingCall.length() != 0) {
			System.out.println("Your last incoming call was: " + this.lastIncomingCall);
		} else {
			System.out.println("You have no previous incoming calls");
		}
	}
	
}
