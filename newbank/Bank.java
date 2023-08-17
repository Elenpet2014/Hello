import java.util.*;

public class Bank{
	private List<Client> clients = new ArrayList<>();

	public List<Client> getClients(){
		return this.clients;

	}

	public void addClient(final Client client){
		this.clients.add(client);

	}
}