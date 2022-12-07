public enum Figure {
    ROCK("Камень"),
    SCISSORS("Ножницы"),
    PAPER("Бумага"),
    LIZARD("Ящерица"),
    SPOK("Спок");

    private String value;
    Figure(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
