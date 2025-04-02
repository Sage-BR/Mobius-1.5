/*
 * Copyright (c) 2013 L2jMobius
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR
 * IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.l2jmobius.log.formatter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

import org.l2jmobius.commons.util.StringUtil;

public class FileLogFormatter extends Formatter
{
	private static final String TAB = "\t";
	
	private final SimpleDateFormat _dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss,SSS");
	
	@Override
	public String format(LogRecord record)
	{
		// Java 1.8
		// return StringUtil.concat(_dateFormat.format(new Date(record.getMillis())), TAB, record.getLevel().getName(), TAB, String.valueOf(record.getThreadID()), TAB, record.getLoggerName(), TAB, record.getMessage(), System.lineSeparator());
		// Java 16
		return StringUtil.concat(_dateFormat.format(new Date(record.getMillis())), TAB, record.getLevel().getName(), TAB, String.valueOf(record.getLongThreadID()), TAB, record.getLoggerName(), TAB, record.getMessage(), System.lineSeparator());
	}
}
