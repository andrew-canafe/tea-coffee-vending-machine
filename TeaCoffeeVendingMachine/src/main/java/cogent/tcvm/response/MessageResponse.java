package cogent.tcvm.response;

public class MessageResponse {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public MessageResponse(String message) {
		super();
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageResponse [message=" + message + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
