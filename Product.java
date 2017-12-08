package echarts;

public class Product {
	private String name; // 类别名称
	private int num; // 销量

	public Product() {
	}

	public Product(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
