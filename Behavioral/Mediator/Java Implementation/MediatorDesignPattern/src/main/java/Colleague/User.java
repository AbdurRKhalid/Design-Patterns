package Colleague;

import Mediator.IChatRoom;

public abstract class User {
    private IChatRoom mediator;

    private String id;
    private String name;

    public User(IChatRoom room, String id, String name){
        this.mediator = room;
        this.name = name;
        this.id = id;
    }

    public abstract void send(String msg, String userId);
    public abstract void receive(String msg);

    public IChatRoom getMediator() {
        return mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
