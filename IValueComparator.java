/*---

    iGeo - http://igeo.jp

    Copyright (c) 2002-2013 Satoru Sugihara

    This file is part of iGeo.

    iGeo is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as
    published by the Free Software Foundation, version 3.

    iGeo is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public
    License along with iGeo.  If not, see <http://www.gnu.org/licenses/>.

---*/

package igeo;

/**
   An interface to define comparator to be used in sorting with ISort.
   
   @see ISort
   
   @author Satoru Sugihara
*/
public abstract class IValueComparator<T> implements IComparator<T>{
    abstract public double value(T o);
    public int compare(T o1, T o2){ // return >0, <0, ==0
        double v1 = value(o1);
        double v2 = value(o2);
	if(v1>v2) return 1;
	if(v1<v2) return -1;
	return 0;
    }
}
