/*
 * This file is part of the L2J Mobius project.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.l2jmobius.gameserver.model.actor.holders.npc;

import org.l2jmobius.gameserver.model.Location;

/**
 * @author UnAfraid
 */
public class ChanceLocation extends Location
{
	private final double _chance;
	
	public ChanceLocation(int x, int y, int z, int heading, double chance)
	{
		super(x, y, z, heading);
		_chance = chance;
	}
	
	public double getChance()
	{
		return _chance;
	}
}
