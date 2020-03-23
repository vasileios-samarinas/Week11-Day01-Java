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
        boolean count=enoughPapers(pagesused);
        if(count==true){
        this.numberOfSheetsRemaining=this.numberOfSheetsRemaining-pagesused;}
        else{System.out.println("Not enough paper");}
    }

    public boolean enoughPapers(int pages){
        if (this.numberOfSheetsRemaining>=pages){
            return true;
        }
        else{
            return false;
        }
    }

}
