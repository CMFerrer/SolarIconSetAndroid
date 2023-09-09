package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatDots
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatLine
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatRound
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatRoundCall
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatRoundCheck
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatRoundDots
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatRoundLike
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatRoundLine
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatRoundMoney
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatRoundUnread
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatRoundVideo
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatSquare
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatSquareArrow
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatSquareCall
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatSquareCheck
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatSquareCode
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatSquareLike
import com.chiksmedina.solar.lineduotone.messagesconversation.ChatUnread
import com.chiksmedina.solar.lineduotone.messagesconversation.CheckRead
import com.chiksmedina.solar.lineduotone.messagesconversation.Dialog
import com.chiksmedina.solar.lineduotone.messagesconversation.Dialog2
import com.chiksmedina.solar.lineduotone.messagesconversation.Forward
import com.chiksmedina.solar.lineduotone.messagesconversation.Inbox
import com.chiksmedina.solar.lineduotone.messagesconversation.InboxArchive
import com.chiksmedina.solar.lineduotone.messagesconversation.InboxIn
import com.chiksmedina.solar.lineduotone.messagesconversation.InboxLine
import com.chiksmedina.solar.lineduotone.messagesconversation.InboxOut
import com.chiksmedina.solar.lineduotone.messagesconversation.InboxUnread
import com.chiksmedina.solar.lineduotone.messagesconversation.Letter
import com.chiksmedina.solar.lineduotone.messagesconversation.LetterOpened
import com.chiksmedina.solar.lineduotone.messagesconversation.LetterUnread
import com.chiksmedina.solar.lineduotone.messagesconversation.Mailbox
import com.chiksmedina.solar.lineduotone.messagesconversation.MultipleForwardLeft
import com.chiksmedina.solar.lineduotone.messagesconversation.MultipleForwardRight
import com.chiksmedina.solar.lineduotone.messagesconversation.Paperclip
import com.chiksmedina.solar.lineduotone.messagesconversation.Paperclip2
import com.chiksmedina.solar.lineduotone.messagesconversation.PaperclipRounded
import com.chiksmedina.solar.lineduotone.messagesconversation.PaperclipRounded2
import com.chiksmedina.solar.lineduotone.messagesconversation.Pen
import com.chiksmedina.solar.lineduotone.messagesconversation.Pen2
import com.chiksmedina.solar.lineduotone.messagesconversation.PenNewRound
import com.chiksmedina.solar.lineduotone.messagesconversation.PenNewSquare
import com.chiksmedina.solar.lineduotone.messagesconversation.Plain
import com.chiksmedina.solar.lineduotone.messagesconversation.Plain2
import com.chiksmedina.solar.lineduotone.messagesconversation.Plain3
import com.chiksmedina.solar.lineduotone.messagesconversation.SquareForward
import com.chiksmedina.solar.lineduotone.messagesconversation.SquareShareLine
import com.chiksmedina.solar.lineduotone.messagesconversation.Unread
import kotlin.collections.List as ____KtList

public object MessagesConversationGroup

public val LineduotoneGroup.MessagesConversation: MessagesConversationGroup
  get() = MessagesConversationGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MessagesConversationGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(ChatDots, ChatLine, ChatRound, ChatRoundCall, ChatRoundCheck, ChatRoundDots,
        ChatRoundLike, ChatRoundLine, ChatRoundMoney, ChatRoundUnread, ChatRoundVideo, ChatUnread,
        ChatSquare, ChatSquareArrow, ChatSquareCall, ChatSquareCheck, ChatSquareCode,
        ChatSquareLike, CheckRead, Dialog, Dialog2, Forward, Inbox, InboxArchive, InboxIn,
        InboxLine, InboxOut, InboxUnread, Letter, LetterOpened, LetterUnread, Mailbox,
        MultipleForwardLeft, MultipleForwardRight, Paperclip, Paperclip2, PaperclipRounded,
        PaperclipRounded2, Pen, Pen2, PenNewRound, PenNewSquare, Plain, Plain2, Plain3,
        SquareForward, SquareShareLine, Unread)
    return __AllIcons!!
  }
