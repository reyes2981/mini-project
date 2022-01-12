public abstract class Player {
    private String name;
    private String choice;
    private String playerChoice;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String newChoice) {
        choice = newChoice;
    }

    public String getPlayer() {
        return playerChoice;
    }

    public void setPlayer(String newPlayerChoice) {
        playerChoice = newPlayerChoice;
    }
    public abstract void selectChoice();
}
