/**
 * Copyright (C) 2010 Hybitz.co.ltd
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 * 
 */
package jp.co.hybitz.common;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author ichy <ichylinux@gmail.com>
 */
public class StringUtils {
    
    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }
    
    public static boolean isNotEmpty(String s) {
        return ! isEmpty(s);
    }

    public static String urlEncode(String s, String enc) {
        try {
            return URLEncoder.encode(s, enc);
        }
        catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }
    
    public static String urlDecode(String s, String enc) {
        try {
            return URLDecoder.decode(s, enc);
        }
        catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }
}
