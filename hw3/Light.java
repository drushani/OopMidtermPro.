package hw3;

class Light {
    
    private int brightness=0;
        
    public void off() {
        brightness = 0;
        System.out.println("���O");
    }
    
    public void dim() {
        brightness = 1;
        System.out.println("�O���t");
    }
    
    public void bright() {
        brightness = 2;
        System.out.println("�O���G");
    }
    
    
    public int getBrightness() {
        return brightness;
    }
}