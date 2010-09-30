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
package jp.co.hybitz.timetable.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Area implements Serializable {
    private String name;
    private String url;
    private List<Prefecture> prefectures = new ArrayList<Prefecture>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public List<Prefecture> getPrefectures() {
        return prefectures;
    }
    
    public void addPrefecture(Prefecture prefecture) {
        prefectures.add(prefecture);
    }
    
    public void setPrefectures(List<Prefecture> prefectures) {
        this.prefectures = prefectures;
    }

    public Prefecture getPrefecture(String name) {
        for (Iterator<Prefecture> it = prefectures.iterator(); it.hasNext();) {
            Prefecture p = it.next();
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }
}
