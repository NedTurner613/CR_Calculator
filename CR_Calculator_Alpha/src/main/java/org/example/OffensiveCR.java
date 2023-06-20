package org.example;

public class OffensiveCR {

    public Reference reference;


    public OffensiveCR() {
        this.reference = new Reference();
    }

    public int calculateOffensiveCR(int effectiveDmgPerRound, int effectiveOffBonus, boolean usingAttack){
        // determine base offensive CR
        int offensiveCR = reference.dmgToExpectedCR(effectiveDmgPerRound);

        //determine whether calculation is being based on attack bonus or save DC
        if(usingAttack){
            //determine expected Atk bonus based on base offensive CR
            int expectedAtkBonus = reference.crToExpectedAtkBonus(offensiveCR);
            // adjust for difference in effective attack bonus
            if (expectedAtkBonus!=effectiveOffBonus){
                int atkAdjust = (effectiveOffBonus-expectedAtkBonus)/2;
                offensiveCR+=atkAdjust;
            }
        }else{
            // determine expected Save DC based on base offensive CR
            int expectedSaveDC = reference.crToExpectedSaveDC(offensiveCR);
            // adjust for difference in effective save DC
            if (expectedSaveDC!=effectiveOffBonus){
                int atkAdjust = (effectiveOffBonus-expectedSaveDC)/2;
                offensiveCR+=atkAdjust;
            }
        }
        return offensiveCR;
    }
}
