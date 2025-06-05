package tp5.adapter.ejercicio1;

public class Auto {
    private Motor motor;

    public Auto(Motor motor) {
        this.motor = motor;
    }

    public String elMotorSeArranco() {
        return motor.arrancar();
    }

    public String elMotorSeAcelero() {
        return motor.acelerar();
    }

    public String elMotorSeDetuvo() {
        return motor.apagar();
    }
}
