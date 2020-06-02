package com.gfg.designpattern.Builder;

public class MainClass {

    public static void main(String[] args) {

        Claim claimBuilder=new Claim.ClaimBuilder().setClaimId("dd").buider();

        System.out.println(claimBuilder.getClaimId());
    }
}
