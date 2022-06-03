public class Computer {
    public void turnOnComputer(){
        System.out.println("Computer Turned on");
    }
    public void turnOffComputer(){
        System.out.println("Computer Turned off");

    }
    public void cleanCache(){
        System.out.println("cleanCache");
    }
    public void reduceBrightNess(int brightnessAmount){
        System.out.println("Reduce brightness by:"+ brightnessAmount+ "%");
    }
    public void playMusic(int volumeAdjust){
        System.out.println("Volume Adjust by:"+volumeAdjust+ "%");
    }

    public static void main(String[] args) {
        Computer mycomputer= new Computer();
        mycomputer.turnOnComputer();
        mycomputer.turnOffComputer();
        mycomputer.cleanCache();
        mycomputer.reduceBrightNess( 10);
        mycomputer.playMusic( 50);

        ChromeBrowser mybrowser= new ChromeBrowser();
        mybrowser.writeUrlInChromeAddressBar();
        mybrowser.openChromeBrowser();
        mybrowser.closeChromeBrowser();



        TextEditor myText= new TextEditor();
        System.out.println(myText.openTextEditor());
        myText.writeIntoTextFile("I love Java class and I am enjoying to do it");
        myText.closeTextEditor();


        MicrosoftOutLook myOutlook= new MicrosoftOutLook();
        System.out.println(myOutlook.openMicrosoftOutlook());
        MicrosoftOutLook.closeOutLook();

        Calculator mycalculator= new Calculator();
        mycalculator.openCalculator();
        System.out.println(mycalculator.addTwoNumber(6,  12));
        System.out.println(mycalculator.deductTwoNumber(12,7));
        System.out.println(mycalculator.addThreeNumber(3,8,10));
        System.out.println(mycalculator.deductThreeNumber(10,12,22));

    }






}
