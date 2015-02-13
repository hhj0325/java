package com.hhj.test.duck;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	JFrame frame;
	
	public static void main(String[] args){
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go(){
		frame = new JFrame();
		JButton button = new JButton("should i do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER,button);
		frame.setBounds(0, 0, 300, 300);
		frame.setVisible(true);
	}
	
	class AngelListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("no~~~~~");	
		}
	}
	
	class DevilListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("come on do it");	
		}
		
	}

}
