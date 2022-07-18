package net.devstudi.jre.lection02_inheritance_polymorph.home;

import net.devstudi.jre.lection02_inheritance_polymorph.LinkedList;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public class Queue extends DataStructure {

	public Queue() {
		super(new LinkedList());
	}
}
