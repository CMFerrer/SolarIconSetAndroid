package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.messagesconversation.ChatDots
import com.chiksmedina.solar.broken.messagesconversation.ChatLine
import com.chiksmedina.solar.broken.messagesconversation.ChatRound
import com.chiksmedina.solar.broken.messagesconversation.ChatRoundCall
import com.chiksmedina.solar.broken.messagesconversation.ChatRoundCheck
import com.chiksmedina.solar.broken.messagesconversation.ChatRoundDots
import com.chiksmedina.solar.broken.messagesconversation.ChatRoundLike
import com.chiksmedina.solar.broken.messagesconversation.ChatRoundLine
import com.chiksmedina.solar.broken.messagesconversation.ChatRoundMoney
import com.chiksmedina.solar.broken.messagesconversation.ChatRoundUnread
import com.chiksmedina.solar.broken.messagesconversation.ChatRoundVideo
import com.chiksmedina.solar.broken.messagesconversation.ChatSquare
import com.chiksmedina.solar.broken.messagesconversation.ChatSquareArrow
import com.chiksmedina.solar.broken.messagesconversation.ChatSquareCall
import com.chiksmedina.solar.broken.messagesconversation.ChatSquareCheck
import com.chiksmedina.solar.broken.messagesconversation.ChatSquareCode
import com.chiksmedina.solar.broken.messagesconversation.ChatSquareLike
import com.chiksmedina.solar.broken.messagesconversation.ChatUnread
import com.chiksmedina.solar.broken.messagesconversation.CheckRead
import com.chiksmedina.solar.broken.messagesconversation.Dialog
import com.chiksmedina.solar.broken.messagesconversation.Dialog2
import com.chiksmedina.solar.broken.messagesconversation.Forward
import com.chiksmedina.solar.broken.messagesconversation.Inbox
import com.chiksmedina.solar.broken.messagesconversation.InboxArchive
import com.chiksmedina.solar.broken.messagesconversation.InboxIn
import com.chiksmedina.solar.broken.messagesconversation.InboxLine
import com.chiksmedina.solar.broken.messagesconversation.InboxOut
import com.chiksmedina.solar.broken.messagesconversation.InboxUnread
import com.chiksmedina.solar.broken.messagesconversation.Letter
import com.chiksmedina.solar.broken.messagesconversation.LetterOpened
import com.chiksmedina.solar.broken.messagesconversation.LetterUnread
import com.chiksmedina.solar.broken.messagesconversation.Mailbox
import com.chiksmedina.solar.broken.messagesconversation.MultipleForwardLeft
import com.chiksmedina.solar.broken.messagesconversation.MultipleForwardRight
import com.chiksmedina.solar.broken.messagesconversation.Paperclip
import com.chiksmedina.solar.broken.messagesconversation.Paperclip2
import com.chiksmedina.solar.broken.messagesconversation.PaperclipRounded
import com.chiksmedina.solar.broken.messagesconversation.PaperclipRounded2
import com.chiksmedina.solar.broken.messagesconversation.Pen
import com.chiksmedina.solar.broken.messagesconversation.Pen2
import com.chiksmedina.solar.broken.messagesconversation.PenNewRound
import com.chiksmedina.solar.broken.messagesconversation.PenNewSquare
import com.chiksmedina.solar.broken.messagesconversation.Plain
import com.chiksmedina.solar.broken.messagesconversation.Plain2
import com.chiksmedina.solar.broken.messagesconversation.Plain3
import com.chiksmedina.solar.broken.messagesconversation.SquareForward
import com.chiksmedina.solar.broken.messagesconversation.SquareShareLine
import com.chiksmedina.solar.broken.messagesconversation.Unread
import kotlin.collections.List as KtList

object MessagesConversationGroup

val BrokenSolar.MessagesConversation: MessagesConversationGroup
    get() = MessagesConversationGroup

private var _AllIcons: KtList<ImageVector>? = null

val MessagesConversationGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            ChatDots,
            ChatLine,
            ChatRound,
            ChatRoundCall,
            ChatRoundCheck,
            ChatRoundDots,
            ChatRoundLike,
            ChatRoundLine,
            ChatRoundMoney,
            ChatRoundUnread,
            ChatRoundVideo,
            ChatUnread,
            ChatSquare,
            ChatSquareArrow,
            ChatSquareCall,
            ChatSquareCheck,
            ChatSquareCode,
            ChatSquareLike,
            CheckRead,
            Dialog,
            Dialog2,
            Forward,
            Inbox,
            InboxArchive,
            InboxIn,
            InboxLine,
            InboxOut,
            InboxUnread,
            Letter,
            LetterOpened,
            LetterUnread,
            Mailbox,
            MultipleForwardLeft,
            MultipleForwardRight,
            Paperclip,
            Paperclip2,
            PaperclipRounded,
            PaperclipRounded2,
            Pen,
            Pen2,
            PenNewRound,
            PenNewSquare,
            Plain,
            Plain2,
            Plain3,
            SquareForward,
            SquareShareLine,
            Unread
        )
        return _AllIcons!!
    }
