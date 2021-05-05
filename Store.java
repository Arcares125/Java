
public class Store {
	
	String nStore, nAddress;

	public Store(String store, String address) {
		// TODO Auto-generated constructor stub
		super();
		this.nStore = store;
		this.nAddress = address;
	}

	public String getnStore() {
		return nStore;
	}

	public void setnStore(String nStore) {
		this.nStore = nStore;
	}

	public String getnAddress() {
		return nAddress;
	}

	public void setnAddress(String nAddress) {
		this.nAddress = nAddress;
	}

}
