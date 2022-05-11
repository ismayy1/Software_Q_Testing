package seminar10.ismail.dp.template;

public abstract class ATemplateProcedure {
	
	public abstract void getProcedurePapers();
	public abstract void getOficcerApprovalProcedure();
	public abstract void identifyDamage();
	public abstract void evaluateHouse();
	public abstract void sendEvaluation();
	
	public void getInsurance() {
		getProcedurePapers();
		getOficcerApprovalProcedure();
		identifyDamage();
		evaluateHouse();
		sendEvaluation();
		//return
	}

}
