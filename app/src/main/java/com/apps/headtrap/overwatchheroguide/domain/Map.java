package com.apps.headtrap.overwatchheroguide.domain;


import java.io.Serializable;

/**
 * Created by Gustavo on 11/24/2016.
 */

public class Map implements Serializable
{
    private String mapName;
    private String mapPicture;

    public String getMapName()
    {
        return mapName;
    }

    public void setMapName(String mapName)
    {
        this.mapName = mapName;
    }

    public String getMapPicture()
    {
        return mapPicture;
    }

    public void setMapPicture(String mapPicture)
    {
        this.mapPicture = mapPicture;
    }
}
