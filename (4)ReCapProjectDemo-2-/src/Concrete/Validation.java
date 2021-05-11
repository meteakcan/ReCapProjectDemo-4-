package Concrete;

import Entity.User;

public class Validation{ 
	
	public boolean Validate(User user) {
		/*
		Burada normalde is kodlari olur ama ben cok fazla ugrasmamak icin basit
		bir if-else blogu ile gecistirdim.(Kimlik no'sunun uzunlugu 11 karakterden az ise)
		yanlistir.
		*/
		if(user.getIdentity().length() < 11 || user.getBirthYear() > 2021)
		{
			System.out.println("Böyle bir kullanici mumkun olamaz.");
			return false;
		}
		else
		{
			return true;
		}
	}
}
