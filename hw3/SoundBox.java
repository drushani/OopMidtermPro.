package hw3;

class Soundbox  {
    
    private int level=0;
        
    public void off() {
        level = 0;
        System.out.println("關閉音響");
    }
    
    public void low() {
        level = 1;
        System.out.println("音響音量小");
    }
    
    public void medium() {
        level = 2;
        System.out.println("音響音量中");
    }
    
    public void high() {
        level = 3;
        System.out.println("音響音量大");
    }
    

    
    public int getLevel() {
        return level;
    }
}