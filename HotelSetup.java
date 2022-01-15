package com.brigelabz.workshop3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class HotelSetup {

    ArrayList<Hotel> myHotelList = new ArrayList();

    public void addHotel() {

        Hotel LakeWood = new Hotel("LakeWood", 110, 80, 90, 80, 3);

        Hotel BridgeWood = new Hotel("BridgeWood", 150, 110, 50, 50, 4);

        Hotel RidgeWood = new Hotel("RidgeWood", 220, 100, 150, 40, 5);

        myHotelList.add(LakeWood);

        myHotelList.add(BridgeWood);

        myHotelList.add(RidgeWood);

    }

    public void showHotelInfo() {

        for (int i = 0; i < myHotelList.size(); i++) {

            System.out.println(myHotelList.get(i));

        }
    }


    public void findCheapestHotelOne(String startDateRange, String endDateRange) {

        LocalDate startDate = LocalDate.parse(startDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));

        LocalDate endDate = LocalDate.parse(endDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));

        int numberOfDays = endDate.getDayOfMonth() - startDate.getDayOfMonth() + 1;

        Optional<Hotel> cheapestHotel = this.myHotelList.stream().sorted(Comparator.comparing(Hotel::getWeekdayRegularRate)).findFirst();

        Hotel hotel = new Hotel();

        hotel.setHotelName(cheapestHotel.get().getHotelName());

        hotel.setTotal(cheapestHotel.get().getWeekdayRegularRate() * numberOfDays);

        System.out.println("-HotelName :" + hotel.getHotelName());

        System.out.println("-NumberOfDaysStayed * WeekdayRegularRate :" + hotel.getTotal() + "$");

    }
    public void findCheapestHotelTwo(String startDateRange, String endDateRange) {

        LocalDate startDate = LocalDate.parse(startDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));

        LocalDate endDate = LocalDate.parse(endDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));

        int numberOfDays = endDate.getDayOfMonth() - startDate.getDayOfMonth() + 1;

        Optional<Hotel> cheapestHotel = this.myHotelList.stream().sorted(Comparator.comparing(Hotel::getWeekendRegularRate)).findFirst();

        Hotel hotel = new Hotel();

        hotel.setHotelName(cheapestHotel.get().getHotelName());

        hotel.setTotal(cheapestHotel.get().getWeekendRegularRate() * numberOfDays);

        System.out.println("-HotelName :" + hotel.getHotelName());

        System.out.println("-NumberOfDaysStayed * WeekendRegularRate :" + hotel.getTotal() + "$");

    }

    public void findCheapestHotelRatingForRegular(String startDateRange, String endDateRange) {

        LocalDate startDate = LocalDate.parse(startDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));

        LocalDate endDate = LocalDate.parse(endDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));

        int numberOfDays = endDate.getDayOfMonth() - startDate.getDayOfMonth() + 1;

        Optional<Hotel> cheapestHotel = this.myHotelList.stream().sorted(Comparator.comparing(Hotel::getWeekendRegularRate)).findFirst();

        Hotel hotel = new Hotel();

        hotel.setHotelName(cheapestHotel.get().getHotelName());

        hotel.setTotal(cheapestHotel.get().getWeekendRegularRate() * numberOfDays);

        hotel.setRating(cheapestHotel.get().getRating());

        System.out.println("-HotelName :" + hotel.getHotelName());

        System.out.println("-NumberOfDaysStayed * WeekendRegularRate :" + hotel.getTotal() + "$");

        System.out.println("-Rating :" + hotel.getRating());

    }

    public void findCheapestHotelRatingForReward(String startDateRange, String endDateRange) {

        LocalDate startDate = LocalDate.parse(startDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));

        LocalDate endDate = LocalDate.parse(endDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));

        int numberOfDays = endDate.getDayOfMonth() - startDate.getDayOfMonth() + 1;

        Optional<Hotel> cheapestHotel = this.myHotelList.stream().sorted(Comparator.comparing(Hotel::getWeekendRewardRate)).findFirst();

        Hotel hotel = new Hotel();

        hotel.setHotelName(cheapestHotel.get().getHotelName());

        hotel.setTotal(cheapestHotel.get().getWeekendRewardRate() * numberOfDays);

        hotel.setRating(cheapestHotel.get().getRating());

        System.out.println("-HotelName :" + hotel.getHotelName());

        System.out.println("-NumberOfDaysStayed * WeekendRewardRate :" + hotel.getTotal() + "$");

        System.out.println("-Raiting :" + hotel.getRating());

    }

    public void findCheapestHotelRatingForRewardTwo(String startDateRange, String endDateRange) {

        LocalDate startDate = LocalDate.parse(startDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));

        LocalDate endDate = LocalDate.parse(endDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));

        int numberOfDays = endDate.getDayOfMonth() - startDate.getDayOfMonth() + 1;

        Optional<Hotel> cheapestHotel = this.myHotelList.stream().sorted(Comparator.comparing(Hotel::getWeekdayRewardRate)).findFirst();  //Stream function on arrylist ie-myHotelList and storing in cheapestHotel

        Hotel hotel = new Hotel();

        hotel.setHotelName(cheapestHotel.get().getHotelName());

        hotel.setTotal(cheapestHotel.get().getWeekdayRewardRate() * numberOfDays);

        hotel.setRating(cheapestHotel.get().getRating());

        System.out.println("-HotelName :" + hotel.getHotelName());

        System.out.println("-NumberOfDaysStayed * WeekdayRewardRate :" + hotel.getTotal() + "$");

        System.out.println("-Rating :" + hotel.getRating());

    }

}

