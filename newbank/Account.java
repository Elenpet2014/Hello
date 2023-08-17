import java.util.UUID;

public class Account{
	private final Currencies currency;
	private double balance;
	private final String id;

	public Account(Currencies currency){
		this.currency = currency;
		id = UUID.randomUUID().toString();

	}

	public Currencies getCurrency(){
		return currency;
	}

	public void addBalance(double amount){
		this.balance += amount;
	}

	public void reduceBalance(double amount){
		if(balance <amount){
			throw new InvalidAmountException("Insuficient funds");
		}
		this.balance -= amount;
	}

	public void sendMoney(final Bank bank, final Account account, final double amount){
		for(int i = 0; i<bank.getClients().size(); i++){
			for(int j = 0; j<bank.getClients().get(i).getAccounts().size(); j++){
				if(bank.getClients().get(i).getAccounts().equals(account)){
					
					if(!bank.getClients().get(i).getAccounts().get(j).getCurrency().equals(this.getCurrency())){
						throw new WrongCurrencyException("Invalid currency");
					}	

					this.reduceBalance(amount);
		   			account.addBalance(amount);
		   			return;

				} 

			}

		}
		throw new InvalidAccountException("Invalid account");



	}



	public double getBalance(){
		return balance;
	}

}