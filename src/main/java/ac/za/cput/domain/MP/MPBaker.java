package ac.za.cput.domain.MP;

public class MPBaker {
    private String mpBakerId,mpBakerName;
    private double mpBakerSalary;


    private MPBaker(){}

    private MPBaker(Builder builder) {
        this.mpBakerId = builder.mpBakerId;
        this.mpBakerName = builder.mpBakerName;
        this.mpBakerSalary=builder.mpBakerSalary;

    }

    public String getMpBakerId() {
        return mpBakerId;
    }

    public String getMpBakerName() {
        return mpBakerName;
    }

    public double getMpBakerSalary(){
        return mpBakerSalary;
    }
    public static class Builder{

        private String mpBakerId, mpBakerName;
        private double mpBakerSalary;


        public Builder mpBakerId(String mpBakerId) {
            this.mpBakerId = mpBakerId;
            return this;
        }

        public Builder mpBakerName(String mpBakerName) {
            this.mpBakerName = mpBakerName;
            return this;
        }

        public Builder mpBakerSalary(double mpBakerSalary) {
            this.mpBakerSalary =mpBakerSalary;
            return this;
        }


        public MPBaker build() {
            return new MPBaker(this);
        }

    }

    @Override
    public String toString() {
        return "Mithcells Plain Baker{" +
                " Mitchells Plain Baker Id='" + mpBakerId + '\'' +
                ", Mithcells Plain Baker Name='" + mpBakerName + '\'' +
                ",  Mitchels Plain Baker Salary='" + mpBakerSalary + '\'' +
                '}';
    }

}
