package seedu.address.model.service.appointment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The appointment class containing a meeting with a customer at a particular date.
 */
public class Appointment {
    private final int id;
    private final int customerId;
    private final LocalDateTime timeDate;

    private final Set<Integer> staffIds = new HashSet<>();

    /**
     * This method is the constructor for Appointment.
     * @param customerId The customer id to meet.
     * @param timeDate The date time which this appointment occurs.
     */
    public Appointment(int id, int customerId, LocalDateTime timeDate) {
        this(id, customerId, timeDate, new HashSet<>());
    }

    /**
     * This method is the constructor for Appointment.
     * @param customerId The customer id to meet.
     * @param timeDate The date time which this appointment occurs.
     * @param staffIds The list of staff ids involved in the appointment.
     */
    public Appointment(int id, int customerId, LocalDateTime timeDate, Set<Integer> staffIds) {
        this.id = id;
        this.customerId = customerId;
        this.timeDate = timeDate;
        this.staffIds.addAll(staffIds);
    }

    /**
     * @return ID of appointment
     */
    public int getId() {
        return this.id;
    }

    /**
     * This method returns the customer id who we are meeting.
     * @return The customer id.
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * This method returns the time which we are meeting this customer.
     *
     * @return the date time of this appointment.
     */
    public LocalDateTime getTimeDate() {
        return timeDate;
    }

    /**
     * This method returns the list of staff members who will be meeting this customer.
     *
     * @return a list of staff members.
     */
    public List<Integer> getStaffIds() {
        return new ArrayList<>(this.staffIds);
    }

    /**
     * Returns true if both staffs have the same id.
     */
    public boolean isSameAppointment(Appointment otherAppointment) {
        if (otherAppointment == this) {
            return true;
        }

        return otherAppointment != null
                && otherAppointment.getId() == getId();
    }
}
