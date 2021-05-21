public class PieceWorker extends Employee{
    private double wage;
    private double pieces;

    // constructor
    public PieceWorker(String first, String last, String email, String phone,
                       double wage, double pieces, int month, int day, int year){
        super(first, last, email, phone, month, day, year);

        setWage(wage);
        setPieces(pieces);
    }
    // SET
    public void setWage(double w){
        if(w >= 0.0f)
            this.wage = w;
        else
            throw new IllegalArgumentException(
                    "Wage must be >= 0.0f");
    }
    public void setPieces(double p){
        if(p >= 0.0f)
            this.pieces = p;
        else
            throw new IllegalArgumentException(
                    "Pieces must be >= 0.0f");
    }
    // GET
    public double getWage(){
        return this.wage;
    }
    public double getPieces(){
        return this.pieces;
    }
    // calculate earnings
    @Override
    public double earnings(){
        return getPieces() * getWage();
    }

    @Override
    public String toString(){
        return String.format("piece worker: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "wage", getWage(),
                "pieces produced", getPieces());
    }
}