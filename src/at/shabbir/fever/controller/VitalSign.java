package at.shabbir.fever.controller;

public class VitalSign {

    private double temp, pulse, respiratoryRate, bp, oxygen, diabetics;

    public VitalSign(){}

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getPulse() {
        return pulse;
    }

    public void setPulse(double pulse) {
        this.pulse = pulse;
    }

    public double getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public double getBp() {
        return bp;
    }

    public void setBp(double bp) {
        this.bp = bp;
    }

    public double getOxygen() {
        return oxygen;
    }

    public void setOxygen(double oxygen) {
        this.oxygen = oxygen;
    }

    public double getDiabetics() {
        return diabetics;
    }

    public void setDiabetics(double diabetics) {
        this.diabetics = diabetics;
    }
}
