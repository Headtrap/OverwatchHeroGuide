package com.apps.headtrap.overwatchheroguide.domain;

import java.io.Serializable;

/**
 * Created by Gustavo on 11/30/2016.
 */

public class Ability implements Serializable{
    private String abilityName;
    private String abilityIcon;
    private String abilityDescription;

    public String getAbilityName() {
        return abilityName;
    }

    public void setAbilityName(String abilityName) {
        this.abilityName = abilityName;
    }

    public String getAbilityIcon() {
        return abilityIcon;
    }

    public void setAbilityIcon(String abilityIcon) {
        this.abilityIcon = abilityIcon;
    }

    public String getAbilityDescription() {
        return abilityDescription;
    }

    public void setAbilityDescription(String abilityDescription) {
        this.abilityDescription = abilityDescription;
    }
}
