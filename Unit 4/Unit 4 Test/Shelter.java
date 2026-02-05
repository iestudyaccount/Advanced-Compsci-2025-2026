import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        // to-do: implement this constructor
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Indices can't be null");
        }
        kennels = new Dog[rows][cols];
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is
     * occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        // to-do: implement this method
        if (animal == null) {
            throw new IllegalArgumentException("Animal should exist.");
        } else {
            for (int row = 0; row < kennels.length; row++) {
                for (int col = 0; col < kennels[row].length; col++) {
                    if (kennels[row][col] == null) {
                        kennels[row][col] = animal;
                        return;
                    }
                }
            }
            System.out.println("No empty kennels.");
        }
    }

    public void add(Dog animal, int row, int col) {
        // to-do: implement this method
        if (animal == null) {
            throw new IllegalArgumentException("Animal should exist.");
        } else if (row < 0 || col < 0 || row > kennels.length || col > kennels[0].length) {
            throw new IllegalArgumentException("Indices can't be null");
        } else if (kennels[row][col] != null) {
            add(animal);
        } else {
            kennels[row][col] = animal;
        }
    }

    public void add(ArrayList<Dog> animals) {
        // to-do: implement this method
        int amountOfDogCounter = 0;
        if (animals == null) {
            throw new IllegalArgumentException("Animals should exist.");
        } else {
            for (int row = 0; row < kennels.length; row++) {
                for (int col = 0; col < kennels[row].length; col++) {
                    if (kennels[row][col] == null) {
                        kennels[row][col] = animals.get(amountOfDogCounter);
                        animals.remove(amountOfDogCounter);
                    }
                }
            }
            int dogsLeftOver = animals.size();
            System.out.println("No empty kennels.\n".repeat(dogsLeftOver));
        }
    }

    public Dog adopt(int row, int col) {
        // to-do: implement this method
        if (row < 0 || col < 0) {
            throw new IllegalArgumentException("Indices can't be null.");
        } else if (kennels[row][col] == null) {
            throw new IllegalArgumentException("There is no dog to adopt!! :(");
        } else {
            Dog comingHome = new Dog();
            comingHome = kennels[row][col];
            kennels[row][col] = null;
            return comingHome;
        }
    }

    public ArrayList<Dog> search(String name) {
        // to-do: implement this method
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        } else {
            ArrayList<Dog> goodBoys = new ArrayList<Dog>();
            for (int row = 0; row < kennels.length; row++) {
                for (int col = 0; col < kennels[row].length; col++) {
                    if (kennels[row][col].getName() == name) {
                        goodBoys.add(kennels[row][col]);
                    }
                }
            }
            return goodBoys;
        }
    }

    public ArrayList<Dog> search(int age) {
        // to-do: implement this method
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        } else {
            ArrayList<Dog> goodBoys = new ArrayList<Dog>();
            for (int row = 0; row < kennels.length; row++) {
                for (int col = 0; col < kennels[row].length; col++) {
                    if (kennels[row][col].getAge() == age) {
                        goodBoys.add(kennels[row][col]);
                    }
                }
            }
            return goodBoys;
        }

    }
}
