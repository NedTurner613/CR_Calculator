package org.example;

public class DefensiveCR {

    private Reference reference;

    public DefensiveCR() {
        this.reference = new Reference();
    }

    public int calculateDefensiveCR(int effectiveHP, int effectiveAC){
        // determine base defensive CR
        int defensiveCR = reference.hpToExpectedCR(effectiveHP);
        //determine expected AC based on base defensive CR
        int expectedAC = reference.crToExpectedAC(defensiveCR);
        // adjust for difference in effective AC
        if(expectedAC!=effectiveAC){
            int acAdjust = (effectiveAC-expectedAC)/2;
            defensiveCR+=acAdjust;
        }
        return defensiveCR;
    }

}
