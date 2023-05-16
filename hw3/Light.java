package hw3;

class Light {
    
    private int brightness=0;
        
    public void off() {
        brightness = 0;
        System.out.println("Ãö¿O");
    }
    
    public void dim() {
        brightness = 1;
        System.out.println("¿O¥ú·t");
    }
    
    public void bright() {
        brightness = 2;
        System.out.println("¿O¥ú«G");
    }
    
    
    public int getBrightness() {
        return brightness;
    }
}