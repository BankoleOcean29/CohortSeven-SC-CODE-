package com;

public class Television {
    private boolean on;
    private int volume;


    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return 0;
    }

    public void increaseVolume() {
        volume++;
    }
}
