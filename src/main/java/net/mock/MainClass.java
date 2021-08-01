package net.mock;

import java.sql.Date;

public class MainClass {

	  public static void main(String[] args) {
	    java.util.Date utilDate = new java.util.Date();
	    Date untilDate1 = new Date(utilDate.getYear(),utilDate.getMonth(),utilDate.getDate());
	    System.out.println("utilDate:" + untilDate1);


	  }

	}