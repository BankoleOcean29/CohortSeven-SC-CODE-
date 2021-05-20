package com;

public class Television {
    private boolean on;
    private int volume;
    private int channel;


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
        return channel;
    }

    public void increaseVolume() {
        volume++;
    }


    public void decreaseVolume() { volume--;
    }


    public void increaseChannel() { channel++;
    }
}
