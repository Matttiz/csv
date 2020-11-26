package createFile;




public class DeserializePolicyData {

    String policyNumber;
    String policyHolderNIP;
    String[] lines;

    private void fillLines(ReadPolicyData data){
        String fileContent = data.getFileContent();
        this.lines = fileContent.split("\\r?\\n");
    }

    public DeserializePolicyData(ReadPolicyData data){
        this.fillLines(data);
        setPolicyNumber(data);
        getPolicyHolderNIP(data);
    }

    private void setPolicyNumber(ReadPolicyData data){
        this.policyNumber =  this.getValueByText("policyNumber");
    }

    public String  getPolicyNumber(){
        return this.policyNumber;
    }

    public String  getPolicyHolderNIP(){
        return this.policyHolderNIP;
    }

    private void getPolicyHolderNIP(ReadPolicyData data){
        this.policyHolderNIP = this.getValueByText("policyHolderNIP");
    }

    private String getValueByText(String text){
        String[] arrOfStr=null;
        for(int i =0; i<=this.lines.length; i++){
            if (lines[i].contains(text)){
                arrOfStr = lines[i].split(":", 2);
                arrOfStr[1] = arrOfStr[1].substring(2,arrOfStr[1].length()-1);
                System.out.println(lines[i]);
                break;
            }
        }
        return arrOfStr[1];
    }

}
