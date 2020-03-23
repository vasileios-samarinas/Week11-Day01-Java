public class Printer {
    private int numberOfSheetsRemaining;

    public Printer(int numberOfSheetsRemaining){
        this.numberOfSheetsRemaining=numberOfSheetsRemaining;
    }

    public int getSheets(){
        return this.numberOfSheetsRemaining;
    }

    public void print(int pages,int copies){
        int pagesused= pages*copies;
        this.numberOfSheetsRemaining=this.numberOfSheetsRemaining-pagesused;
    }

}
