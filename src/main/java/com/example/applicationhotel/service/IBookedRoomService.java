package com.example.applicationhotel.service;

import com.example.applicationhotel.model.BookedRoom;

import java.util.List;

public interface IBookedRoomService {
    List<BookedRoom> getAllBookingsByRoomId(Long roomId);
    public List<BookedRoom> getAllBookings();

    void cancelBooking(Long bookingId);

    String saveBooking(Long roomId, BookedRoom bookingRequest);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);
}
