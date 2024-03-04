package com.example.applicationhotel.repository;

import com.example.applicationhotel.model.BookedRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<BookedRoom , Long> {
    List<BookedRoom> findByRoomId(Long roomId);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);
}
