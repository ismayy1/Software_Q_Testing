package memento;

public class ContractVersion {		//Memento
	
	private String contractClause;

	public ContractVersion(String contractClause) {
		super();
		this.contractClause = contractClause;
	}

	public String getContractClause() {
		return contractClause;
	}

	public void setContractClause(String contractClause) {
		this.contractClause = contractClause;
	}

	public ContractVersion() {
		super();
	}
	
	

}
