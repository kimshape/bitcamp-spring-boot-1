package shop.growith.api.book.domain;

public class BookVO {

    private String bTitle;
    private int bNum;
    private String bAuthor;
    private String getbPublisher;
    private int bStock;
    private boolean Loaned;
    boolean equals(String id) {
        if (this.bNum==Integer.parseInt(id)) {
            return true;}
        else {
            return false;}
    }

    public BookVO(String bTitle, int bNum, String bAuthor, String bPublisher, int stock) {

        super();
        this.bTitle = bTitle;
        this.bNum = bNum;
        this.bAuthor = bAuthor;
        this.getbPublisher = bPublisher;
        this.bStock = bStock;
        this.Loaned = Loaned;

    }

    public BookVO() {};  //기본생성자

    public String getbTitle() {return bTitle;	}
    public void setbTitle(String bTitle) {this.bTitle = bTitle;	}

    public int getbNum() { return bNum; }
    public void setbNum(int num) { this.bNum = num; }

    public String getbAuthor() { return bAuthor; }
    public void setbAuthor(String bAuthor) { this.bAuthor = bAuthor; }

    public String getbPublisher() { return getbPublisher; }
    public void setbPublisher(String bPublisher) { this.getbPublisher = bPublisher; }

    public int getbStock() { return bStock; }
    public void setbStock(int bStock) { this.bStock = bStock; }

    public boolean isLoaned() {return Loaned; }
    public void setLoaned(boolean Loaned) { this.Loaned = Loaned; }

}
