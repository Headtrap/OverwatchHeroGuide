package com.apps.headtrap.overwatchheroguide.domain;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by Gustavo on 11/24/2016.
 */

public class Hero extends SugarRecord implements Serializable
{
    private String heroPicture;
    private String heroName;
    private String heroRole;

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
}
