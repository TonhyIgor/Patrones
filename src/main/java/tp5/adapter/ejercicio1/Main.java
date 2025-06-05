package tp5.adapter.ejercicio1;

public class Main {
    public static void main(String[] args) {
        var motorComun = new MotorComun();
        var motorEconomico = new MotorEconomico();
        var motorElectrico = new MotorElectrico();

        var auto = new Auto(motorComun);
        var autoEconomico = new Auto(motorEconomico);
        var autoElectrico = new Auto(new AdaptarMotorElectrico(motorElectrico));

        System.out.println(auto.elMotorSeAcelero());
        System.out.println(autoEconomico.elMotorSeAcelero());
        System.out.println(autoElectrico.elMotorSeAcelero());
    }
}
