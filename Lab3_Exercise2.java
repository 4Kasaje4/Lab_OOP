public class Lab3_Exercise2 {
    public static void main(String[] args) {
        Charactor Hero = new Charactor("Kasaje");
        Hero.displayInfo();
        Hero.setExp(2000);
        Hero.displayInfo();
    }
}

class Charactor{
    protected String name;
    protected int maxHealth, level, exp;

    Charactor(String Name){
        this.name = Name;
        this.exp = 0;
        this.level = 1;
        this.maxHealth = 100;
    }

    Charactor(String Name, int MaxHealth, int Level, int Exp){
        this.name = Name;
        this.maxHealth = MaxHealth;
        this.exp = Exp;
        this.level = Level;
    }

    public void setExp(int Exp){

        this.exp = this.exp + Exp;
        int coutLevel = exp / 1000;
        this.level = coutLevel;
        this.maxHealth = this.maxHealth + (coutLevel * 100);
    }

    public void displayInfo(){
        System.out.println();
        System.out.println("**************** Status ****************");
        System.out.println("Name : " + name);
        System.out.println("MaxHealth : " + maxHealth);
        System.out.println("Level : " + level);
        System.out.println("Exp : " + exp);
        System.out.println("********************************");
        System.out.println();
    }
}