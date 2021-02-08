package com.mclebtec.java.pattern.creational.builder.house;

import com.mclebtec.java.pattern.creational.builder.house.vo.BedRoomOne;
import com.mclebtec.java.pattern.creational.builder.house.vo.BedRoomTwo;
import com.mclebtec.java.pattern.creational.builder.house.vo.LivingRoom;

public class TwoBedroomHouseBuilder extends HouseBuilder {
    @Override
    public void addRooms() {
        getHouse().rooms.add(new BedRoomOne());
        getHouse().rooms.add(new BedRoomOne());
        getHouse().rooms.add(new BedRoomTwo());
        getHouse().rooms.add(new LivingRoom());
    }
}
