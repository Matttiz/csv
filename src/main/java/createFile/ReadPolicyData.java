package createFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class ReadPolicyData {
    private String path;
    private String fileContent;

    public void readPolicy(String path) throws IOException {
        this.path = System.getProperty("user.dir") + path;
        this.read();
    }

    public void readPolicy() throws IOException {
        this.path = System.getProperty("user.dir") + "/data/policyDetails.json";
        this.read();
    }

    private void read()throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(this.path));
        String fileContent = "";
        String line = reader.readLine();
        while(line != null) {
            fileContent+=line + "\n";
            line = reader.readLine();
        }
        this.fileContent=fileContent;
        System.out.println(fileContent);
        reader.close();
    }

    public String getFileContent(){return fileContent;};
}
