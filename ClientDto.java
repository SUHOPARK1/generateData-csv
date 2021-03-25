package dummy;

public class ClientDto {



    public int cliNum;
    public String role; // user
    public String provider; //naver, google, kakao
    public String cliId;
    public String cliName;
    public String cliGender;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String cliEmail;
    public String cliAgearange;

    public int getCliNum() {
        return cliNum;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void setCliNum(int cliNum) {
        this.cliNum = cliNum;
    }

    public String getCliId() {
        return cliId;
    }

    public void setCliId(String cliId) {
        this.cliId = cliId;
    }

    public String getCliName() {
        return cliName;
    }

    public void setCliName(String cliName) {
        this.cliName = cliName;
    }

    public String getCliGender() {
        return cliGender;
    }

    public void setCliGender(String cliGender) {
        this.cliGender = cliGender;
    }

    public String getCliEmail() {
        return cliEmail;
    }

    public void setCliEmail(String cliEmail) {
        this.cliEmail = cliEmail;
    }

    public String getCliAgearange() {
        return cliAgearange;
    }

    public void setCliAgearange(String cliAgearange) {
        this.cliAgearange = cliAgearange;
    }

    @Override
    public String toString() {
        return "ClientDto{" +
                "cliNum=" + cliNum +
                ", role='" + role + '\'' +
                ", provider='" + provider + '\'' +
                ", cliId='" + cliId + '\'' +
                ", cliName='" + cliName + '\'' +
                ", cliGender='" + cliGender + '\'' +
                ", cliEmail='" + cliEmail + '\'' +
                ", cliAgearange='" + cliAgearange + '\'' +
                '}';
    }
}
