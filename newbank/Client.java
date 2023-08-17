public class Client{
	private List<Account> accounts = new ArrayList<>();

	public List<Account> getAccounts(){
		return accounts;
	} 

	public void addAccounts(final Account account){
		this.accounts.add(account);

	}
}