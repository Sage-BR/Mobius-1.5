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
package org.l2jmobius.gameserver.model.vip;

/**
 * @author marciox25
 */
public class VipInfo
{
	private final byte _tier;
	private final long _pointsRequired;
	private final long _pointsDepreciated;
	private float _silverCoinChance;
	private float _goldCoinChance;
	private int _skill;
	
	public VipInfo(byte tier, long pointsRequired, long pointsDepreciated)
	{
		_tier = tier;
		_pointsRequired = pointsRequired;
		_pointsDepreciated = pointsDepreciated;
	}
	
	public byte getTier()
	{
		return _tier;
	}
	
	public long getPointsRequired()
	{
		return _pointsRequired;
	}
	
	public long getPointsDepreciated()
	{
		return _pointsDepreciated;
	}
	
	public int getSkill()
	{
		return _skill;
	}
	
	public void setSkill(int skill)
	{
		_skill = skill;
	}
	
	public void setSilverCoinChance(float silverCoinChance)
	{
		_silverCoinChance = silverCoinChance;
	}
	
	public float getSilverCoinChance()
	{
		return _silverCoinChance;
	}
	
	public void setGoldCoinChance(float goldCoinChance)
	{
		_goldCoinChance = goldCoinChance;
	}
	
	public float getGoldCoinChance()
	{
		return _goldCoinChance;
	}
}
