package by.academy.lesson21.diagram;

import java.util.Objects;

public class PrivilegedCustomer extends Customer {
	private int privilegedAccountNo;

	public PrivilegedCustomer() {
		super();
	}

	public int getPrivilegedAccountNo() {
		return privilegedAccountNo;
	}

	public void setPrivilegedAccountNo(int privilegedAccountNo) {
		this.privilegedAccountNo = privilegedAccountNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(privilegedAccountNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrivilegedCustomer other = (PrivilegedCustomer) obj;
		return privilegedAccountNo == other.privilegedAccountNo;
	}

	@Override
	public String toString() {
		return "PrivilegedCustomer [privilegedAccountNo=" + privilegedAccountNo + "]";
	}
}
