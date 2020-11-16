public class Main {

	public static void main(String[] args) {
		Person();
	}

	public static void Person(){
	Person[] persArray = new Person[5];

	persArray[0] = new Person("Shubarkin Igor", "Engineer", "dotrinbo@mail.ru", "8(931)123 12 50)", 1000, 29);
	persArray[1] = new Person("Knyazev Dmitri", "EngineerHelper", "knyaz@mail.ru", "8(935)580 44 74", 40000, 26);
	persArray[2] = new Person("Egorov Egor", "EngineerNo", "egorov@mail.ru", "8(999)740 41 44", 50000, 41);
	persArray[3] = new Person("Trofimov Sergey", "EngineerDeputy", "trofimov@mail.ru", "8(955)220 47 22", 60000, 44);
	persArray[4] = new Person("Kolyada Sergey", "EngineerTop", "kolyada@mail.ru", "8(911)990 00 76", 70000, 50);

		for(Person item : persArray) {
		if(item.GetAge() > 40) item.Show();
		}
	}
}
