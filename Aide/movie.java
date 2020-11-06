class Movie {
    public Movie(String title, String author, Integer date) {
        this.title = title;
        this.author = author;
        this.date = date;
    }
    public String getDescription() {
        return "Le film "+this.name+" réalisé par "+this.author+" est sorti en "+String.valueOf(this.date)+".";
    }
}
