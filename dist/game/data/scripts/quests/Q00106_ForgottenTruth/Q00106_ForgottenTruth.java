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
package quests.Q00106_ForgottenTruth;

import org.l2jmobius.Config;
import org.l2jmobius.gameserver.model.actor.Npc;
import org.l2jmobius.gameserver.model.actor.Player;
import org.l2jmobius.gameserver.model.actor.enums.creature.Race;
import org.l2jmobius.gameserver.model.quest.Quest;
import org.l2jmobius.gameserver.model.quest.QuestSound;
import org.l2jmobius.gameserver.model.quest.QuestState;
import org.l2jmobius.gameserver.model.quest.State;
import org.l2jmobius.gameserver.network.serverpackets.SocialAction;
import org.l2jmobius.gameserver.util.LocationUtil;

/**
 * Forgotten Truth (106)
 * @author Janiko
 */
public class Q00106_ForgottenTruth extends Quest
{
	// NPCs
	private static final int THIFIELL = 30358;
	private static final int KARTA = 30133;
	// Monster
	private static final int TUMRAN_ORC_BRIGAND = 27070;
	// Items
	private static final int ONYX_TALISMAN1 = 984;
	private static final int ONYX_TALISMAN2 = 985;
	private static final int ANCIENT_SCROLL = 986;
	private static final int ANCIENT_CLAY_TABLET = 987;
	private static final int KARTAS_TRANSLATION = 988;
	// Reward
	private static final int REWARDS = 49049; // Eldritch Dagger (Novice)
	// Misc
	private static final int MIN_LEVEL = 10;
	private static final int MAX_LEVEL = 15;
	
	public Q00106_ForgottenTruth()
	{
		super(106);
		addStartNpc(THIFIELL);
		addTalkId(THIFIELL, KARTA);
		addKillId(TUMRAN_ORC_BRIGAND);
		registerQuestItems(KARTAS_TRANSLATION, ONYX_TALISMAN1, ONYX_TALISMAN2, ANCIENT_SCROLL, ANCIENT_CLAY_TABLET);
		addCondMaxLevel(MAX_LEVEL, "30358-02.htm");
	}
	
	@Override
	public String onEvent(String event, Npc npc, Player player)
	{
		final QuestState qs = getQuestState(player, false);
		String htmltext = null;
		if (qs == null)
		{
			return htmltext;
		}
		switch (event)
		{
			case "30358-04.htm":
			{
				htmltext = event;
				break;
			}
			case "30358-05.htm":
			{
				if (qs.isCreated())
				{
					qs.startQuest();
					giveItems(player, ONYX_TALISMAN1, 1);
					htmltext = event;
				}
				break;
			}
		}
		return htmltext;
	}
	
	@Override
	public void onKill(Npc npc, Player killer, boolean isSummon)
	{
		final QuestState qs = getQuestState(killer, false);
		if ((qs != null) && qs.isCond(2) && LocationUtil.checkIfInRange(Config.ALT_PARTY_RANGE, npc, killer, true) && (getRandom(100) < 20) && hasQuestItems(killer, ONYX_TALISMAN2))
		{
			if (!hasQuestItems(killer, ANCIENT_SCROLL))
			{
				giveItems(killer, ANCIENT_SCROLL, 1);
				playSound(killer, QuestSound.ITEMSOUND_QUEST_MIDDLE);
			}
			else if (!hasQuestItems(killer, ANCIENT_CLAY_TABLET))
			{
				qs.setCond(3, true);
				giveItems(killer, ANCIENT_CLAY_TABLET, 1);
			}
		}
	}
	
	@Override
	public String onTalk(Npc npc, Player talker)
	{
		final QuestState qs = getQuestState(talker, true);
		String htmltext = getNoQuestMsg(talker);
		
		switch (npc.getId())
		{
			case THIFIELL:
			{
				switch (qs.getState())
				{
					case State.CREATED:
					{
						if (talker.getRace() == Race.DARK_ELF)
						{
							htmltext = talker.getLevel() >= MIN_LEVEL ? "30358-03.htm" : "30358-02.htm";
						}
						else
						{
							htmltext = "30358-01.htm";
						}
						break;
					}
					case State.STARTED:
					{
						if (hasAtLeastOneQuestItem(talker, ONYX_TALISMAN1, ONYX_TALISMAN2) && !hasQuestItems(talker, KARTAS_TRANSLATION))
						{
							htmltext = "30358-06.html";
						}
						else if (qs.isCond(4) && hasQuestItems(talker, KARTAS_TRANSLATION))
						{
							// Q00281_HeadForTheHills.giveNewbieReward(talker);
							rewardItems(talker, REWARDS, 1);
							talker.sendPacket(new SocialAction(talker.getObjectId(), 3));
							qs.exitQuest(false, true);
							htmltext = "30358-07.html";
						}
						break;
					}
					case State.COMPLETED:
					{
						htmltext = getAlreadyCompletedMsg(talker);
						break;
					}
				}
				break;
			}
			case KARTA:
			{
				if (qs.isStarted())
				{
					switch (qs.getCond())
					{
						case 1:
						{
							if (hasQuestItems(talker, ONYX_TALISMAN1))
							{
								qs.setCond(2, true);
								takeItems(talker, ONYX_TALISMAN1, -1);
								giveItems(talker, ONYX_TALISMAN2, 1);
								htmltext = "30133-01.html";
							}
							break;
						}
						case 2:
						{
							if (hasQuestItems(talker, ONYX_TALISMAN2))
							{
								htmltext = "30133-02.html";
							}
							break;
						}
						case 3:
						{
							if (hasQuestItems(talker, ANCIENT_SCROLL, ANCIENT_CLAY_TABLET))
							{
								qs.setCond(4, true);
								takeItems(talker, -1, ANCIENT_SCROLL, ANCIENT_CLAY_TABLET, ONYX_TALISMAN2);
								giveItems(talker, KARTAS_TRANSLATION, 1);
								htmltext = "30133-03.html";
							}
							break;
						}
						case 4:
						{
							if (hasQuestItems(talker, KARTAS_TRANSLATION))
							{
								htmltext = "30133-04.html";
							}
							break;
						}
					}
				}
				break;
			}
		}
		return htmltext;
	}
}