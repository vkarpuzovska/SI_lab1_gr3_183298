enum Tax
{
	A=18;
	B=5;
	C=0;

}
class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
    Tax tax;
	//TODO constructor
	public Item(int id; String name; double price; Tax tax)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.tax=tax;
	}

	//TODO setters and getters


	public double getPrice() {
		return price;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public Tax getTax() {
		return tax;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}



	double taxReturn (double price, Tax tax) {
		//TODO
		double ddv=0;
		switch(tax)
		{ case A:
				ddv=(tax/100)*price;
				return 0.15*ddv;
			case B:
				ddv=(tax/100)*price;
				return 0.15*ddv;

			case C:
				return ddv=price;
			return 0.15*ddv;

		}
	}
}