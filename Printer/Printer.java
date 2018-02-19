public class Printer {
    private int tonerLevel=100;
    private int noofpagesprinted;
    private boolean isDuplex;
    public Printer(int t, int p, boolean d){
        if(t>0 && t<=100){
            this.tonerLevel = t;
        }
        this.noofpagesprinted = p;
        this.isDuplex = d;
    }
    public void printapage(){
        this.noofpagesprinted++;
        System.out.println("A single page is printed");
        System.out.println("The total no of pages printed by the printer is"+this.noofpagesprinted);
    }
    public void printpages(int p){
        if(p<0) System.out.println("Negative numbers are not allowed");
        this.noofpagesprinted+=p;
        System.out.println(p+"pages are printed");
        System.out.println("The total no of pages printed by the printer is"+this.noofpagesprinted);
    }
    public void addToner(int tn){
        this.tonerLevel+=tn;
        if(this.tonerLevel<0 || this.tonerLevel>100){
            System.out.println("Toner is not added as The toner level is not in the permissible range"+this.tonerLevel);
            this.tonerLevel-=tn;
            System.out.println("Hence, the old toner level is kept"+this.tonerLevel);
            return;
        }
       System.out.println("The new toner level is"+this.tonerLevel);
    }
}
