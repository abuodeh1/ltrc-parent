package com.etech.ltrc.permits.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveCharacteristicDataRequest {

    @ApiModelProperty("Characteristic ID Parameter ") private long characteristicidparm ;
    @ApiModelProperty("Characteristic Arabic Name Parameter ") private String characteristicarabicnameparm ;
    @ApiModelProperty("Characteristic English Name Parameter ") private String characteristicenglishnameparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;

    public long getCharacteristicidparm() {
        return characteristicidparm;
    }

    public void setCharacteristicidparm(long characteristicidparm) {
        this.characteristicidparm = characteristicidparm;
    }

    public String getCharacteristicarabicnameparm() {
        return characteristicarabicnameparm;
    }

    public void setCharacteristicarabicnameparm(String characteristicarabicnameparm) {
        this.characteristicarabicnameparm = characteristicarabicnameparm;
    }

    public String getCharacteristicenglishnameparm() {
        return characteristicenglishnameparm;
    }

    public void setCharacteristicenglishnameparm(String characteristicenglishnameparm) {
        this.characteristicenglishnameparm = characteristicenglishnameparm;
    }

    public long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(long princepel) {
        this.princepel = princepel;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }
}



