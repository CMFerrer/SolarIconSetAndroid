package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.messagesconversation.ChatDots
import com.chiksmedina.solar.outline.messagesconversation.ChatLine
import com.chiksmedina.solar.outline.messagesconversation.ChatRound
import com.chiksmedina.solar.outline.messagesconversation.ChatRoundCall
import com.chiksmedina.solar.outline.messagesconversation.ChatRoundCheck
import com.chiksmedina.solar.outline.messagesconversation.ChatRoundDots
import com.chiksmedina.solar.outline.messagesconversation.ChatRoundLike
import com.chiksmedina.solar.outline.messagesconversation.ChatRoundLine
import com.chiksmedina.solar.outline.messagesconversation.ChatRoundMoney
import com.chiksmedina.solar.outline.messagesconversation.ChatRoundUnread
import com.chiksmedina.solar.outline.messagesconversation.ChatRoundVideo
import com.chiksmedina.solar.outline.messagesconversation.ChatSquare
import com.chiksmedina.solar.outline.messagesconversation.ChatSquareArrow
import com.chiksmedina.solar.outline.messagesconversation.ChatSquareCall
import com.chiksmedina.solar.outline.messagesconversation.ChatSquareCheck
import com.chiksmedina.solar.outline.messagesconversation.ChatSquareCode
import com.chiksmedina.solar.outline.messagesconversation.ChatSquareLike
import com.chiksmedina.solar.outline.messagesconversation.ChatUnread
import com.chiksmedina.solar.outline.messagesconversation.CheckRead
import com.chiksmedina.solar.outline.messagesconversation.Dialog
import com.chiksmedina.solar.outline.messagesconversation.Dialog2
import com.chiksmedina.solar.outline.messagesconversation.Forward
import com.chiksmedina.solar.outline.messagesconversation.Inbox
import com.chiksmedina.solar.outline.messagesconversation.InboxArchive
import com.chiksmedina.solar.outline.messagesconversation.InboxIn
import com.chiksmedina.solar.outline.messagesconversation.InboxLine
import com.chiksmedina.solar.outline.messagesconversation.InboxOut
import com.chiksmedina.solar.outline.messagesconversation.InboxUnread
import com.chiksmedina.solar.outline.messagesconversation.Letter
import com.chiksmedina.solar.outline.messagesconversation.LetterOpened
import com.chiksmedina.solar.outline.messagesconversation.LetterUnread
import com.chiksmedina.solar.outline.messagesconversation.Mailbox
import com.chiksmedina.solar.outline.messagesconversation.MultipleForwardLeft
import com.chiksmedina.solar.outline.messagesconversation.MultipleForwardRight
import com.chiksmedina.solar.outline.messagesconversation.Paperclip
import com.chiksmedina.solar.outline.messagesconversation.Paperclip2
import com.chiksmedina.solar.outline.messagesconversation.PaperclipRounded
import com.chiksmedina.solar.outline.messagesconversation.PaperclipRounded2
import com.chiksmedina.solar.outline.messagesconversation.Pen
import com.chiksmedina.solar.outline.messagesconversation.Pen2
import com.chiksmedina.solar.outline.messagesconversation.PenNewRound
import com.chiksmedina.solar.outline.messagesconversation.PenNewSquare
import com.chiksmedina.solar.outline.messagesconversation.Plain
import com.chiksmedina.solar.outline.messagesconversation.Plain2
import com.chiksmedina.solar.outline.messagesconversation.Plain3
import com.chiksmedina.solar.outline.messagesconversation.SquareForward
import com.chiksmedina.solar.outline.messagesconversation.SquareShareLine
import com.chiksmedina.solar.outline.messagesconversation.Unread
import kotlin.collections.List as ____KtList

public object MessagesConversationGroup

public val OutlineGroup.MessagesConversation: MessagesConversationGroup
  get() = MessagesConversationGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MessagesConversationGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(ChatDots, ChatLine, ChatRound, ChatRoundCall, ChatRoundCheck, ChatRoundDots,
        ChatRoundLike, ChatRoundLine, ChatRoundMoney, ChatRoundUnread, ChatRoundVideo, ChatSquare,
        ChatSquareArrow, ChatSquareCall, ChatSquareCheck, ChatSquareCode, ChatSquareLike,
        ChatUnread, CheckRead, Dialog, Dialog2, Forward, Inbox, InboxArchive, InboxIn, InboxLine,
        InboxOut, InboxUnread, Letter, LetterOpened, LetterUnread, Mailbox, MultipleForwardLeft,
        MultipleForwardRight, Paperclip, Paperclip2, PaperclipRounded, PaperclipRounded2, Pen, Pen2,
        PenNewRound, PenNewSquare, Plain, Plain2, Plain3, SquareForward, SquareShareLine, Unread)
    return __AllIcons!!
  }
