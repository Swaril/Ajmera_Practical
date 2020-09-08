import java.util.*;

public class transaction {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Banking System\n\n");
		
		//max 10 transactions of each allowed
		int checking_credit[]=new int[10];
		int checking_debit[]=new int[10];
		int savings_credit[]=new int[10];
		int savings_debit[]=new int[10];
		int cc_cnt=0, cd_cnt=0, sc_cnt=0, sd_cnt=0;

		int amount;
		int acc_select, act_select;
		int checking = 10000, savings = 10000;

		boolean again=true;
		while(again) {
			boolean extract=false, add=false;

			System.out.println("Select Option.");
			System.out.println("Enter 1 for Checking Account Transactions.");
			System.out.println("Enter 2 for Savings Account Transactions.");
			System.out.println("Enter 3 to show Credit Transactions.");
			System.out.println("Enter 4 to show Debit Transactions.");
			System.out.println("Enter 5 to show Final Account Balances.");
			acc_select=sc.nextInt();

			if(acc_select==1 || acc_select==2) {
				System.out.println("\nSelect Action.");
				System.out.println("Press 1 to Extract Money.");
				System.out.println("Press 2 to Add Money.");
				act_select=sc.nextInt();
			}

			if(act_select == 1)
				extract = true;
			else if(act_select == 2)
				add = true;

			boolean continue=true;
			switch(acc_select) {

				case 1: {

					if(extract) {

						while(continue) {
							System.out.println("Enter the Value to Extract: ");
							amount=sc.nextInt();
							if(amount % 500 != 0) {
								System.out.println("Incorrect Input...Value should be multiple of 500.");
								continue=true;
							}
							else
								continue=false;
						}
						if(amount<=checking) {
							checking_debit[cd_cnt]=amount;
							cd_cnt++;
							checking=checking-amount;

						}
						else
							System.out.println("Insufficient Funds.")
					}
					if(add) {

						while(continue) {
							System.out.println("Enter the Value to Add: ");
							amount=sc.nextInt();
							if(amount % 500 != 0) {
								System.out.println("Incorrect Input...Value should be multiple of 500.");
								continue=true;
							}
							else
								continue=false;
						}
						checking_credit[cc_cnt]=amount;
						checking=checking+amount;		
						cc_cnt++;
					}

				}
				case 2: {

					if(extract) {

						while(continue) {
							System.out.println("Enter the Value to Extract: ");
							amount=sc.nextInt();
							if(amount % 500 != 0) {
								System.out.println("Incorrect Input...Value should be multiple of 500.");
								continue=true;
							}
							else
								continue=false;
						}
						if(amount<=savings) {
							savings_debit[sd_cnt]=amount;
							savings=savings+amount;
							sd_cnt++;
						}
						else
							System.out.println("Insufficient Funds.")
					}
					if(add) {

						while(continue) {
							System.out.println("Enter the Value to Add: ");
							amount=sc.nextInt();
							if(amount % 500 != 0) {
								System.out.println("Incorrect Input...Value should be multiple of 500.");
								continue=true;
							}
							else
								continue=false;
						}
						savings_debit[sd_cnt]=amount;
						savings=savings+amount;
						sd_cnt++;
					}
				}
				case 3: {
					System.out.println("\nChecking Account Credit Transactions: ");
					for(int i=0;i<checking_credit.length;i++)
						System.out.println(checking_credit[i]);

					System.out.println("\nSavings Account Credit Transactions: ");
					for(int i=0;i<savings_credit.length;i++)
						System.out.println(savings_credit[i]);
				}
				case 4: {
					System.out.println("\nChecking Account Debit Transactions: ");
					for(int i=0;i<checking_debit.length;i++)
						System.out.println(checking_debit[i]);

					System.out.println("\nSavings Account Debit Transactions: ");
					for(int i=0;i<savings_debit.length;i++)
						System.out.println(savings_debit[i]);
				}
				case 5: {
					System.out.println("Checking Balance: ", checking);
					System.out.println("Savings Balance: ", savings);
				}

				default: {
					System.out.println("Incorrect Input...Please Try Again").
					break;
				}
					
			}

			int repeat;
			System.out.println("Enter 1 for Another Transaction.")
			System.out.println("Enter 0 to Exit.")
			repeat=sc.nextInt();

			if(repeat==1)
				again=true;
			else if(repeat==0)
				again=false;

		}
	}

}

