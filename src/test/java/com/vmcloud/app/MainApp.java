package com.vmcloud.app;

import java.util.ArrayList;

import com.vmcloud.info.VMInfo;

public class MainApp {

	public void VMMenu(int input) {
		ArrayList<VMInfo> vmList = new ArrayList<VMInfo>();
		VMInfo vmInstance = null;
		int numberOfVM = 100;
		int i = 0;
		// int input=1; // this can be command line argument and Menu Driven Case block
		int vmNo = 1; // this vm no is user input
		// input= Integer.parseInt(args[0]);
		try {
			while (true) {
				if (input == 1) {

					try {
						if (vmList.size() < 100) {
							vmInstance = new VMInfo();
							vmInstance.CheckOutVM("Tejas", "Windows");
							vmList.add(vmInstance);

							vmList.get(i);
							System.out.println("VM Number " + i + " is allocated");
							vmInstance.getInfo(i);
							System.out.println(" No of VM's checkout :" + vmList.size());
							i++;

						} else {
							System.out.println("VM Not available");
						}
					} catch (Exception e) {
						System.err.println(e.getMessage());
						i--;
					}
					break;
				} else if (input == 2) {
					vmInstance = vmList.get(i);
					try {
						vmInstance.CheckInVm();
						vmList.remove(i);
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
					break;

				} else if (input == 3) {
					try {
						vmInstance.repairVM(i);
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
					// break;
				} else {
					
					System.out.println("Invalid input selected, please try again!");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("In valid Input");
		}

	}

}
