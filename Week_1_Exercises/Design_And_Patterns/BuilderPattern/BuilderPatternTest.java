package builderpattern;

public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create Computer with optional parts
        Computer gamingComputer = new Computer.ComputerBuilder("Intel i9", "32GB", "1TB SSD")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        Computer officeComputer = new Computer.ComputerBuilder("Intel i5", "16GB", "512GB SSD")
                .setGraphicsCardEnabled(false)
                .setBluetoothEnabled(true)
                .build();

        Computer basicComputer = new Computer.ComputerBuilder("Intel i3", "8GB", "256GB SSD")
                .build();

        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println("Office Computer: " + officeComputer);
        System.out.println("Basic Computer: " + basicComputer);
    }
}
