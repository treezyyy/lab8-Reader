public class reader {
    String initials;
    int TicketNumber;
    String facult;
    String birthdate;
    String phone;
    static int CounterTicketNumber = 1;
    reader (String initials, String birthdate, String phone, String facult){
        this.initials = initials; // for ezempl
        this.facult = facult;
        this.birthdate = birthdate;
        this.phone = phone;
        TicketNumber = CounterTicketNumber++;
    }
    public String TakeBook(int QuantityBook){
        return this.initials + " взял " + QuantityBook + " книг";
    }
    public String TakeBook(String[] NamedBook){
        String Collection = String.join(",", NamedBook);
        return this.initials + " взял " + Collection;
    }
    public String ReturnBook(int QuantityBook){
        return this.initials + " Вернул " + QuantityBook + " книг";
    }
    public String ReturnBook(String[] NamedBook){
        String Collection = String.join(",", NamedBook);
        return this.initials + " Вернул " + Collection + " книг ";
    }
}
