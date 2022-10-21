package Abstraction;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume();
    int getChannel();
    void setChannel();
    void printStatus();
}
