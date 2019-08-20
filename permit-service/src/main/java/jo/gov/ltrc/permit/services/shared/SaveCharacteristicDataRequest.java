package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveCharacteristicDataRequest {

    @ApiModelProperty("Characteristic ID Parameter ") private Long characteristicidparm ;
    @ApiModelProperty("Characteristic Arabic Name Parameter ") private String characteristicarabicnameparm ;
    @ApiModelProperty("Characteristic English Name Parameter ") private String characteristicenglishnameparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;

    public Long getCharacteristicidparm() {
        return characteristicidparm;
    }

    public void setCharacteristicidparm(Long characteristicidparm) {
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

    public Long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(Long princepel) {
        this.princepel = princepel;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    @Override
    public String toString() {
        return "SaveCharacteristicDataRequest{" +
                "characteristicidparm=" + characteristicidparm +
                ", characteristicarabicnameparm=" + characteristicarabicnameparm +
                ", characteristicenglishnameparm=" + characteristicenglishnameparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                '}';
    }
}



