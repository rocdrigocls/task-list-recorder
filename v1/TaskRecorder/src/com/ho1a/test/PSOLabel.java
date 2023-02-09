package com.ho1a.test;

import javax.swing.JLabel;

public class PSOLabel extends JLabel implements Runnable{
	private int seg;
	private boolean running;
	public PSOLabel() {
		setText("00:00:00");
	}

	@Override
	public void run() {
		while(true){
			setText(getFormat(seg));
			seg++;
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
	
	private String getFormat(int segs){
		int _hours = segs / 3600;
		int _mins = (segs - (_hours * 3600)) / 60;
		int _segs = segs - ( (_mins * 60) + (_hours * 3600) ) ;
		return "" + (_hours > 9 ? "" : "0" ) + _hours + ":" + (_mins > 9 ? "" : "0" ) + _mins + ":" + (_segs > 9 ? "" : "0" ) +_segs;
	}
	
	public void reset(){
		seg = 0;
		if (!running) {
			new Thread(this).start();
			running = true;
		}
	}
}
