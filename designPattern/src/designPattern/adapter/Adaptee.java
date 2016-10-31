package designPattern.adapter;

public class Adaptee implements Adaptees{
	
	String[] str=new String[10];
	int index;
	
	public void add(String strg){
		if(index>str.length){
			String[] str1=new String[str.length];
			for(int i=0;i<str.length;i++){
				str1[i]=str[i];
			}
			str=new String[(int)(str.length*1.5)];
			for(int i=0;i<str.length;i++){
				str[i]=str1[i];
			}
			str1=null;
		}
		
		this.str[index]=strg;
		index++;
	}
	
	public void remove(int pos){
		for(int i=pos;i<index;i++){
			str[i]=str[i+1];
			
		}
		index--;
	}
	
	public String get(int pos){
		return str[pos];
	}
	
	public boolean empty(){
		return (str.length==0);
	}

	public int getEnd() {
		return index-1;
	}

}
