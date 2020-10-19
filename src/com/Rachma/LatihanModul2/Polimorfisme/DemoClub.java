package com.Rachma.LatihanModul2.Polimorfisme;

public class DemoClub {
    public static void main(String[] args) {
        Club club1 = new Club();
        Club club2 = new Club("TIMNAS Indonesia");
        Club club3 = new Club("TIMNAS Indonesia", "TIMNAS Indonesia adalah tim yang mewakili Indonesia di sepak bola internasional");
        Club club4 = new Club("TIMNAS Indonesia", 1930, "GBK");
        Club club5 = new Club("TIMNAS Indonesia", 1930, "GBK", 7, "TIMNAS Indonesia adalah tim yang mewakili Indonesia di sepak bola internasional");

        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
