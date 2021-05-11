package Concrete;

import Abstract.SellService;
import Entity.Sell;

public class SellManager implements SellService{

	@Override
	public void buy(Sell sell) {
		System.out.println("Satýn alma islemi basarili bir sekilde gerceklesti!");
		System.out.println("Satin aldiginiz oyun : " + sell.getGame().getName());
		System.out.println("Oyunu aldiginiz fiyat : " + sell.getGame().getPrice());
		System.out.println("Satis numaraniz : " + sell.getId());
	}

}
