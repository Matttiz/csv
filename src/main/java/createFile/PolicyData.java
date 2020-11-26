package createFile;

public class PolicyData {
    String policyNumber;
    String policyHolderNIP;

    public PolicyData(DeserializePolicyData data) {
        this.policyHolderNIP= data.getPolicyHolderNIP();
        this.policyNumber=data.getPolicyNumber();
    }


    public void PolicyData(){
        this.policyHolderNIP="";
        this.policyNumber="";
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setPolicyHolderNIP(String policyHolderNIP) {
        this.policyHolderNIP = policyHolderNIP;
    }
}
