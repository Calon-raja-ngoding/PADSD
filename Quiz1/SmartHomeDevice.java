package Quiz1;

public class SmartHomeDevice {

     String nama;
     double konsumsiPower;
     double standbyPower;

    public SmartHomeDevice(String nama, double konsumsiPower, double standbyPower){
        this.nama = nama;
        this.konsumsiPower = konsumsiPower;
        this.standbyPower = standbyPower;
    }
    public SmartHomeDevice(){}
    public double totalEnergiAktual(){
        double totalEnergiAktual = konsumsiPower + standbyPower;
        return totalEnergiAktual;
    }
    public double rasioEfisiensi(double totalEnergiAktual){
        double rasioEfisiensi = (standbyPower / totalEnergiAktual) * 0.01;
        return rasioEfisiensi;
    }
    public void printData(double totalEnergiAktual, double rasioEfisiensi){
        System.out.println(" - " + nama + " : ");
        System.out.println("   > Konsumsi Power : " + konsumsiPower);
        System.out.println("   > Stand by Power : " + standbyPower);
        System.out.println("   > Total Energi Aktual : " + totalEnergiAktual);
        System.out.println("   > Rasio Efisiensi : " + rasioEfisiensi);
    }
}
