package com.apps.headtrap.overwatchheroguide.utils;

import com.apps.headtrap.overwatchheroguide.domain.Ability;
import com.apps.headtrap.overwatchheroguide.domain.Hero;
import com.apps.headtrap.overwatchheroguide.domain.Map;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gustavo on 11/25/2016.
 */

public class HeroManager {
    public static List<Hero> heroes = new ArrayList<>();


    public static List<Ability> createAbilities(String abilityName1,
                                                String abilityDesc1,
                                                String abilityIcon1,

                                                String abilityName2,
                                                String abilityDesc2,
                                                String abilityIcon2,

                                                String abilityName3,
                                                String abilityDesc3,
                                                String abilityIcon3,

                                                String abilityName4,
                                                String abilityDesc4,
                                                String abilityIcon4
    ) {
        List<Ability> abilities = new ArrayList<>();
        Ability a1 = new Ability();
        a1.setAbilityName(abilityName1);
        a1.setAbilityDescription(abilityDesc1);
        a1.setAbilityIcon(abilityIcon1);
        abilities.add(a1);

        Ability a2 = new Ability();
        a2.setAbilityName(abilityName2);
        a2.setAbilityDescription(abilityDesc2);
        a2.setAbilityIcon(abilityIcon2);
        abilities.add(a2);

        Ability a3 = new Ability();
        a3.setAbilityName(abilityName3);
        a3.setAbilityDescription(abilityDesc3);
        a3.setAbilityIcon(abilityIcon3);
        abilities.add(a3);

        Ability a4 = new Ability();
        a4.setAbilityName(abilityName4);
        a4.setAbilityDescription(abilityDesc4);
        a4.setAbilityIcon(abilityIcon4);
        abilities.add(a4);

        return abilities;
    }

    public static List<Hero> getHeroes() {
        Hero h1 = new Hero();
        h1.setHeroName("Genji");
        h1.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/genji-gameplay.jpg");
        h1.setHeroAbilities(createAbilities(
                "Shuriken",
                "Throw 3 shurikens in quick sucession, or alternate fire to throw 3 at the same time in a fan in front of you",
                "http://imgur.com/2164FH2",

                "Swift strike",
                "Dashes forward damaging all heroes on your path, if an enemy hero dies, the cooldown resets",
                "http://imgur.com/N9xI0wx",

                "Deflect",
                "Delects any projectile coming from the direction you are facing for a small period of time",
                "http://imgur.com/JZsbdic",

                "Dragonblade",
                "Genji unsheats his sword and is able to perform a strong melee attack, that hits all heroes that are close in front of you",
                "http://imgur.com/DKHe2TI"));

        heroes.add(h1);

//--------------------------------------------------------------------------------------------------
        Hero h2 = new Hero();
        h2.setHeroName("Mei");
        h2.setHeroPicture("http://i.imgur.com/qfSamoj.jpg");
        h2.setHeroAbilities(createAbilities(
                "Endothermic blaster",
                "Main weapon",
                "http://i.imgur.com/dfJ1eSh.png",

                "Cryo-freeze",
                "Invulnerable",
                "http://i.imgur.com/UQqaQT2.png",

                "Ice wall",
                "Wall",
                "http://i.imgur.com/OUmZ9WD.png",

                "Blizzard",
                "Freezes",
                "http://i.imgur.com/Uu2RXvb.png"));

        heroes.add(h2);

//--------------------------------------------------------------------------------------------------
        Hero h19 = new Hero();
        h19.setHeroName("Lucio");
        h19.setHeroPicture("http://i.imgur.com/S75163V.jpg");
        h19.setHeroAbilities(createAbilities(
                "Sonic amplifier",
                "Emits a strong sound wave, which alternates between long range projectiles and a close range burst that pushes enemies away",
                "http://imgur.com/JI4EFfa",
                "Crossfade",
                "Lucio contatly plays two songs, one heals nearby allies while the other grants them movement speed, use Crossfade to alternate between the two modes",
                "http://imgur.com/1gCL5lv",
                "Amp it up",
                "Enhances one the effects of Lucios current song",
                "http://imgur.com/411yGoJ",
                "Sound barrier (Bro shield",
                "Grants a big shield to al nearby allies during a short period of time",
                "http://imgur.com/KG6HZ87"));

        heroes.add(h19);

        return heroes;

    }
//
//    public static List<Hero> getHeroes() {
//        List<Hero> heroes = new ArrayList<>();
//
//        Hero h1 = new Hero();
//        h1.setHeroName("Genji");
//        h1.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/genji-gameplay.jpg");
//        heroes.add(h1);
//
//
//        Hero h2 = new Hero();
//        h2.setHeroName("Mei");
//        h2.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/mei-gameplay.jpg");
//        heroes.add(h2);
//
//        Hero h3 = new Hero();
//        h3.setHeroName("Tracer");
//        h3.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/tracer-gameplay.jpg");
//        heroes.add(h3);
//
//        Hero h4 = new Hero();
//        h4.setHeroName("Reinhardt");
//        h4.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/reinhardt-gameplay.jpg");
//        heroes.add(h4);
//
//        Hero h5 = new Hero();
//        h5.setHeroName("Roadhog");
//        h5.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/roadhog-gameplay.jpg");
//        heroes.add(h5);
//
//        Hero h6 = new Hero();
//        h6.setHeroName("Mercy");
//        h6.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/mercy-gameplay.jpg");
//        heroes.add(h6);
//
//        Hero h7 = new Hero();
//        h7.setHeroName("Symmetra");
//        h7.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/symmetra-gameplay.jpg");
//        heroes.add(h7);
//
//        Hero h8 = new Hero();
//        h8.setHeroName("Zenyatta");
//        h8.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/zenyatta-gameplay.jpg");
//        heroes.add(h8);
//
//        Hero h9 = new Hero();
//        h9.setHeroName("Zarya");
//        h9.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/zarya-gameplay.jpg");
//        heroes.add(h9);
//
//        Hero h10 = new Hero();
//        h10.setHeroName("Mc. Cree");
//        h10.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/mccree-gameplay.jpg");
//        heroes.add(h10);
//
//        Hero h11 = new Hero();
//        h11.setHeroName("D.VA");
//        h11.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/dva-gameplay.jpg");
//        heroes.add(h11);
//
//        Hero h12 = new Hero();
//        h12.setHeroName("Reaper");
//        h12.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/reaper-gameplay.jpg");
//        heroes.add(h12);
//
//        Hero h13 = new Hero();
//        h13.setHeroName("Pharah");
//        h13.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/pharah-gameplay.jpg");
//        heroes.add(h13);
//
//        Hero h14 = new Hero();
//        h14.setHeroName("Hanzo");
//        h14.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/hanzo-gameplay.jpg");
//        heroes.add(h14);
//
//        Hero h15 = new Hero();
//        h15.setHeroName("Winston");
//        h15.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/winston-gameplay.jpg");
//        heroes.add(h15);
//
//        Hero h16 = new Hero();
//        h16.setHeroName("Bastion");
//        h16.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/bastion-gameplay.jpg");
//        heroes.add(h16);
//
//        Hero h17 = new Hero();
//        h17.setHeroName("Torbjörn");
//        h17.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/torbjorn-gameplay.jpg");
//        heroes.add(h17);
//
//        Hero h18 = new Hero();
//        h18.setHeroName("Widowmaker");
//        h18.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/widowmaker-gameplay.jpg");
//        heroes.add(h18);
//
//        Hero h19 = new Hero();
//        h19.setHeroName("Lucio");
//        h19.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/lucio-gameplay.jpg");
//        heroes.add(h19);
//
//        Hero junkrat = new Hero();
//        junkrat.setHeroName("Junkrat");
//        junkrat.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/junkrat-gameplay.jpg");
//        heroes.add(junkrat);
//
//        Hero h20 = new Hero();
//        h20.setHeroName("Ana");
//        h20.setHeroPicture("http://cdn.mos.cms.futurecdn.net/ismDiAtpUUckNtxFiPviiS-650-80.jpg");
//        heroes.add(h20);
//
//        Hero h21 = new Hero();
//        h21.setHeroName("Sombra");
//        h21.setHeroPicture("https://www.rockpapershotgun.com/images/16/nov/sombra.jpg");
//        heroes.add(h21);
//
//
//        Hero h22 = new Hero();
//        h22.setHeroName("Soldier 76");
//        h22.setHeroPicture("https://blzgdapipro-a.akamaihd.net/media/thumbnail/soldier-76-gameplay.jpg");
//        heroes.add(h22);
//
//
//        return heroes;
//    }

    public static List<Map> getMaps() {
        List<Map> maps = new ArrayList<>();
        Map m1 = new Map();
        m1.setMapName("Volskaya Industries");
        m1.setMapPicture("http://cdn.mos.cms.futurecdn.net/RFmoYGtPcfUmyd4aK3yfeK-650-80.jpg");
        maps.add(m1);

        Map m2 = new Map();
        m2.setMapName("Temple of Anubis");
        m2.setMapPicture("http://cdn.mos.cms.futurecdn.net/QmgmSXRZ4SmoWA7yi7ekWm-650-80.jpg");
        maps.add(m2);

        Map m3 = new Map();
        m3.setMapName("Lijiang Tower");
        m3.setMapPicture("https://cdn.pastemagazine.com/www/system/images/photo_albums/overwatch-maps/large/lijiang-tower.jpg?1384968217");
        maps.add(m3);

        Map m4 = new Map();
        m4.setMapName("Eichenwalde");
        m4.setMapPicture("http://cdn.blizzardwatch.com/wp-content/uploads/2016/08/New_OW_map_Eichenwalde_header.jpg");
        maps.add(m4);

        Map m5 = new Map();
        m5.setMapName("Dorado");
        m5.setMapPicture("http://cdn.mos.cms.futurecdn.net/Fg2NrT2SwbFZwZchk2aNCU-650-80.jpg");
        maps.add(m5);

        Map m6 = new Map();
        m6.setMapName("Route 66");
        m6.setMapPicture("http://cdn.mos.cms.futurecdn.net/kXpPe8YkSgttPDWcsteWim-650-80.jpg");
        maps.add(m6);

        Map m7 = new Map();
        m7.setMapName("Numbani");
        m7.setMapPicture("http://www.pcgamesn.com/sites/default/files/overwatch%20feature%20header.jpg");
        maps.add(m7);

        Map m8 = new Map();
        m8.setMapName("Hanamura");
        m8.setMapPicture("http://s3wc2.goplay.com/wysiwyg/2016/06/23/Hanamura-overwatch-map-guide.jpg");
        maps.add(m8);

        Map m9 = new Map();
        m9.setMapName("Ilios");
        m9.setMapPicture("http://65.media.tumblr.com/774035a5bc81fa67aa505154c88e111d/tumblr_o3uiaiSg7Q1v7htako1_1280.jpg");
        maps.add(m9);

        Map m10 = new Map();
        m10.setMapName("Nepal");
        m10.setMapPicture("http://www.gameinformer.com/cfs-filesystemfile.ashx/__key/CommunityServer-Components-ImageFileViewer/CommunityServer-Components-SiteFiles-imagefeed-featured-blizzard-overwatch-gamer_2D00_culture/nepal_5F00_overwatch_5F00_610.jpg_2D00_610x0.jpg");
        maps.add(m10);


        return maps;
    }

}
