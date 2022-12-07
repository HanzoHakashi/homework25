public class game {
    private String rock = Figure.ROCK.getValue();
    private String paper = Figure.PAPER.getValue();
    private String scissors = Figure.SCISSORS.getValue();

    public void getFigure(int choice){
        switch (choice){
            case 1:
                String rock = this.rock;
                break;
            case 2:
                String scissors = this.scissors;
                break;
            case 3:
                String paper = this.paper;
                break;
        }

    }

    public String getRock() {
        return rock;
    }

    public void setRock(String rock) {
        this.rock = rock;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getScissors() {
        return scissors;
    }

    public void setScissors(String scissors) {
        this.scissors = scissors;
    }
}
