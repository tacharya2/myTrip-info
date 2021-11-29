package com.findMyTrip.myTrip;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "my_trips")
public class RecordLocator implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String confirmationCode;
    private String firstName;
    private String lastName;

    /**
     * This method returns confirmationCode as String.
     * @return String
     */
    public String getConfirmationCode() {
        return confirmationCode;
    }

    /**
     * This method returns firstName as String.
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method returns lastName as String.
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method sets confirmationCode from the given String value.
     * @param String
     */
    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode;
    }

    /**
     * This method sets firstName from the given String value.
     * @param String
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method sets lastName from the given String value.
     * @param String
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    // No argument constructor
    public RecordLocator() {
    }

    // All argument constructor
    public RecordLocator(String confirmationCode, String firstName, String lastName) {
        this.confirmationCode = confirmationCode;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // toString

    @Override
    public String toString() {
        return "RecordLocator{" +
                "confirmationCode='" + confirmationCode + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}