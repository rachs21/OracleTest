package com.newtours.framework.common;
/**
 * Enum gives details of all the system constants used in different classes
 * @author Rachna.Chawla
 *
 */
public enum UISystemConstant {
    
    USER_DIR("user.dir"),
    LOGIN_PAGE_TITLE("Find a Flight: Mercury Tours:"),
    CONFIRMATION("Your itinerary has been booked!"),
    BOOKING_CONFIRMATION_PAGE_TITLE("Flight Confirmation: Mercury Tours");
    
    private String value;
    
    private UISystemConstant(String value){
        this.value = value;
    }
    
    public String getValue(){
        return value != null ? value.trim():value;
    }

}
