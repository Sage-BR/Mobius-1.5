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
package org.l2jmobius.gameserver.enums;

/**
 * @author Mobius
 */
public enum BroochJewel
{
	RUBY_LV1(70451, 17817, 1, 0.02, true, false),
	RUBY_LV2(70452, 17817, 1, 0.03, true, false),
	RUBY_LV3(70453, 17817, 1, 0.05, true, false),
	RUBY_LV4(70454, 17817, 1, 0.08, true, false),
	RUBY_LV5(70455, 17817, 1, 0.16, true, false),
	GREATER_RUBY_LV1(71368, 17817, 1, 0.17, true, false), // + 1% p atk
	GREATER_RUBY_LV2(71369, 17817, 1, 0.18, true, false), // + 2% p atk
	GREATER_RUBY_LV3(71370, 17817, 1, 0.19, true, false), // + 3% p atk
	GREATER_RUBY_LV4(71371, 17817, 1, 0.20, true, false), // + 5% p atk
	GREATER_RUBY_LV5(71372, 17817, 1, 0.20, true, false), // + 7% p atk + crit. p. rate +10%
	
	SAPPHIRE_LV1(70456, 17821, 1, 0.02, false, true),
	SAPPHIRE_LV2(70457, 17821, 1, 0.03, false, true),
	SAPPHIRE_LV3(70458, 17821, 1, 0.05, false, true),
	SAPPHIRE_LV4(70459, 17821, 1, 0.08, false, true),
	SAPPHIRE_LV5(70460, 17821, 1, 0.16, false, true),
	GREATER_SAPPHIRE_LV1(71373, 17821, 1, 00.17, false, true), // + 2 % m attack
	GREATER_SAPPHIRE_LV2(71374, 17821, 1, 00.18, false, true), // + 4 % m attack
	GREATER_SAPPHIRE_LV3(71375, 17821, 1, 00.19, false, true), // + 6 % m attack
	GREATER_SAPPHIRE_LV4(71376, 17821, 1, 00.20, false, true), // + 10 % m attack
	GREATER_SAPPHIRE_LV5(71377, 17821, 1, 00.20, false, true); // + 14 % m attack + crit. m. rate +10%
	
	private final int _itemId;
	private final int _skillId;
	private final int _skillLevel;
	private final double _bonus;
	private final boolean _isRuby;
	private final boolean _isSapphire;
	
	private BroochJewel(int itemId, int skillId, int skillLevel, double bonus, boolean isRuby, boolean isSapphire)
	{
		_itemId = itemId;
		_skillId = skillId;
		_skillLevel = skillLevel;
		_bonus = bonus;
		_isRuby = isRuby;
		_isSapphire = isSapphire;
	}
	
	public int getItemId()
	{
		return _itemId;
	}
	
	public int getSkillId()
	{
		return _skillId;
	}
	
	public int getSkillLevel()
	{
		return _skillLevel;
	}
	
	public double getBonus()
	{
		return _bonus;
	}
	
	public boolean isRuby()
	{
		return _isRuby;
	}
	
	public boolean isSapphire()
	{
		return _isSapphire;
	}
}
