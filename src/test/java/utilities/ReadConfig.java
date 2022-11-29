package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
    public Properties pro;
    public ReadConfig()
    {
        File src = new File("./Configurations/Config.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            try {
                pro.load(fis);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    //Registration Page
    public String setUrl() {return pro.getProperty("URL");}
    public String setfirstName() {return pro.getProperty("firstName");}
    public String setlastName() {return pro.getProperty("lastName");}
    public String setDay() { return pro.getProperty("Day");}
    public String setMonth() { return pro.getProperty("Month");}
    public String setYear() { return pro.getProperty("Year");}
    public String setCompanyName() { return pro.getProperty("CompanyName");}
    public String setPassword() { return pro.getProperty("Password");}
    public String setConfirmPassword() { return pro.getProperty("ConfirmPassword");}

    //Login Page
    public String setUsername(){ return pro.getProperty("userName");}
    public String setpassword(){ return pro.getProperty("passWord");}
}
