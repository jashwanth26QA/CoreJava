package myprograms;

public enum PLANET {
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);

    final int planetNum;
    PLANET(int y){
        this.planetNum=y;
    }
}
