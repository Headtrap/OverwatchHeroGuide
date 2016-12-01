package com.apps.headtrap.overwatchheroguide.domain;

import com.orm.SugarRecord;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Gustavo on 11/24/2016.
 */

public class Hero extends SugarRecord implements Serializable
{
    private String heroPicture;
    private String heroName;
    private String heroRole;
    private List<Ability> heroAbilities;

    public String getHeroPicture()
    {
        return heroPicture;
    }

    public void setHeroPicture(String heroPicture)
    {
        this.heroPicture = heroPicture;
    }

    public String getHeroName()
    {
        return heroName;
    }

    public void setHeroName(String heroName)
    {
        this.heroName = heroName;
    }

    public String getHeroRole()
    {
        return heroRole;
    }

    public void setHeroRole(String heroRole)
    {
        this.heroRole = heroRole;
    }

    public List<Ability> getHeroAbilities() {
        return heroAbilities;
    }

    public void setHeroAbilities(List<Ability> heroAbilities) {
        this.heroAbilities = heroAbilities;
    }
}
