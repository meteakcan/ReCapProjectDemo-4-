package Concrete;

import Abstract.UserService;
import Entity.User;

public class UserManager implements UserService{


	
	@Override
	public void register(User user) {
		Validation validation = new Validation();
		if(validation.Validate(user) == true)
		{
			System.out.println("Kayit olma islemi basarili bir sekilde tamamlandi.");
		}
		else
		{
			System.out.println("Dogrulama hatasi");
		}
	}

	@Override
	public void updateUser(User user) {
		Validation validation = new Validation();
		if(validation.Validate(user) == true)
		{
			System.out.println("Basarili bir sekilde güncellendi.Yeni bilgileriniz :");
			System.out.println("Ad-Soyad : " + user.getFirstName() + " " + user.getLastName());
			System.out.println("Kimlik numaraniz : " + user.getIdentity());
			System.out.println("Dogum tarihiniz : " + user.getBirthYear());
		}
		else
		{
			System.out.println("Güncelleme isinde hata meydana geldi.Bir kismi eksik yazmis olabilirsiniz.");
		}
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("Silindi!");
	}


}
