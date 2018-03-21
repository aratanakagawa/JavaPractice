public class CoinCase {
    private int numOf500;
    private int numOf100;
    private int numOf50;
    private int numOf10;
    private int numOf5;
    private int numOf1;

    public CoinCase(){
        this.numOf500=0;
        this.numOf100=0;
        this.numOf50=0;
        this.numOf10=0;
        this.numOf5=0;
        this.numOf1=0;
    }

    public void AddCoins(int kind, int numOfcoins){
        if(kind==500){
            this.numOf500=this.numOf500+numOfcoins;
        }if(kind==100){
            this.numOf100=this.numOf100+numOfcoins;
        }if(kind==50){
            this.numOf50=this.numOf50+numOfcoins;
        }if(kind==10){
            this.numOf10=this.numOf10+numOfcoins;
        }if(kind==5){
            this.numOf5=this.numOf5+numOfcoins;
        }if(kind==1){
            this.numOf1=this.numOf1+numOfcoins;
        }else{
        }
    }



    public int GetCount(int kind){
        if(kind==500){
            return this.numOf500;
        }if(kind==100){
            return this.numOf100;
        }if(kind==50){
            return this.numOf50;
        }if(kind==10){
            return this.numOf10;
        }if(kind==5){
            return this.numOf5;
        }if(kind==1){
            return this.numOf1;
        }else{
            return 0;
        }
    }

    public int GetAmount(){
        int total=500*this.numOf500+100*this.numOf100+50*this.numOf50+10*this.numOf10+5*this.numOf5+1*this.numOf1;
        return total;
    }


}
