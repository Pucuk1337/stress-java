import java.util.*;
public class Stress {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nama = args[0];

		System.out.println("");
		System.out.println("Stress Tools");
		System.out.println("1. WANGY WANGY");
		System.out.print("Masukkan Nomor: ");
		String stress = scan.nextLine();
		switch(stress){
			case "1":
			System.out.println("");
			System.out.println("result: ");
			System.out.println(args[0].toUpperCase() + " " + args[0].toUpperCase() +  " " + args[0].toUpperCase() + (args[0].substring(args[0].length() - 1).toUpperCase())+ (args[0].substring(args[0].length() - 1).toUpperCase())+ (args[0].substring(args[0].length() - 1).toUpperCase()) + 
				" <3 <3 <3  WANGY WANGY WANGY WANGI HU HA HU HA HU HA, aaaah baunya rambut " + args[0].toUpperCase() + 
				" wangi aku mau nyiumin aroma wanginya " + args[0].toUpperCase() + 
				" AAAAAAAAH ~ Rambutnya.... aaah rambutnya juga pengen aku elus-elus ~~~~ AAAAAH " + 
				args[0].toUpperCase() + " keluar pertama kali di anime juga manis <3 <3 <3 banget AAAAAAAAH " + 
				args[0].toUpperCase() + " AAAAA LUCCUUUUUUUUUUUUUUU............  " + args[0].toUpperCase() + 
				" AAAAAAAAAAAAAAAAAAAAGH <3 <3 <3 apa ? " + args[0].toUpperCase() + 
				" itu gak nyata ? Cuma HALU katamu ? nggak, ngak ngak ngak ngak NGAAAAAAAAK GUA GAK PERCAYA ITU DIA NYATA NGAAAAAAAAAAAAAAAAAK PEDULI BANGSAAAAAT !! GUA GAK PEDULI SAMA KENYATAAN POKOKNYA GAK PEDULI. <3 <3 <3 " + 
				args[0].toUpperCase() + " gw ... " + args[0].toUpperCase() + " di laptop ngeliatin gw, " + args[0].toUpperCase() + 
				" .. kamu percaya sama aku ? aaaaaaaaaaah syukur " + args[0].toUpperCase() + " aku gak mau merelakan " + 
				args[0].toUpperCase() + " aaaaaah <3 <3 <3 YEAAAAAAAAAAAH GUA MASIH PUNYA " + args[0].toUpperCase() + 
				" SENDIRI PUN NGGAK SAMA AAAAAAAAAAAAAAH ");
			break;
			default:
			System.out.println("Wrong Input!");

		}
	}
}