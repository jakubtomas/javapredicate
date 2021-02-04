package it.tomas;

public class City {

    private String name;
    private String code;
    private String district;
    private int population;
    //

    //generate constructor
    public City(String name, String code, String district, int population) {
        this.name = name;
        this.code = code;
        this.district = district;
        this.population = population;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


    // To string all parameters
    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                '}';
    }
}
