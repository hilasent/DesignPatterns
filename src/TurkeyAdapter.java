// Şimdi, Ördek nesnelerinin eksik olduğunu ve onların yerine bazı Türkiye nesnelerini kullanmak istediğinizi varsayalım.
// Açıkçası, farklı bir arayüze sahip oldukları için hindileri doğrudan kullanamıyoruz.


public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey newTurkey){
        this.turkey = newTurkey;

    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
       for(int i=0; i<5 ; i++){
           turkey.fly();
       }
    }
}
