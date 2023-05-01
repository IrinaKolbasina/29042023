public class Radio {


    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;


    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

   public Radio() {
   }
    public Radio(int stationCount) {
        maxStation = stationCount -1;
    }
     public void next() {
        if (currentStation < maxStation)
            currentStation = currentStation + 1;
        else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation > minStation)
            currentStation = currentStation - 1;
        else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume)
            currentVolume = currentVolume + 1;
        else {
            currentStation = minStation;
        }
    }

    public void minusVolume() {
        if (currentVolume > minVolume)
            currentVolume = currentVolume - 1;
        else {
            currentStation = maxStation;
        }
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
