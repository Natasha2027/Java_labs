package bsu.rfe.java.group7.lab3.nazarenko.varA2;

import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
public class GornerTableModel extends AbstractTableModel {
	private Double[] coefficients;
	private Double from;
	private Double to;
	private Double step;

	public GornerTableModel(Double from, Double to, Double step, Double[] coefficients) {
		this.from = from;
		this.to = to;
		this.step = step;
		this.setCoefficients(coefficients);
	}

	public Double getFrom() {
		return from;
	}

	public Double getTo() {
		return to;
	}

	public Double getStep() {
		return step;
	}

	public int getColumnCount() {
		return 3; 
	}

	public int getRowCount() {
		return new Double(Math.ceil((to - from) / step)).intValue() + 1;
	}

	public Object getValueAt(int row, int col) {
		double x = from + step * row;
		
		Double result = 0.0;
        for (int i = coefficients.length - 1; i >= 0; i--) {
            result = result * x + coefficients[i];
        }
		Boolean result_inv = false;
		
		int num = result.intValue();
        if (num < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        if (sqrt * sqrt == num)
        	result_inv = true;
		
		switch(col) {
		case 0:
			return x;
		case 1:
	        return result;
		case 2:
	        return result_inv;
		}
		return 0;
	}

	public String getColumnName(int col) {
		switch (col) {
		case 0:
			return "Значение X";
		case 1:
			return "Значение многочлена";
		case 2:
			return "Целая часть квадрат?";
		}
		return null;
	}

	public Class<?> getColumnClass(int col) {
		if (col == 2)
			return Boolean.class;
		else
			return Double.class;
	}

	public Double[] getCoefficients() {
		return coefficients;
	}

	public void setCoefficients(Double[] coefficients) {
		this.coefficients = coefficients;
	}
}
