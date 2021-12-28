package parse;

public class Statementclass {
	
	public String Name;
	public String Date;
	public String AccountType;
	public String BranchName;
	public String MIRCCode;
	public String IFSCCode;
	public String OpeningBalance;
	public String ClosingBalance;
	
	@Override
	public String toString()
	{
	    return Name;
	}
	public String getDate() {
		return Date;
	}
	public String getAccountType(){
		return AccountType;
	}
	public String getBranchName(){
		return BranchName;
	}
	public String getMIRCCode(){
		return MIRCCode;
	}
	public String getIFSCCode(){
		return IFSCCode;
	}
	public String getOpeningBalance(){
		return OpeningBalance;
	}
	public String getClosingBalance(){
		return ClosingBalance;
	}
	
	
}