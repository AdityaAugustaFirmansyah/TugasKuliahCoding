import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
/**
 * Write a description of class HotelApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HotelApp
{
    // instance variables - replace the example below with your own
    public static void main(String arg[]) {        
    // Ciptakan objek
    TransactionRoom room = new TransactionRoom();

    // Penciptaan objek untuk pembacaan data dari keyboard
    InputStreamReader istream = new InputStreamReader(System.in);
    BufferedReader bufRead = new BufferedReader(istream);

    int type = 0;
    int days = 0;
    try {
      System.out.println("List Tipe Kamar : ");
      for(int i = 0; i<room.getNameTypeRoomData().length;i++){
          System.out.println((i+1)+" "+room.getNameTypeRoomData()[i]);
      }
    //   menerima inputan tipe kamar
      System.out.print("tipe kamar (1-5) : ");
      String cString = bufRead.readLine();
      type = Integer.parseInt(cString);
    //   menerima inputan total hari  
      System.out.print("Total Hari       : ");
      String vString = bufRead.readLine();
      days = Integer.parseInt(vString);

      //   menerima inputan nama customer
      System.out.print("Nama Customer    : ");
      String name = bufRead.readLine();
    //   memanipulasi object
    // masukan nilai ke class TransactionRoom di attribut nameCustomer
      room.setNameCustomer(name);  
    // masukan nilai ke class TransactionRoom di attribut typeRoom
      room.setTypeRoom(type); 
        // masukan nilai ke class TransactionRoom di attribut totalDays
      room.setTotalDays(days);  
    // memanggil method calculatePrice
    

      System.out.println();
      System.out.println("Nama Customer    : "+room.getNameCustomer());
      System.out.println("Tipe Kamar       : "+room.getTypeRoom());
      System.out.println("Total Hari       : "+room.getTotalDays());
      System.out.println("Nama Tipe Kamar  : "+room.getNameTypeRoom());
      System.out.println("Fasilitas        : "+room.getFacilitate());
      System.out.println("Harga            : Rp."+room.calculatePrice());
      Calendar calendar = Calendar.getInstance();
      SimpleDateFormat format = new SimpleDateFormat("dd MMMMM yyyy");
      System.out.println("Tanggal Checkin  : "+format.format(calendar.getTime()));
      calendar.add(Calendar.DAY_OF_MONTH,days);
      System.out.println("Tanggal Checkout : "+format.format(calendar.getTime()));
    } catch (IOException err) {
      System.out.println("Proses pembacaan gagal!");
    }
    catch (NumberFormatException err) {
      System.out.println("Nilai input tidak valid!");
    }
}
}
