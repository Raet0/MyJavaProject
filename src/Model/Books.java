package Model;

public class Books {

    String category;
    int numberpages;
    String colorbook;
    public Books(String category, int numberpages, String colorbook) {
        this.category = category;
        this.numberpages = numberpages;
        this.colorbook = colorbook;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getNumberpages() {
        return numberpages;
    }
    public void setNumberpages(int numberpages) {
        this.numberpages = numberpages;
    }
    public String getColorbook() {
        return colorbook;
    }
    public void setColorbook(String colorbook) {
        this.colorbook = colorbook;
    }

}
