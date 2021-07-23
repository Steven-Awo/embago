package Main_23_07.models;

public class country_directions implements Directions {
    private String starting_country;
    private String destination_country;

    public country_directions(String starting_country, String destination_country) {
        this.starting_country = starting_country;
        this.destination_country = destination_country;
    }

    public String getStarting_country() {
        return starting_country;
    }

    public void setStarting_country(String starting_country) {
        this.starting_country = starting_country;
    }

    public String getDestination_country() {
        return destination_country;
    }

    public void setDestination_country(String destination_country) {
        this.destination_country = destination_country;
    }


    @Override
    public String toString() {
        return "country_directions{" +
                "starting_country='" + starting_country + '\'' +
                ", destination_country='" + destination_country + '\'' +
                '}';
    }

    @Override
    public void calculate_direction_km() {

    }

    @Override
    public void calculate_bearing_km() {

    }
}
