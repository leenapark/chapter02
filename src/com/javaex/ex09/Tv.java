package com.javaex.ex09;

public class Tv {
	
	//필드
	private boolean power;
	private int channel;
	private int volume;
	
	
	//기본 생성자 생략
	//--> 기본 생성자가 존재했으나 아래 생성자를 만들어줌으로써 사라짐
	
	//생성자
	//기본 초기화 생성
	public Tv(int channel, int volume, boolean power) {
		//case 1 : 볼륨과 채널 범위 체크없이 진행할 때
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public Tv() {} //불필요한 부분
	
	//메소드
	
	// void power(boolean on) 메소드 구현
		public void power( boolean on ) {
			if(on == true) {
				this.power = true;
			}else {
				this.power = false;
			}
		}
		
	//void channel(int channel) 1~255 유지
	public void channel(int channel) {
		if(power == true) {
			if(channel<1) {//복잡한 로직이 있을 수 잇음
				this.channel = 1;
			}else if(channel>255){
				this.channel = 255;
			}else {	
				this.channel = channel;
			}	
		}
	}
	
	// void channel(boolean up) 메소드 오버로딩 : 1씩 증감
		public void channel(boolean up) {
			if(up == true) {
				this.channel++;
			}else {
				this.channel--;
			}
		}
	// void volume(int volume) 메소드 구현 (0~100 유지)
		public void volume(int volume) {
			if(power == true) {
				if(volume<0) {
					this.volume = 0;
				}else if(volume>100){
					this.volume = 100;
				}else {
					this.volume = volume;
				}	
			}
		}
	// void volume(boolean up) 메소드 오버로딩: 1씩 증감
		public void volume(boolean up) {
			if(up == true) {
				this.volume++;
			}else if(up == false){
				this.volume--;
			}
		}
		
	//메소드 일반 : test toString
	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}

	
	//메소드 일반 : 출력
	public void status() {
		System.out.println("채널: " + channel + " 볼륨: " + volume + " 전원: " + power);
	}
	
	
	
}
