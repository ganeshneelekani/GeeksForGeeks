package com.gfg.designpattern.Builder;

public class Claim {

    private String claimId;
    private String providerName;
    private String personName;
    private String personId;

    Claim(ClaimBuilder userBuilder){
        this.claimId=userBuilder.claimId;
        this.providerName=userBuilder.providerName;
        this.personName=userBuilder.personName;
        this.personId=userBuilder.personId;
    }

    public String getClaimId() {
        return claimId;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonId() {
        return personId;
    }

    public static class ClaimBuilder{

        private String claimId;
        private String providerName;
        private String personName;
        private String personId;



        public ClaimBuilder setClaimId(String claimId) {
            this.claimId = claimId;
            return this;
        }

        public ClaimBuilder setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }

        public ClaimBuilder setPersonName(String personName) {
            this.personName = personName;
            return this;
        }

        public ClaimBuilder setPersonId(String personId) {
            this.personId = personId;
            return this;
        }


            Claim buider(){
            Claim claim=new Claim(this);
            return claim;
        }

    }
}
