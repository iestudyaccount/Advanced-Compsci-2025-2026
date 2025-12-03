public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public Robot(int[] hallwayToClean, int startingPosition) {
        // to-do: implement constructor
        setHallway(hallwayToClean);
        setPosition(startingPosition);
        this.isFacingRight = true;
    }

    // getters

    public int[] getHallway() {
        return hallway;
    }

    public int getPosition() {
        return position;
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    // setters

    public void setHallway(int[] hallway) {
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] < 0) {
                hallway[i] = 0;
            }
        }
        this.hallway = hallway;
    }

    public void setPosition(int position) {
        if (position < 0) {
            this.position = 0;
        } else if (position >= hallway.length) {
            this.position = hallway.length - 1;
        } else {
            this.position = position;
        }
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        // to-do: implement this method
        if (isFacingRight() == true && position == hallway.length - 1) {
            return true;
        } else if (isFacingRight == false && position == 0) {
            return true;
        }
        return false;
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        // to-do: implement this method
        int i = position;

        if (hallway[i] > 1) {
            hallway[i]--;
            return;
        }

        if (hallway[i] == 1) {
            hallway[i]--;
        }

        if (isRobotBlockedByWall() == true) {
            isFacingRight = !isFacingRight;
        } else {
            if (isFacingRight == true) {
                setPosition(i + 1);
            } else {
                setPosition(i - 1);
            }
        }
    }

    /**
     * This method displays the current state of the robot and the hallway. It then
     * calls the move() method and counts the number of moves it takes to clear the
     * hallway. The method should display the current state of the robot after each
     * move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        // to-do: implement this method
        displayState();
        while (hallIsClear() == false) {
            move();
            count = count + 1;
            displayState();
        }
        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        // to-do: implement this method
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        // to-do: implement this method

        String currentState = "";

        String roboMarker;
        if (isFacingRight == true) {
            roboMarker = ">";
        } else {
            roboMarker = "<";
        }

        for (int i = 0; i < hallway.length; i++) {
            currentState += hallway[i];
            currentState += " ";
        }

        currentState += "\n";

        for (int i = 0; i <= position; i++) {
            currentState += " ";

        }
        currentState += roboMarker;

        System.out.println(currentState);

    }
}
