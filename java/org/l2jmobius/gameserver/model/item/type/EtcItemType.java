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
package org.l2jmobius.gameserver.model.item.type;

/**
 * EtcItem Type enumerated.
 */
public enum EtcItemType implements ItemType
{
	NONE,
	SCROLL,
	ARROW,
	POTION,
	SPELLBOOK,
	RECIPE,
	MATERIAL,
	PET_COLLAR,
	CASTLE_GUARD,
	DYE,
	SEED,
	SEED2,
	HARVEST,
	LOTTO,
	RACE_TICKET,
	TICKET_OF_LORD,
	LURE,
	CROP,
	MATURECROP,
	ENCHT_WP,
	ENCHT_AM,
	GIANT_ENCHT_WP,
	GIANT_ENCHT_AM,
	BLESS_ENCHT_WP,
	BLESS_ENCHT_AM,
	BLESS_ENCHT_AM_DOWN,
	COUPON,
	ELIXIR,
	ENCHT_ATTR,
	ENCHT_ATTR_CURSED,
	BOLT,
	ENCHT_ATTR_INC_PROP_ENCHT_WP,
	ENCHT_ATTR_INC_PROP_ENCHT_AM,
	BLESSED_ENCHT_ATTR_INC_PROP_ENCHT_WP,
	BLESSED_ENCHT_ATTR_INC_PROP_ENCHT_AM,
	BLESSED_GIANT_ENCHT_ATTR_INC_PROP_ENCHT_WP,
	BLESSED_GIANT_ENCHT_ATTR_INC_PROP_ENCHT_AM,
	GIANT_ENCHT_ATTR_INC_PROP_ENCHT_WP,
	GIANT_ENCHT_ATTR_INC_PROP_ENCHT_AM,
	ENCHT_ATTR_CRYSTAL_ENCHANT_AM,
	ENCHT_ATTR_CRYSTAL_ENCHANT_WP,
	ENCHT_ATTR_ANCIENT_CRYSTAL_ENCHANT_AM,
	ENCHT_ATTR_ANCIENT_CRYSTAL_ENCHANT_WP,
	ENCHT_ATTR_RUNE,
	ENCHT_ATTRT_RUNE_SELECT,
	TELEPORTBOOKMARK,
	CHANGE_ATTR,
	SOULSHOT,
	SHAPE_SHIFTING_WP,
	BLESS_SHAPE_SHIFTING_WP,
	// EIT_RESTORE_SHAPE_SHIFTING_WP,
	SHAPE_SHIFTING_WP_FIXED,
	SHAPE_SHIFTING_AM,
	BLESS_SHAPE_SHIFTING_AM,
	SHAPE_SHIFTING_AM_FIXED,
	SHAPE_SHIFTING_HAIRACC,
	BLESS_SHAPE_SHIFTING_HAIRACC,
	SHAPE_SHIFTING_HAIRACC_FIXED,
	RESTORE_SHAPE_SHIFTING_WP,
	RESTORE_SHAPE_SHIFTING_AM,
	RESTORE_SHAPE_SHIFTING_HAIRACC,
	RESTORE_SHAPE_SHIFTING_ALLITEM,
	BLESS_INC_PROP_ENCHT_WP,
	BLESS_INC_PROP_ENCHT_AM,
	CARD_EVENT,
	SHAPE_SHIFTING_ALLITEM_FIXED,
	MULTI_ENCHT_WP,
	MULTI_ENCHT_AM,
	MULTI_INC_PROB_ENCHT_WP,
	MULTI_INC_PROB_ENCHT_AM,
	SOUL_CRYSTAL,
	ENSOUL_STONE;
	
	/**
	 * @return the ID of the item after applying the mask.
	 */
	@Override
	public int mask()
	{
		return 0;
	}
}
