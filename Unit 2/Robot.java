public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public Robot(int[] hallwayToClean, int startingPosition) {
        // to-do: implement constructor
        this.hallway = hallwayToClean;
        this.position = startingPosition;
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
        this.hallway = hallway;
    }

    public void setPosition(int position) {
        this.position = position;
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
        if (isFacingRight() == true && position == hallway.length) {
            return true;
        } else if (isFacingRight == false && position == hallway[0]) {
            return true;
        }
        return false;
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        // to-do: implement this method
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] > 1) {
                hallway[i] = hallway[i] - 1;
            } else if (hallway[i] == 1) {
                hallway[i] -= 1;

            } else if (hallway[i] > 1 && isRobotBlockedByWall() == true) {

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

        String roboMarker = "<";
        if (isFacingRight = true) {
            roboMarker = ">";
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
