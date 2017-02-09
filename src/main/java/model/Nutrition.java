package model;

/**
 * Created by pdoshi on 31/12/16.
 */
public class Nutrition {


    private int id;
    private String food;
    private String benefit;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }


    @Override
    public String toString() {
        return "Nutrition{" +
                "id=" + id +
                ", food='" + food + '\'' +
                ", benefit='" + benefit + '\'' +
                '}';
    }

}
