package createFile;

import java.io.IOException;

public class CreateDocument {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World");
        ReadPolicyData file= new ReadPolicyData();
        file.readPolicy();

        DeserializePolicyData data = new DeserializePolicyData(file);
        PolicyData policyData = new PolicyData(data);

    }
}
