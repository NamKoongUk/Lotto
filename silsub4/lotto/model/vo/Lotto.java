package com.kh.silsub4.lotto.model.vo;

import java.util.Random;

public class Lotto {

	private int[] lotto = new int[6];

	{
		//로또 배열 할당
		
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = new Random().nextInt(45)+1;
			for(int j=0; j<i; j++) {	
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		int temp=0;
		for(int i=1; i<lotto.length; i++) {
			for(int j=0; j<lotto.length; j++) {
				if(lotto[i] < lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
	}


	public Lotto() {}

	
	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}

	public int[] getLotto() {
		return lotto;
	}

	public void information() {


		for(int i=0; i<lotto.length; i++) {
			if(lotto[i] <10) {
				System.out.print("0"+ lotto[i] + " ");
			}else {
				System.out.print(lotto[i] + " ");
				
			}
		}
 
	}





}
