package interfacePackage;

public class Company implements CompanyInterface{

    private String companyName;
    private String companyDetails;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyDetails() {
        return companyDetails;
    }

    public void setCompanyDetails(String companyDetails) {
        this.companyDetails = companyDetails;
    }

    @Override
    public Company getCompany() {
        return this;
    }

    public void hello() {

    }

}
