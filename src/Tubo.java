public class Tubo {
    private float raggio;
    private float altezza;

    public Tubo(float r, float a)throws Exception{
        if(r >0 && a >0){
            this.raggio = r;
            this.altezza = a;
        }else{
            throw new Exception("Parametri errati");
        }
    }

    public double calcolaSuperficie(){
        double superficie;
        superficie = 3.14*(raggio*raggio);
        return superficie;
    }


}


