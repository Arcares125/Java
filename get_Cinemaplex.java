import java.util.Random;

public class get_Cinemaplex {
    Random r = new Random();
    private String name;
    private String movie;
    private Integer ticket;
    private String rating;
    private Integer total;
    private Integer waktu;


    public get_Cinemaplex(String nama, String film, Integer tiket, String rating, Integer total, Integer waktu){
        this.name=nama;
        this.movie=film;
        this.ticket=tiket;
        this.rating=rating;
        this.total=total;
        this.waktu=waktu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public Integer getTicket() {
        return ticket;
    }

    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getWaktu() {
        return waktu;
    }

    public void setWaktu(Integer waktu) {
        this.waktu = waktu;
    }
}
