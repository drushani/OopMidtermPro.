package hw3;

class Soundbox  {
    
    private int level=0;
        
    public void off() {
        level = 0;
        System.out.println("�������T");
    }
    
    public void low() {
        level = 1;
        System.out.println("���T���q�p");
    }
    
    public void medium() {
        level = 2;
        System.out.println("���T���q��");
    }
    
    public void high() {
        level = 3;
        System.out.println("���T���q�j");
    }
    

    
    public int getLevel() {
        return level;
    }
}