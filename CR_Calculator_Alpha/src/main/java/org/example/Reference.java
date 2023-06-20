package org.example;

import java.util.Locale;

public class Reference {




    //    determines associated proficiency bonus based on given CR
    public int crToProf(int CR){
        int PB = 2;
//        very long switch statement of CR to PB
        switch (CR){
            case 0:
                PB = 2;
                break;
            case 1:
                PB = 2;
                break;
            case 2:
                PB = 2;
                break;
            case 3:
                PB = 2;
                break;
            case 4:
                PB = 2;
                break;
            case 5:
                PB = 3;
                break;
            case 6:
                PB = 3;
                break;
            case 7:
                PB = 3;
                break;
            case 8:
                PB = 3;
                break;
            case 9:
                PB = 4;
                break;
            case 10:
                PB = 4;
                break;
            case 11:
                PB = 4;
                break;
            case 12:
                PB = 4;
                break;
            case 13:
                PB = 5;
                break;
            case 14:
                PB = 5;
                break;
            case 15:
                PB = 5;
                break;
            case 16:
                PB = 5;
                break;
            case 17:
                PB = 6;
                break;
            case 18:
                PB = 6;
                break;
            case 19:
                PB = 6;
                break;
            case 20:
                PB = 6;
                break;
            case 21:
                PB = 7;
                break;
            case 22:
                PB = 7;
                break;
            case 23:
                PB = 7;
                break;
            case 24:
                PB = 7;
                break;
            case 25:
                PB = 8;
                break;
            case 26:
                PB = 8;
                break;
            case 27:
                PB = 8;
                break;
            case 28:
                PB = 8;
                break;
            case 29:
                PB = 9;
                break;
            case 30:
                PB = 9;
                break;
        }

        return PB;
    }

    //    input hit points to determine expected CR
    public int hpToExpectedCR(int HP){
        int expectedCR = 0;
//        painfully long if statement of damage per round to expected CR
        if (HP <= 70) {
            expectedCR = 0;
        } else if (isBetween(HP,71,85)) {
            expectedCR = 1;
        } else if (isBetween(HP,86,100)) {
            expectedCR = 2;
        } else if (isBetween(HP,101,115)) {
            expectedCR = 3;
        } else if (isBetween(HP,116,130)) {
            expectedCR = 4;
        } else if (isBetween(HP,131,145)) {
            expectedCR = 5;
        } else if (isBetween(HP,146,160)) {
            expectedCR = 6;
        } else if (isBetween(HP,161,175)) {
            expectedCR = 7;
        } else if (isBetween(HP,176,190)) {
            expectedCR = 8;
        } else if (isBetween(HP,191,203)) {
            expectedCR = 9;
        } else if (isBetween(HP,206,220)) {
            expectedCR = 10;
        } else if (isBetween(HP,221,235)) {
            expectedCR = 11;
        } else if (isBetween(HP,236,250)) {
            expectedCR = 12;
        } else if (isBetween(HP,251,265)) {
            expectedCR = 13;
        } else if (isBetween(HP,266,280)) {
            expectedCR = 14;
        } else if (isBetween(HP,281,295)) {
            expectedCR = 15;
        } else if (isBetween(HP,296,310)) {
            expectedCR = 16;
        } else if (isBetween(HP,311,325)) {
            expectedCR = 17;
        } else if (isBetween(HP,326,340)) {
            expectedCR = 18;
        } else if (isBetween(HP,341,355)) {
            expectedCR = 19;
        } else if (isBetween(HP,356,400)) {
            expectedCR = 20;
        } else if (isBetween(HP,401,445)) {
            expectedCR = 21;
        } else if (isBetween(HP,446,490)) {
            expectedCR = 22;
        } else if (isBetween(HP,491,535)) {
            expectedCR = 23;
        } else if (isBetween(HP,536,580)) {
            expectedCR = 24;
        } else if (isBetween(HP,581,625)) {
            expectedCR = 25;
        } else if (isBetween(HP,626,670)) {
            expectedCR = 26;
        } else if (isBetween(HP,671,715)) {
            expectedCR = 27;
        } else if (isBetween(HP,716,760)) {
            expectedCR = 28;
        } else if (isBetween(HP,761,805)) {
            expectedCR = 29;
        } else if (isBetween(HP,806,850)) {
            expectedCR = 30;
        } else {
            expectedCR = 30;
        }

        return expectedCR;
    }

    //    input damage per round to determine expected CR
    public int dmgToExpectedCR(int dmgRnd){
        int expectedCR = 0;
//        painfully long if statements of damage per round to expected CR
        if (dmgRnd <= 8) {
            expectedCR = 0;
        } else if (isBetween(dmgRnd,9,14)) {
            expectedCR = 1;
        } else if (isBetween(dmgRnd,15,20)) {
            expectedCR = 2;
        } else if (isBetween(dmgRnd,21,23)) {
            expectedCR = 3;
        } else if (isBetween(dmgRnd,27,32)) {
            expectedCR = 4;
        } else if (isBetween(dmgRnd,33,38)) {
            expectedCR = 5;
        } else if (isBetween(dmgRnd,39,44)) {
            expectedCR = 6;
        } else if (isBetween(dmgRnd,45,50)) {
            expectedCR = 7;
        } else if (isBetween(dmgRnd,51,56)) {
            expectedCR = 8;
        } else if (isBetween(dmgRnd,57,62)) {
            expectedCR = 9;
        } else if (isBetween(dmgRnd,63,68)) {
            expectedCR = 10;
        } else if (isBetween(dmgRnd,69,74)) {
            expectedCR = 11;
        } else if (isBetween(dmgRnd,75,80)) {
            expectedCR = 12;
        } else if (isBetween(dmgRnd,81,86)) {
            expectedCR = 13;
        } else if (isBetween(dmgRnd,87,92)) {
            expectedCR = 14;
        } else if (isBetween(dmgRnd,93,98)) {
            expectedCR = 15;
        } else if (isBetween(dmgRnd,99,104)) {
            expectedCR = 16;
        } else if (isBetween(dmgRnd,105,110)) {
            expectedCR = 17;
        } else if (isBetween(dmgRnd,111,116)) {
            expectedCR = 18;
        } else if (isBetween(dmgRnd,117,122)) {
            expectedCR = 19;
        } else if (isBetween(dmgRnd,123,140)) {
            expectedCR = 20;
        } else if (isBetween(dmgRnd,141,158)) {
            expectedCR = 21;
        } else if (isBetween(dmgRnd,159,176)) {
            expectedCR = 22;
        } else if (isBetween(dmgRnd,177,194)) {
            expectedCR = 23;
        } else if (isBetween(dmgRnd,195,212)) {
            expectedCR = 24;
        } else if (isBetween(dmgRnd,213,230)) {
            expectedCR = 25;
        } else if (isBetween(dmgRnd,231,248)) {
            expectedCR = 26;
        } else if (isBetween(dmgRnd,249,266)) {
            expectedCR = 27;
        } else if (isBetween(dmgRnd,267,284)) {
            expectedCR = 28;
        } else if (isBetween(dmgRnd,285,302)) {
            expectedCR = 29;
        } else if (isBetween(dmgRnd,303,320)) {
            expectedCR = 30;
        } else {
            expectedCR = 30;
        }

        return expectedCR;
    }

    //    input CR to determine expected AC
    public int crToExpectedAC(int CR){
        int AC = 0;

        if(CR <= 1){
            AC = 13;
        } else if(CR==2){
            AC = 13;
        } else if(CR==3){
            AC = 14;
        } else if(CR==4){
            AC = 14;
        } else if(CR==5){
            AC = 15;
        } else if(CR==6){
            AC = 15;
        } else if(CR==7){
            AC = 15;
        } else if(CR==8){
            AC = 16;
        } else if(CR==9){
            AC = 16;
        } else if(CR==10){
            AC = 17;
        } else if(CR==11){
            AC = 17;
        } else if(CR==12){
            AC = 17;
        } else if(CR==13){
            AC = 18;
        } else if(CR==14){
            AC = 18;
        } else if(CR==15){
            AC = 18;
        } else if(CR==16){
            AC = 18;
        } else if(CR==17){
            AC = 19;
        } else if(CR>=18){
            AC = 19;
        }

        return AC;
    }

    //    input CR to determine expected Atk Bonus
    public int crToExpectedAtkBonus(int CR){
        int expectedAtkBonus = 0;

        if(CR <= 1){
            expectedAtkBonus = 3;
        } else if(CR==2){
            expectedAtkBonus = 3;
        } else if(CR==3){
            expectedAtkBonus = 4;
        } else if(CR==4){
            expectedAtkBonus = 5;
        } else if(CR==5){
            expectedAtkBonus = 6;
        } else if(CR==6){
            expectedAtkBonus = 6;
        } else if(CR==7){
            expectedAtkBonus = 6;
        } else if(CR==8){
            expectedAtkBonus = 7;
        } else if(CR==9){
            expectedAtkBonus = 7;
        } else if(CR==10){
            expectedAtkBonus = 7;
        } else if(CR==11){
            expectedAtkBonus = 8;
        } else if(CR==12){
            expectedAtkBonus = 8;
        } else if(CR==13){
            expectedAtkBonus = 8;
        } else if(CR==14){
            expectedAtkBonus = 8;
        } else if(CR==15){
            expectedAtkBonus = 8;
        } else if(CR==16){
            expectedAtkBonus = 9;
        } else if(CR==17){
            expectedAtkBonus = 10;
        } else if(CR==18){
            expectedAtkBonus = 10;
        } else if(CR==19){
            expectedAtkBonus = 10;
        } else if(CR==20){
            expectedAtkBonus = 10;
        } else if(CR==21){
            expectedAtkBonus = 11;
        } else if(CR==22){
            expectedAtkBonus = 11;
        } else if(CR==23){
            expectedAtkBonus = 11;
        } else if(CR==24){
            expectedAtkBonus = 12;
        } else if(CR==25){
            expectedAtkBonus = 12;
        } else if(CR==26){
            expectedAtkBonus = 12;
        } else if(CR==27){
            expectedAtkBonus = 13;
        } else if(CR==28){
            expectedAtkBonus = 13;
        } else if(CR==29){
            expectedAtkBonus = 13;
        } else if(CR==30){
            expectedAtkBonus = 14;
        }

        return expectedAtkBonus;
    }

    //    input CR to determine expected Save DC
    public int crToExpectedSaveDC(int CR){
        int expectedSaveDC = 0;

        if(CR <= 1){
            expectedSaveDC = 13;
        } else if(CR==2){
            expectedSaveDC = 13;
        } else if(CR==3){
            expectedSaveDC = 13;
        } else if(CR==4){
            expectedSaveDC = 14;
        } else if(CR==5){
            expectedSaveDC = 15;
        } else if(CR==6){
            expectedSaveDC = 15;
        } else if(CR==7){
            expectedSaveDC = 15;
        } else if(CR==8){
            expectedSaveDC = 16;
        } else if(CR==9){
            expectedSaveDC = 16;
        } else if(CR==10){
            expectedSaveDC = 16;
        } else if(CR==11){
            expectedSaveDC = 17;
        } else if(CR==12){
            expectedSaveDC = 17;
        } else if(CR==13){
            expectedSaveDC = 18;
        } else if(CR==14){
            expectedSaveDC = 18;
        } else if(CR==15){
            expectedSaveDC = 18;
        } else if(CR==16){
            expectedSaveDC = 18;
        } else if(CR==17){
            expectedSaveDC = 19;
        } else if(CR==18){
            expectedSaveDC = 19;
        } else if(CR==19){
            expectedSaveDC = 19;
        } else if(CR==20){
            expectedSaveDC = 19;
        } else if(CR==21){
            expectedSaveDC = 20;
        } else if(CR==22){
            expectedSaveDC = 20;
        } else if(CR==23){
            expectedSaveDC = 20;
        } else if(CR==24){
            expectedSaveDC = 21;
        } else if(CR==25){
            expectedSaveDC = 21;
        } else if(CR==26){
            expectedSaveDC = 21;
        } else if(CR==27){
            expectedSaveDC = 22;
        } else if(CR==28){
            expectedSaveDC = 22;
        } else if(CR==29){
            expectedSaveDC = 22;
        } else if(CR==30){
            expectedSaveDC = 23;
        }

        return expectedSaveDC;
    }

    //    input ability to determine its ability modifier
    public int abilityToModifier(int ability){
        int modifier=0;

        switch (ability){
            case 0:
                modifier = 0;
                break;
            case 1:
                modifier = -5;
                break;
            case 2:
                modifier = -4;
                break;
            case 3:
                modifier = -4;
                break;
            case 4:
                modifier = -3;
                break;
            case 5:
                modifier = -3;
                break;
            case 6:
                modifier = -2;
                break;
            case 7:
                modifier = -2;
                break;
            case 8:
                modifier = -1;
                break;
            case 9:
                modifier = -1;
                break;
            case 10:
                modifier = 0;
                break;
            case 11:
                modifier = 0;
                break;
            case 12:
                modifier = 1;
                break;
            case 13:
                modifier = 1;
                break;
            case 14:
                modifier = 2;
                break;
            case 15:
                modifier = 2;
                break;
            case 16:
                modifier = 3;
                break;
            case 17:
                modifier = 3;
                break;
            case 18:
                modifier = 4;
                break;
            case 19:
                modifier = 4;
                break;
            case 20:
                modifier = 5;
                break;
            case 21:
                modifier = 5;
                break;
            case 22:
                modifier = 6;
                break;
            case 23:
                modifier = 6;
                break;
            case 24:
                modifier = 7;
                break;
            case 25:
                modifier = 7;
                break;
            case 26:
                modifier = 8;
                break;
            case 27:
                modifier = 8;
                break;
            case 28:
                modifier = 9;
                break;
            case 29:
                modifier = 9;
                break;
            case 30:
                modifier = 10;
                break;
        }

        return modifier;
    }

    //    input goal CR to determine HP multiplier for resistances
    public float goalCrToHpMultiplierForResistance(float CR){
        float multiplier = 1f;
        if(isBetween(CR,0,4)){
            multiplier = 2;
        } else if(isBetween(CR,5,10)){
            multiplier = 1.5f;
        } else if(isBetween(CR,11,16)){
            multiplier = 1.25f;
        }
        return multiplier;
    }
    public float goalCrToHpMultiplierForResistance(int CR){
        float multiplier = 1f;
        if(isBetween(CR,0,4)){
            multiplier = 2;
        } else if(isBetween(CR,5,10)){
            multiplier = 1.5f;
        } else if(isBetween(CR,11,16)){
            multiplier = 1.25f;
        }
        return multiplier;
    }

    //    input goal CR to determine HP multiplier for resistances
    public float goalCrToHpMultiplierForImmunities(float CR){
        float multiplier = 1.25f;
        if(isBetween(CR,0,10)){
            multiplier = 2;
        } else if(isBetween(CR,11,16)){
            multiplier = 1.5f;
        } else if(CR>=17){
            multiplier = 1.25f;
        }
        return multiplier;
    }
    public float goalCrToHpMultiplierForImmunities(int CR){
        float multiplier = 1.25f;
        if(isBetween(CR,0,10)){
            multiplier = 2;
        } else if(isBetween(CR,11,16)){
            multiplier = 1.5f;
        } else if(CR>=17){
            multiplier = 1.25f;
        }
        return multiplier;
    }

    //    input goal CR to determine HP modifier for legendary resistances
    public int goalCrToHpModifierForLegendaryResistances(float CR){
    int hpModifier = 0;
    if(isBetween(CR,0,4)){
        hpModifier = 10;
    }else if(isBetween(CR,5,10)){
        hpModifier = 20;
    }else if(isBetween(CR,11,30)){
        hpModifier = 30;
    }
    return hpModifier;
}
    public int goalCrToHpModifierForLegendaryResistances(int CR){
        int hpModifier = 0;
        if(isBetween(CR,0,4)){
            hpModifier = 10;
        }else if(isBetween(CR,5,10)){
            hpModifier = 20;
        }else if(isBetween(CR,11,30)){
            hpModifier = 30;
        }
        return hpModifier;
    }

    //    input goal CR to determine HP modifier for relentless, undead fortitude, etc
    public int goalCrToHpModifierForRelentless(float CR){
        int hpModifier = 0;
        if(CR<1){
            hpModifier = 0;
        }else if(isBetween(CR,1,4)){
            hpModifier = 7;
        }else if(isBetween(CR,5,10)){
            hpModifier = 14;
        }else if(isBetween(CR,11,16)){
            hpModifier = 21;
        }else if(isBetween(CR,17,30)){
            hpModifier = 28;
        }
        return hpModifier;
    }
    public int goalCrToHpModifierForRelentless(int CR){
        int hpModifier = 0;
        if(CR<1){
            hpModifier = 0;
        }else if(isBetween(CR,1,4)){
            hpModifier = 7;
        }else if(isBetween(CR,5,10)){
            hpModifier = 14;
        }else if(isBetween(CR,11,16)){
            hpModifier = 21;
        }else if(isBetween(CR,17,30)){
            hpModifier = 28;
        }
        return hpModifier;
    }

    //    input number of saving throws to determine AC modifier
    public int numberOfSavingThrowsToACModifier(int numberOfSaves){
        int acModifier=0;

        switch (numberOfSaves){
            case 3:
                acModifier = 2;
                break;
            case 4:
                acModifier = 2;
                break;
            case 5:
                acModifier = 4;
                break;
            case 6:
                acModifier = 4;
                break;
        }

        return acModifier;
    }

    //    determine average dice roll by die type
    public float dieToAverageRollValue(String die){
        float avgRollValue = 0;

        switch (die){
            case "1":
                avgRollValue = 1;
                break;
            case "d2":
                avgRollValue = 1.5f;
            case "d3":
                avgRollValue = 2;
            case "d4":
                avgRollValue = 2.5f;
                break;
            case "d6":
                avgRollValue = 3.5f;
                break;
            case "d8":
                avgRollValue = 4.5f;
                break;
            case "d10":
                avgRollValue = 5.5f;
                break;
            case "d12":
                avgRollValue = 6.5f;
                break;
            case "d20":
                avgRollValue = 10.5f;
                break;
            default:
                avgRollValue = 0;
        }

        return avgRollValue;
    }
    public float dieToAverageRollValue(int dieSize){
        float avgDieRoll = 0;

        avgDieRoll = (dieSize/2)+.5f;

        return avgDieRoll;
    }

    //    determine hit die for monster size
    public String hitDiceForMonsterSize(String monsterSize){
        String die = "";

        String size = monsterSize.toLowerCase();

        switch (size){
            case "tiny":
                die = "d4";
                break;
            case "small":
                die = "d6";
                break;
            case "medium":
                die = "d8";
                break;
            case "large":
                die = "d10";
                break;
            case "huge":
                die = "d12";
                break;
            case "gargantuan":
                die = "d20";
                break;
            default:
                die = "1";
        }
        return die;
    }

    //    determine die size by die type
    public int dieToDieSize(String die){
        int dieSize = 0;

        switch (die){
            case "1":
                dieSize = 1;
                break;
            case "d2":
                dieSize = 2;
                break;
            case "d3":
                dieSize = 3;
                break;
            case "d4":
                dieSize = 4;
                break;
            case "d6":
                dieSize = 6;
                break;
            case "d8":
                dieSize = 8;
                break;
            case "d10":
                dieSize = 10;
                break;
            case "d12":
                dieSize = 12;
                break;
            case "d20":
                dieSize = 20;
                break;
            case "d100":
                dieSize = 100;
                break;
        }
        return dieSize;
    }

    //    determines AC by armor and dexterity ability
    public int acForArmorTypeAndDexScore(String armorType, int DEX){
        int AC = 10;
        String armor = armorType.toString();
        int dexMod = abilityToModifier(DEX);
        switch (armor){
            case "barkskin":
                AC = 16;
                break;
            case "breastplate":
                if(dexMod>2)dexMod=2;
                AC = 14+dexMod;
                break;
            case "chain mail":
                AC = 16;
                break;
            case "chain shirt":
                if(dexMod>2)dexMod=2;
                AC = 13+dexMod;
                break;
            case "half plate":
                if(dexMod>2)dexMod=2;
                AC = 15+dexMod;
                break;
            case "hide":
                if(dexMod>2)dexMod=2;
                AC = 12+dexMod;
                break;
            case "leather":
                AC = 11+dexMod;
                break;
            case "mage armor":
                AC = 13+dexMod;
                break;
            case "plate":
                AC = 18;
                break;
            case "ring mail":
                AC = 14;
                break;
            case "scale mail":
                if(dexMod>2)dexMod=2;
                AC = 14+dexMod;
                break;
            case "splint":
                AC = 17;
                break;
            case "studded leather":
                if(dexMod>2)dexMod=2;
                AC = 12+dexMod;
                break;
            case "unarmored":
                AC = 10 + dexMod;
                break;
            default:
                AC = 10 + dexMod;
        }

        return AC;
    }

    //    determine the XP by CR
    public int xpForCR(float CR){
        int XP = 10;

        if(CR == .125){
            XP = 25;
        }else if (CR == .25){
            XP = 50;
        }else if (CR == .5){
            XP = 100;
        }else if (CR == 1){
            XP = 200;
        }else if (CR == 2){
            XP = 450;
        }else if (CR == 3){
            XP = 700;
        }else if (CR == 4){
            XP = 1100;
        }else if (CR == 5){
            XP = 1800;
        }else if (CR == 6){
            XP = 2300;
        }else if (CR == 7){
            XP = 2900;
        }else if (CR == 8){
            XP = 3900;
        }else if (CR == 9){
            XP = 5000;
        }else if (CR == 10){
            XP = 5900;
        }else if (CR == 11){
            XP = 7200;
        }else if (CR == 12){
            XP = 8400;
        }else if (CR == 13){
            XP = 10000;
        }else if (CR == 14){
            XP = 11500;
        }else if (CR == 15){
            XP = 13000;
        }else if (CR == 16){
            XP = 15000;
        }else if (CR == 17){
            XP = 18000;
        }else if (CR == 18){
            XP = 20000;
        }else if (CR == 19){
            XP = 22000;
        }else if (CR == 20){
            XP = 25000;
        }else if (CR == 21){
            XP = 33000;
        }else if (CR == 22){
            XP = 41000;
        }else if (CR == 23){
            XP = 50000;
        }else if (CR == 24){
            XP = 62000;
        }else if (CR == 25){
            XP = 75000;
        }else if (CR == 26){
            XP = 90000;
        }else if (CR == 27){
            XP = 105000;
        }else if (CR == 28){
            XP = 120000;
        }else if (CR == 29){
            XP = 135000;
        }else if (CR == 30){
            XP = 155000;
        }

        return XP;
    }
    public int xpForCR(int CR){
        int XP = 10;

        switch (CR){
            case 1:
                XP = 200;
                break;
            case 2:
                XP = 450;
                break;
            case 3:
                XP = 700;
                break;
            case 4:
                XP = 1100;
                break;
            case 5:
                XP = 1800;
                break;
            case 6:
                XP = 2300;
                break;
            case 7:
                XP = 2900;
                break;
            case 8:
                XP = 3900;
                break;
            case 9:
                XP = 5000;
                break;
            case 10:
                XP = 5900;
                break;
            case 11:
                XP = 7200;
                break;
            case 12:
                XP = 8400;
                break;
            case 13:
                XP = 10000;
                break;
            case 14:
                XP = 11500;
                break;
            case 15:
                XP = 13000;
                break;
            case 16:
                XP = 15000;
                break;
            case 17:
                XP = 18000;
                break;
            case 18:
                XP = 20000;
                break;
            case 19:
                XP = 22000;
                break;
            case 20:
                XP = 25000;
                break;
            case 21:
                XP = 33000;
                break;
            case 22:
                XP = 41000;
                break;
            case 23:
                XP = 50000;
                break;
            case 24:
                XP = 62000;
                break;
            case 25:
                XP = 75000;
                break;
            case 26:
                XP = 90000;
                break;
            case 27:
                XP = 105000;
                break;
            case 28:
                XP = 120000;
                break;
            case 29:
                XP = 135000;
                break;
            case 30:
                XP = 155000;
                break;
        }
        return XP;
    }

    /*
    returns true if first entered value is equal to or between second and third entered number
    */
    public boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }
    public boolean isBetween(float x, float lower, float upper) {
        return lower <= x && x <= upper;
    }

}
