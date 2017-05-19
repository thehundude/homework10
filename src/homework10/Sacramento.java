package homework10;

public class Sacramento {
    private String cdatetime;
    private String address;
    private int district;
    private String beat;
    private int grid;
    private String crimedescr;
    private int ucr_ncic_code;
    private double latitude;
    private double longitude;

    @Override
    public String toString() {
        return (cdatetime + " " + address + " " + district + " " + beat + " " + grid + " " + crimedescr + " " +
                ucr_ncic_code + " " + latitude + " " + longitude);
    }

    public String getCdatetime() {
        return cdatetime;
    }

    public void setCdatetime(String cdatetime) {
        this.cdatetime = cdatetime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public String getBeat() {
        return beat;
    }

    public void setBeat(String beat) {
        this.beat = beat;
    }

    public int getGrid() {
        return grid;
    }

    public void setGrid(int grid) {
        this.grid = grid;
    }

    public String getCrimedescr() {
        return crimedescr;
    }

    public void setCrimedescr(String crimedescr) {
        this.crimedescr = crimedescr;
    }

    public int getUcr_ncic_code() {
        return ucr_ncic_code;
    }

    public void setUcr_ncic_code(int ucr_ncic_code) {
        this.ucr_ncic_code = ucr_ncic_code;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
