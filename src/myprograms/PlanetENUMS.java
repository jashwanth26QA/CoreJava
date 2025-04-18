package myprograms;

import javax.sound.midi.Soundbank;
import java.net.SocketOption;
import java.sql.SQLOutput;

public class PlanetENUMS {

    public static void main(String[] args) {
        PLANET pl=PLANET.NEPTUNE;
        switch(pl){
            case MERCURY:
                System.out.println("This is first planet");
                break;
            case VENUS:
                System.out.println("This second hottest planet");
                break;
            case EARTH:
                System.out.println("This is thrid planet");
                break;
            case MARS:
                System.out.println("This is fourth planet");
                break;
            case JUPITER:
                System.out.println("This is fifth planet");
                break;
            case SATURN:
                System.out.println("This is sixth planet");
                break;
            case URANUS:
                System.out.println("This is seventh planet");
                break;
            case NEPTUNE:
                System.out.println("This is eigth planet");
                break;
            case PLUTO:
                System.out.println("This is nineth planet");
                break;
        }
    }

}
