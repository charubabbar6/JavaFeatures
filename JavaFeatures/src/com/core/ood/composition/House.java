package com.core.ood.composition;

import java.util.ArrayList;
import java.util.List;

public class House {
	private List<Room> rooms = new ArrayList<>();

    // Method to add a room
    public void addRoom(Room room) {
        rooms.add(room);
    }
}
