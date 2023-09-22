
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		MyChain chain = null;
		Object arr[] = null;
		MyChain unitedChain = null;
		MyChain intersectedChain = null;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. Shineer holboost jagsaalt uusgeh");
			System.out.println("2. Holboost jagsaaltad element nemeh");
			System.out.println("3. Holboost jagsaaltaas element hasah");
			System.out.println("4. Holboost jagsaaltiig engiin jagsaalt ruu shiljuuleh");
			System.out.println("5. Holboost jagsaalt deer oor engiin jagsaalt zalgah");
			System.out.println("6. Holboost jagsaalt bolon oor holboost jagsaaltiin negdliig oloh");
			System.out.println("7. Holboost jagsaal bolon oor holboost jagsaaltiin ogtloltsliig oloh");
			System.out.println("8. Duusgah");
			System.out.println("9. Holboost jagsaalt hevleh");
			
			int songolt = scanner.nextInt();
			
			if (songolt == 1) {
				chain = new MyChain();
				System.out.println("Holboost jagsaalt uusgelee.");
			} else if (songolt == 2) {
				if (chain != null) {
					System.out.println("MyChain: " + chain.toString());
					System.out.println("Ymar element heddugeer indexd nemeh ve");
					int element = scanner.nextInt();
					int index = scanner.nextInt();
					chain.add(index, element);
					System.out.println("Holboost jagsaaltad element nemsen.");
				} else {
					System.out.println("Holboost jagsaalt uuseegui baina.");
				}
			} else if (songolt == 3) {
				if (chain != null) {
					System.out.println("MyChain: " + chain.toString());
					System.out.println("Heddugeer index iin elementiig ustgah ve");
					int index = scanner.nextInt();
					chain.remove(index);
					System.out.println("Holboost jagsaaltaas element hassan");
				} else {
					System.out.println("Holboost jagsaalt uuseegui baina.");
				}
			} else if (songolt == 4) {
				if (chain != null) {
					arr = chain.toArray();
					System.out.println("Uussen array: "+ Arrays.toString(arr));
				} else {
					System.out.println("Holboost jagsaalt uuseegui baina.");
				}
			} else if (songolt == 5) {
				
				if (chain != null) {
					System.out.println("Zalgah array iin heljeeg ogno uu");
					int hemjee = scanner.nextInt();
					Object[] newArray = new Object[hemjee];
					for (int i = 0; i < hemjee; i++) {
						System.out.println((i + 1) + " dahi elementiig oruulna uu: ");
						int element = scanner.nextInt();
						newArray[i] = element;
					}
					chain.addRange(newArray);
					System.out.println("Shineer list zalgalaa");
				} else {
					System.out.println("Holboost jagsaalt uusegui baina.");
				}
				
				
			} else if (songolt == 6) {
				
				if (chain != null) {
					MyChain newChain = new MyChain();
					System.out.println("Nemj zalgah holboost jagsaaltiig uusgehiin tuld elementuudig oruulna uu. Bolson gej uzvel toonoos oor zuil oruulna uu");
					
					while (true) {
						String element = scanner.next();
						try {
							int integerValue = Integer.parseInt(element);
							newChain.add(newChain.size(), integerValue);
						} catch (NumberFormatException e) {
							break;
						}
					}
					
					unitedChain = chain.union(newChain);
					System.out.println("Shine holboost jagsaaltiig zalgasan: " + unitedChain.toString());
				} else {
					System.out.println("Holboost jagsaalt uuseegui baina.");
				}
				
			} else if (songolt == 7) {
				if (chain != null) {
					MyChain newChain = new MyChain();
					System.out.println("Ogtloltsloliig oloh holboost jagsaaltiig uusgehiin tuld elementuudig oruulna uu. Bolson gej uzvel toonoos oor zuil oruulna uu");
					while (true) {
						String element = scanner.next();
						try {
							int integerValue = Integer.parseInt(element);
							newChain.add(newChain.size(), integerValue);
						} catch (NumberFormatException e) {
							break;
						}
					}
					intersectedChain = chain.intersection(newChain);
					System.out.println("Shine holboost jagsaaltiin undsen jagsaalttai ogtloltsoh elementtin jagsaalt: " + intersectedChain.toString());
				} else {
					System.out.println("Holboost jagsaalt uuseegui baina.");
				}
				
			} else if (songolt == 8) {
				break;
			} else if (songolt == 9) {
				if (chain != null) {
					System.out.println("MyChain: " + chain.toString());
				} else {
					System.out.println("Holboost jagsaalt uuseegui baina.");
				}
			} else {
				System.out.println("Buruu utga oruulsan baina.");
			}
			
		}
		scanner.close();
	}

}
