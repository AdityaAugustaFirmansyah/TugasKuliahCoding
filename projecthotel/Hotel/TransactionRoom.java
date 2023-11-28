class TransactionRoom {
  public static final int PRICE_ROOM_PRESIDENT = 1500000; 
  public static final int PRICE_ROOM_DELUXE = 1000000;
  public static final int PRICE_ROOM_STD = 900000;
  // Deklarasi atrribut
  private String nameCustomer;
  private int typeRoom;
  private int totalDays;

  // Konstruktor
  public TransactionRoom() {
    nameCustomer = "";
    typeRoom = 0;
    totalDays = 0;
  }

  // untuk mendaptkan nilai dari atribut nameCustomer
  public String getNameCustomer() {
    return(nameCustomer);
  }
  // untuk mendaptkan nilai dari atribut typeRoom
  public int getTypeRoom() {
    return(typeRoom);
  }
  // untuk mendaptkan nilai dari atribut totalDays
  public int getTotalDays() {
    return(totalDays);
  }
// untuk menampung data tipe room
public String [] getNameTypeRoomData() {
    String nama[] = new String[3];
    nama[0] = "President";
    nama[1] = "Deluxe";
    nama[2] = "Standard";
    return nama;
  }
// untuk mendapatkan data room
  public String getNameTypeRoom() {
    String nama[] = getNameTypeRoomData();
    return(nama[typeRoom-1]);
  }
  
  public int calculatePrice(){
      int price = 0;
      if(typeRoom == 1){
          price = PRICE_ROOM_PRESIDENT*totalDays;
      }else if (typeRoom == 2){
          price = PRICE_ROOM_DELUXE*totalDays;
      }else if(typeRoom == 3){
          price = PRICE_ROOM_STD*totalDays;
      }
      return price;
  }
  
// untuk mendapatkan data room  
  public String [] getFacilitateData(){
    String data[] = new String[3];
    data[0] = "Ac 2 pk, King Bed, Shower & Bathub";
    data[1] = "Ac 1 pk, Twin Bed, Shower";
    data[2] = "Ac 1/2 pk, Single Bed, Gayung";
    return data;
  }

  public String getFacilitate() {
    String data[] = getFacilitateData();

    return(data[typeRoom-1]);
  }

  // Mutator
  public void setNameCustomer(String p) {
    nameCustomer = p;
  }

  public void setTypeRoom(int c) {
    typeRoom = c;
  }

  public void setTotalDays(int v) {
    totalDays = v;
  }
}