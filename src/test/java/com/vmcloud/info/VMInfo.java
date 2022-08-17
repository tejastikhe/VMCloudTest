package com.vmcloud.info;

public class VMInfo {
	
	
	private double vmIp;
	private String userAllocated;
	private String Status;
	private String typeOfVM;
	// allocation date
	
	public VMInfo() {
		
	}
	public void CheckOutVM(String user, String typeOfVM) throws Exception {
		
		try {
			this.vmIp=Math.random();
			this.Status="Allocated";
			this.userAllocated=user;
			this.typeOfVM=typeOfVM;
		  }catch (Exception e) {
			  System.err.println(" Can not check out "+e.getMessage());
				throw new Exception("Can not check out vm");
		}
	}
	public void CheckInVm() throws Exception {
	  try {
		  this.vmIp=0.0;
		  this.Status=null;
		  this.userAllocated=null;
		  this.typeOfVM=null;
	  } catch (Exception e) {
			System.err.println(" Can not check in vm "+e.getMessage());
			throw new Exception("Can not check in vm ");
		}	 
	}
	
	public boolean repairVM(int i) {
		boolean isRepaired=false;
		try {
			this.Status="Repaired";
			isRepaired=true;
		}catch (Exception e) {
			this.Status="Not Repaired";
			System.err.println("VM:"+i+"Can not be repaired");
			isRepaired=false;
		}
		
		return true;
	}
	
	public void getInfo(int i) {
		try {
			 System.out.println("VM Info :Allocated VM No:"+i+" Current VM User:"+this.userAllocated+": Current VM Status:"+this.Status+": Current VM OS:"+this.typeOfVM+" VM IP :"+this.vmIp);
		}catch (Exception e) {
			System.err.println("Can not  display VM info");
		}
	}

}
