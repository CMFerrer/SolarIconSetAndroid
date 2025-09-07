package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldSolar
import com.chiksmedina.solar.bold.messagesconversation.ChatDots
import com.chiksmedina.solar.bold.messagesconversation.ChatLine
import com.chiksmedina.solar.bold.messagesconversation.ChatRound
import com.chiksmedina.solar.bold.messagesconversation.ChatRoundCall
import com.chiksmedina.solar.bold.messagesconversation.ChatRoundCheck
import com.chiksmedina.solar.bold.messagesconversation.ChatRoundDots
import com.chiksmedina.solar.bold.messagesconversation.ChatRoundLike
import com.chiksmedina.solar.bold.messagesconversation.ChatRoundLine
import com.chiksmedina.solar.bold.messagesconversation.ChatRoundMoney
import com.chiksmedina.solar.bold.messagesconversation.ChatRoundUnread
import com.chiksmedina.solar.bold.messagesconversation.ChatRoundVideo
import com.chiksmedina.solar.bold.messagesconversation.ChatSquare
import com.chiksmedina.solar.bold.messagesconversation.ChatSquareArrow
import com.chiksmedina.solar.bold.messagesconversation.ChatSquareCall
import com.chiksmedina.solar.bold.messagesconversation.ChatSquareCheck
import com.chiksmedina.solar.bold.messagesconversation.ChatSquareCode
import com.chiksmedina.solar.bold.messagesconversation.ChatSquareLike
import com.chiksmedina.solar.bold.messagesconversation.ChatUnread
import com.chiksmedina.solar.bold.messagesconversation.CheckRead
import com.chiksmedina.solar.bold.messagesconversation.Dialog
import com.chiksmedina.solar.bold.messagesconversation.Dialog2
import com.chiksmedina.solar.bold.messagesconversation.Forward
import com.chiksmedina.solar.bold.messagesconversation.Inbox
import com.chiksmedina.solar.bold.messagesconversation.InboxArchive
import com.chiksmedina.solar.bold.messagesconversation.InboxIn
import com.chiksmedina.solar.bold.messagesconversation.InboxLine
import com.chiksmedina.solar.bold.messagesconversation.InboxOut
import com.chiksmedina.solar.bold.messagesconversation.InboxUnread
import com.chiksmedina.solar.bold.messagesconversation.Letter
import com.chiksmedina.solar.bold.messagesconversation.LetterOpened
import com.chiksmedina.solar.bold.messagesconversation.LetterUnread
import com.chiksmedina.solar.bold.messagesconversation.Mailbox
import com.chiksmedina.solar.bold.messagesconversation.MultipleForwardLeft
import com.chiksmedina.solar.bold.messagesconversation.MultipleForwardRight
import com.chiksmedina.solar.bold.messagesconversation.Paperclip
import com.chiksmedina.solar.bold.messagesconversation.Paperclip2
import com.chiksmedina.solar.bold.messagesconversation.PaperclipRounded
import com.chiksmedina.solar.bold.messagesconversation.PaperclipRounded2
import com.chiksmedina.solar.bold.messagesconversation.Pen
import com.chiksmedina.solar.bold.messagesconversation.Pen2
import com.chiksmedina.solar.bold.messagesconversation.PenNewRound
import com.chiksmedina.solar.bold.messagesconversation.PenNewSquare
import com.chiksmedina.solar.bold.messagesconversation.Plain
import com.chiksmedina.solar.bold.messagesconversation.Plain2
import com.chiksmedina.solar.bold.messagesconversation.Plain3
import com.chiksmedina.solar.bold.messagesconversation.SquareForward
import com.chiksmedina.solar.bold.messagesconversation.SquareShareLine
import com.chiksmedina.solar.bold.messagesconversation.Unread
import kotlin.collections.List as KtList

object MessagesConversationGroup

val BoldSolar.MessagesConversation: MessagesConversationGroup
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
            ChatSquare,
            ChatSquareArrow,
            ChatSquareCall,
            ChatSquareCheck,
            ChatSquareCode,
            ChatSquareLike,
            ChatUnread,
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
