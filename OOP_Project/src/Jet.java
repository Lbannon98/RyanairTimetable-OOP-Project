/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x16399856
 */

//LAUREN
public class Jet extends Flight {
    private int noOfBeds;
    private boolean inFlightEnt;
    private double costStd; //2 free drinks
    private double costPrem; //Open Bar with complementary meal
    
    Jet(){
        super();
        noOfBeds=0;
        inFlightEnt=true;
        costStd=0.0;
        costPrem=0.0;
    }

    public Jet(int noOfBeds, boolean inFlightEnt, double costStd, double costPrem, String destination, String flightId, String airline, int noOfSeats) {
        super(destination, flightId, airline, noOfSeats);
        this.noOfBeds = noOfBeds;
        this.inFlightEnt = inFlightEnt;
        this.costStd = costStd;
        this.costPrem = costPrem;
    }

    public int getNoOfBeds() {
        return noOfBeds;
    }

    public void setNoOfBeds(int noOfBeds) {
        this.noOfBeds = noOfBeds;
    }

    public boolean getInFlightEnt() {
        return inFlightEnt;
    }

    public void setInFlightEnt(boolean inFlightEnt) {
        this.inFlightEnt = inFlightEnt;
    }

    public double getCostStd() {
        return costStd;
    }

    public void setCostStd(double costStd) {
        this.costStd = costStd;
    }

    public double getCostPrem() {
        return costPrem;
    }

    public void setCostPrem(double costPrem) {
        this.costPrem = costPrem;
    }
    
    
    
    
    
}
