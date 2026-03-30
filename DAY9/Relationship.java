class Battery{
    public void powerSupply(){
        System.out.println("Still have 40% power");
    }
}
class Remote{
    Battery minBattery;   //has a relationship
    Remote(){
        minBattery=new Battery();
    }
    public void changeChannel(){
        minBattery.powerSupply();
        System.out.println("Channel Changed");
    }
    public void changeVolume(){
        System.out.println("Volume increased");
    }
}
class Tv{
    Remote tvREmote;
    Tv(Remote tvRemote){
        this.tvRemote=tvRemote;
        public void increaseVolume(){
            tvRemote.changeVolume();
        }
    }
}
public class Relationship {
    public static void main(String[] args) {
        Remote tvRemote=new Remote();
        tvRemote.changeChannel();
    }
}
