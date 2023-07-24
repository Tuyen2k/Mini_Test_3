public class Address {
    private String city;
    private String district;
    private String commune;
    private String houseNumber;

    public Address() {
    }

    public Address(String city, String district, String commune, String houseNumber) {
        this.city = city;
        this.district = district;
        this.commune = commune;
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return  "city= " + city + '\'' +
                ", district= " + district + '\'' +
                ", commune= " + commune + '\'' +
                ", houseNumber= " + houseNumber + '\'';
    }
}
