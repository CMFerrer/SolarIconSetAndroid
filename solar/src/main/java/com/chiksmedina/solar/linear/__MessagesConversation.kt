package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.messagesconversation.ChatDots
import com.chiksmedina.solar.linear.messagesconversation.ChatLine
import com.chiksmedina.solar.linear.messagesconversation.ChatRound
import com.chiksmedina.solar.linear.messagesconversation.ChatRoundCall
import com.chiksmedina.solar.linear.messagesconversation.ChatRoundCheck
import com.chiksmedina.solar.linear.messagesconversation.ChatRoundDots
import com.chiksmedina.solar.linear.messagesconversation.ChatRoundLike
import com.chiksmedina.solar.linear.messagesconversation.ChatRoundLine
import com.chiksmedina.solar.linear.messagesconversation.ChatRoundMoney
import com.chiksmedina.solar.linear.messagesconversation.ChatRoundUnread
import com.chiksmedina.solar.linear.messagesconversation.ChatRoundVideo
import com.chiksmedina.solar.linear.messagesconversation.ChatSquare
import com.chiksmedina.solar.linear.messagesconversation.ChatSquareArrow
import com.chiksmedina.solar.linear.messagesconversation.ChatSquareCall
import com.chiksmedina.solar.linear.messagesconversation.ChatSquareCheck
import com.chiksmedina.solar.linear.messagesconversation.ChatSquareCode
import com.chiksmedina.solar.linear.messagesconversation.ChatSquareLike
import com.chiksmedina.solar.linear.messagesconversation.ChatUnread
import com.chiksmedina.solar.linear.messagesconversation.CheckRead
import com.chiksmedina.solar.linear.messagesconversation.Dialog
import com.chiksmedina.solar.linear.messagesconversation.Dialog2
import com.chiksmedina.solar.linear.messagesconversation.Forward
import com.chiksmedina.solar.linear.messagesconversation.Inbox
import com.chiksmedina.solar.linear.messagesconversation.InboxArchive
import com.chiksmedina.solar.linear.messagesconversation.InboxIn
import com.chiksmedina.solar.linear.messagesconversation.InboxLine
import com.chiksmedina.solar.linear.messagesconversation.InboxOut
import com.chiksmedina.solar.linear.messagesconversation.InboxUnread
import com.chiksmedina.solar.linear.messagesconversation.Letter
import com.chiksmedina.solar.linear.messagesconversation.LetterOpened
import com.chiksmedina.solar.linear.messagesconversation.LetterUnread
import com.chiksmedina.solar.linear.messagesconversation.Mailbox
import com.chiksmedina.solar.linear.messagesconversation.MultipleForwardLeft
import com.chiksmedina.solar.linear.messagesconversation.MultipleForwardRight
import com.chiksmedina.solar.linear.messagesconversation.Paperclip
import com.chiksmedina.solar.linear.messagesconversation.Paperclip2
import com.chiksmedina.solar.linear.messagesconversation.PaperclipRounded
import com.chiksmedina.solar.linear.messagesconversation.PaperclipRounded2
import com.chiksmedina.solar.linear.messagesconversation.Pen
import com.chiksmedina.solar.linear.messagesconversation.Pen2
import com.chiksmedina.solar.linear.messagesconversation.PenNewRound
import com.chiksmedina.solar.linear.messagesconversation.PenNewSquare
import com.chiksmedina.solar.linear.messagesconversation.Plain
import com.chiksmedina.solar.linear.messagesconversation.Plain2
import com.chiksmedina.solar.linear.messagesconversation.Plain3
import com.chiksmedina.solar.linear.messagesconversation.SquareForward
import com.chiksmedina.solar.linear.messagesconversation.SquareShareLine
import com.chiksmedina.solar.linear.messagesconversation.Unread
import kotlin.collections.List as ____KtList

public object MessagesConversationGroup

public val LinearGroup.MessagesConversation: MessagesConversationGroup
  get() = MessagesConversationGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MessagesConversationGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(ChatDots, ChatLine, ChatRound, ChatRoundCall, ChatRoundCheck, ChatRoundDots,
        ChatRoundLike, ChatRoundLine, ChatRoundMoney, ChatRoundUnread, ChatRoundVideo,
        ChatSquareLike, ChatUnread, ChatSquare, ChatSquareArrow, ChatSquareCall, ChatSquareCheck,
        ChatSquareCode, CheckRead, Dialog, Dialog2, Forward, Inbox, InboxArchive, InboxIn,
        InboxLine, InboxOut, InboxUnread, Letter, LetterOpened, LetterUnread, Mailbox,
        MultipleForwardLeft, MultipleForwardRight, Paperclip, Paperclip2, PaperclipRounded,
        PaperclipRounded2, Pen, Pen2, PenNewRound, PenNewSquare, Plain, Plain2, Plain3,
        SquareForward, SquareShareLine, Unread)
    return __AllIcons!!
  }
