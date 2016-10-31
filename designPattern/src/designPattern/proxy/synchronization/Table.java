package designPattern.proxy.synchronization;

import java.util.HashMap;

public class Table implements  ITable{
	
	HashMap<Integer,IRow> row=new HashMap<Integer,IRow>();
	
	public HashMap<Integer,IRow> getRow() {
		return row;
	}

	public void setRow(HashMap<Integer, IRow> row) {
		this.row = row;
	}

	@Override
	public IRow getRow(int rowNum) {
		return row.get(rowNum);
		
	}

	@Override
	public void addRow(IRow row1, int rowNum) {
		row.put(rowNum, row1);
	}

	@Override
	public void modifyRow(int rowNum, IRow row1) {
		row.put(rowNum, row1);
		
	}

	@Override
	public void deleteRow(int rowNum) {
		row.remove(rowNum);
		
	}
	
	@Override
	public int numOfRows() {
		return row.size();
	}

}
