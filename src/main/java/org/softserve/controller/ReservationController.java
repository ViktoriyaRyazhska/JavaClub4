package org.softserve.controller;


import org.softserve.service.BookService;
import org.softserve.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Reservation")
public class ReservationController {
    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
    @GetMapping("/create/Reservation/{Reservation_id}")
    public String create(@PathVariable("Reservation_id") int reservationId, Model model) {
        model.addAttribute("reservation", reservationService.readById(reservationId));
        return "create-reservation";
    }
    @GetMapping("/{task_id}/update/todos/{todo_id}")
    public String update(@PathVariable("task_id") long taskId, @PathVariable("todo_id") long todoId, Model model) {

        return "update-reservation";
    }

}
