import java.util.Scanner;
// there are four nested classes
// 1) static nested class
// 2) non-static nested class or inner class
//  There are two kinds of inner class
// a) Local inner class
// b)anonymous class (without class name)
public class Main {
    private static Scanner scanner = new Scanner(System.in);  // M3
    private static Button btnPrint = new Button("Print"); // M3

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
//   M1       Gearbox.Gear first = mcLaren.new Gear(1,12.3);
//   M1   Error! Gearbox.Gear second=new Gearbox.Gear(2,15.4);
//   M1   Error! Gearbox.Gear Third=new mcLaren.Gear(3,17.4);
//   M1      System.out.println(first.driveSpeed(1000));

//   A1 M2    mcLaren.addGear(1,5.3);   // Alternate code in Gearbox
//   A1     mcLaren.addGear(2,10.6);
//   A1     mcLaren.addGear(3,15.9);

//  M2      mcLaren.operateClutch(true);
//  M2     mcLaren.changeGear(1);
//  M2      mcLaren.operateClutch(false);
//  M2      System.out.println(mcLaren.wheelSpeed(1000));
//  M2      mcLaren.changeGear(2);
//  M2      System.out.println(mcLaren.wheelSpeed(3000));
//  M2      mcLaren.operateClutch(true);
//  M2      mcLaren.changeGear(3);
//  M2      mcLaren.operateClutch(false);
//  M2      System.out.println(mcLaren.wheelSpeed(6000));

        // a) Local inner class
//  A2      class ClickListener implements Button.OnClickListener {  // Alternate code A2
//  A2          public ClickListener() {
//  A2              System.out.println("I've been attached");
//  A2          }
//  A2
//  A2          @Override
//  A2          public void onClick(String title) {
//  A2              System.out.println(title + " was clicked");
//  A2          }
//  A2      }
//  A2
//  A2      btnPrint.setOnClickListener(new ClickListener());
//  A2      listen();

        // Confusion ! not showing output because "I've been attached" is not printing here
        // we are directly using switch statement 1 0r 0

       // b)anonymous class (without class name)
        btnPrint.setOnClickListener(new Button.OnClickListener() {  // A2
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();

    }
    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.on1Click();

            }
        }
    }
}


