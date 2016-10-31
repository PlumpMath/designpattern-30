package designPattern.proxy.synchronization;

public class ProxyTable implements ITable {

	ITable table;

	public ProxyTable(ITable table) {
		this.table = table;
	}

	@Override
	public int numOfRows() {
		return table.numOfRows();
	}

	@Override
	public IRow getRow(int rowNum) {

		synchronized (table.getRow(rowNum)) {
			return table.getRow(rowNum);
		}

	}

	@Override
	public void addRow(IRow row, int rowNum) {

		synchronized (table) {
			table.addRow(row, rowNum);
		}

	}

	@Override
	public void modifyRow(int rowNum, IRow row) {

		synchronized (table.getRow(rowNum)) {
			table.addRow(row, rowNum);
		}

	}

	@Override
	public void deleteRow(int rowNum) {
		synchronized (table.getRow(rowNum)) {
			table.deleteRow(rowNum);
		}

	}

}
