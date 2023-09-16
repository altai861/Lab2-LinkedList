import dataStructures.Chain;

public class MyChain extends Chain{
	public Object[] toArray() {
		Object arr[] = new Object[this.size()];
		
		for (int i = 0; i < this.size(); i++) {
			arr[i] = this.get(i);
		}
		
		return arr;
	}
	
	public void addRange(Object[] elements) {
		for (int i = 0; i < elements.length; i++) {
			this.add(this.size(), elements[i]);
		}
	}
	
	public MyChain union(MyChain chain) {
		MyChain result = new MyChain();
		
		for (int i = 0; i < this.size(); i++) {
			result.add(result.size(), this.get(i));
		}
		
		for (int i = 0; i < chain.size(); i++) {
			result.add(result.size(), chain.get(i));
		}
		
		return result;
	}
	
	public MyChain intersection(MyChain chain) {
		MyChain result = new MyChain();
		
		for (int i = 0; i < this.size(); i++) {
			for (int j = 0; j < chain.size(); j++) {
				if (this.get(i).equals(chain.get(j))) {
					result.add(result.size(), this.get(i));
				}
			}
		}
		
		return result;
	}
	
	
}
