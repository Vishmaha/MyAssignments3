package week3_Assignment;

public class APIClient {

	public void sendRequest(String endpoint) {
    System.out.println(endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println(endpoint +" " +requestBody+" " +requestStatus);
	}
	
	public static void main (String[] args) {
		APIClient api = new APIClient();
		api.sendRequest("getrequest");
		api.sendRequest("getrequest", "post", true);
		
		
	}

	

}
