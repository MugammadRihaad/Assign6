package ac.za.cput.domain.Town;

public class TownStaff {
    private String tnStaffId,tnAccountId,tnDelivId,tnBakerId;

    private TownStaff(){}

    private TownStaff(Builder builder) {
        this.tnStaffId = builder.tnStaffId;
        this.tnAccountId = builder.tnAccountId;
        this.tnDelivId=builder.tnDelivId;
        this.tnBakerId=builder.tnBakerId;
    }

    public String getTnStaffId() {
        return tnStaffId;
    }

    public String getTnAccountId() {
        return tnAccountId;
    }

    public String getTnDelivId(){
        return tnDelivId;
    }

    public String getTnBakerId(){
        return tnBakerId;
    }

    public static class Builder{

        private String tnStaffId, tnAccountId,tnDelivId,tnBakerId;


        public Builder tnStaffId(String tnStaffId) {
            this.tnStaffId = tnStaffId;
            return this;
        }

        public Builder tnAccountId(String tnAccountId) {
            this.tnAccountId = tnAccountId;
            return this;
        }

        public Builder tnDelivId(String tnDelivId) {
            this.tnDelivId =tnDelivId;
            return this;
        }
        public Builder tnBakerId(String tnBakerId) {
            this.tnBakerId =tnBakerId;
            return this;
        }


        public TownStaff build() {
            return new TownStaff(this);
        }

    }

    @Override
    public String toString() {
        return "Town Staff{" +
                " Town Staff Id='" + tnStaffId + '\'' +
                ",Town Accountant Id='" + tnAccountId + '\'' +
                ", Town Delivery Id='" + tnDelivId + '\'' +
                ", Town Baker Id='" + tnBakerId + '\'' +
                '}';
    }

}
