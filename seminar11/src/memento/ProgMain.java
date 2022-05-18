package memento;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ManagerContractVersion manager = new ManagerContractVersion();
		
		Contract contract = new Contract("Your name");
		
		contract.addClause("increase the salary");  //
		manager.addContractVersion(contract.saveVersion());
		System.out.println(contract);
		
		contract.addClause("WFH");
		manager.addContractVersion(contract.saveVersion());
		System.out.println(contract);

		contract.addClause("Manager new role");  //
		manager.addContractVersion(contract.saveVersion());
		System.out.println(contract);
		
//		manager.recoverContract(0);
		contract.restoreFromVersion(manager.recoverContract(0));
		
		System.out.println("-----Recover-----");
		System.out.println(contract);
		

	}

}
