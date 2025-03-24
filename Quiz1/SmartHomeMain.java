package Quiz1;

public class SmartHomeMain {
    public static void main(String[] args) {
        int n = 2;
        double[] totalEnergiAktual = new double[n];
        SmartHomeDevice[] arrayOfSmartHomeDevices = new SmartHomeDevice[n];
        arrayOfSmartHomeDevices[0] = new SmartHomeDevice();
        arrayOfSmartHomeDevices[0].nama = "Vivo";
        arrayOfSmartHomeDevices[0].konsumsiPower = 8;
        arrayOfSmartHomeDevices[0].standbyPower = 9;
        arrayOfSmartHomeDevices[1] = new SmartHomeDevice();
        arrayOfSmartHomeDevices[1].nama = "Samsung";
        arrayOfSmartHomeDevices[1].konsumsiPower = 11;
        arrayOfSmartHomeDevices[1].standbyPower = 9;
        System.out.println(arrayOfSmartHomeDevices[0].nama);
        System.out.println(arrayOfSmartHomeDevices[1].nama);
        for(int i = 0; i < n; i++){
            totalEnergiAktual[i] = arrayOfSmartHomeDevices[i].totalEnergiAktual();
            double rasioEfisiensi = arrayOfSmartHomeDevices[i].rasioEfisiensi(totalEnergiAktual[i]);
            arrayOfSmartHomeDevices[i].printData(totalEnergiAktual[i], rasioEfisiensi);
            System.out.println("----------------------------------------------------------");
        }
        rataRataTotalEnergiAktual(arrayOfSmartHomeDevices, n, totalEnergiAktual);
    }
    static void rataRataTotalEnergiAktual(SmartHomeDevice[] arrayOfSmartHomeDevices, int a, double[] totalEnergiAktual){
        double totalTotalEnergiAktual = 0;
        double jumlah = 0;
        for(int i = 0; i < a; i++){
            if (arrayOfSmartHomeDevices[i].konsumsiPower > 10) {
                totalTotalEnergiAktual =+ totalEnergiAktual[i];
                jumlah ++;
            }
        }
        double rataRataTotalEnergiAktual = totalTotalEnergiAktual / jumlah;
        if (jumlah == 0) {
            System.out.println("*** Tidak ada device yg mempunyai konsumsi energi lebih dari 10 ***");
        }else{
            System.out.println("Rata rata total energi aktual yg devicenya mempunyai konsumsi energi lebih dari 10 adalah " + rataRataTotalEnergiAktual);
        }
        System.out.println("----------------------------------------------------------");
    }
}

