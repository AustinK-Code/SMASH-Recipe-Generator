import java.util.List;

public class Beer {
    private String beerName;
    private Double aBVrequest;
    private String beerStyle;
    private Double grainWeight;




    public Beer(String beerName, Double aBVrequest) {
        this.beerName = beerName;
        this.aBVrequest = aBVrequest;
    }

    public String getBeerName() {
        return beerName;
    }


    public Double getABV() {
        return aBVrequest;
    }

    public Double getGrainWeightToHitABV() {
        this.grainWeight = (getABV() / .71) * 1.33;
        return this.grainWeight;
    }
}
