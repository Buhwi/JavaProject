package work06Dic;

public class Dictionary extends PairMap{
	private int i = 0;
	public Dictionary(int lenght) {
		super.keyArray = new String[lenght];
		super.valueArray = new String[lenght];
	}
	
	String get(String key) {
		for(int n = 0; n < i; n++) {
			if(super.keyArray[n].equals(key)) {
				return valueArray[n];
			}
		}
		return null;
	}

	void put(String key, String value) {
		boolean flag = true;
		
		for(int n = 0; n < i; n++) {
			if(super.keyArray[n].equals(key)) {
				valueArray[n] = value;
				flag = false;
				
			}
		}
		
		if(flag == true) {
			super.keyArray[i] = key;
			super.valueArray[i] = value;
			i = i + 1;
		}
		
		
	}

	String delete(String key) {
		for(int n = 0; n < i; n++) {
			if(super.keyArray[n].equals(key)) {
				String temp = valueArray[n];
				valueArray[n] = null;
				keyArray[n] = null;
				i = i - 1;
				return temp;
			}
		}
		return null;
	}

	int length() {
		return i - 1;
	}

}
