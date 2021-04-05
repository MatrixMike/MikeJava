/*
 * DateTime2.java
 * 
 * Copyright 2021  <pi@raspberrypi>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
 // 05.04.2021 16:07:13
 // https://stackabuse.com/how-to-get-current-date-and-time-in-java/
 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.format.FormatStyle;

public class DateTime2 {
	
	public static void main (String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now(); // Gets the current date and time	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");  // ("dd-MM-yyyy")   ("HH:mm:ss")
//		System.out.println(date.format(formatter));	
		System.out.println(localDateTime
			.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG))  // was MEDIUM 
//			.withLocale(Locale.UK)
			);

	}
}

