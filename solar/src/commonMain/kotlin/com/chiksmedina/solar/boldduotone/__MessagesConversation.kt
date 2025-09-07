package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatDots
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatLine
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatRound
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatRoundCall
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatRoundCheck
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatRoundDots
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatRoundLike
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatRoundLine
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatRoundMoney
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatRoundUnread
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatRoundVideo
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatSquare
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatSquareArrow
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatSquareCall
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatSquareCheck
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatSquareCode
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatSquareLike
import com.chiksmedina.solar.boldduotone.messagesconversation.ChatUnread
import com.chiksmedina.solar.boldduotone.messagesconversation.CheckRead
import com.chiksmedina.solar.boldduotone.messagesconversation.Dialog
import com.chiksmedina.solar.boldduotone.messagesconversation.Dialog2
import com.chiksmedina.solar.boldduotone.messagesconversation.Forward
import com.chiksmedina.solar.boldduotone.messagesconversation.Inbox
import com.chiksmedina.solar.boldduotone.messagesconversation.InboxArchive
import com.chiksmedina.solar.boldduotone.messagesconversation.InboxIn
import com.chiksmedina.solar.boldduotone.messagesconversation.InboxLine
import com.chiksmedina.solar.boldduotone.messagesconversation.InboxOut
import com.chiksmedina.solar.boldduotone.messagesconversation.InboxUnread
import com.chiksmedina.solar.boldduotone.messagesconversation.Letter
import com.chiksmedina.solar.boldduotone.messagesconversation.LetterOpened
import com.chiksmedina.solar.boldduotone.messagesconversation.LetterUnread
import com.chiksmedina.solar.boldduotone.messagesconversation.Mailbox
import com.chiksmedina.solar.boldduotone.messagesconversation.MultipleForwardLeft
import com.chiksmedina.solar.boldduotone.messagesconversation.MultipleForwardRight
import com.chiksmedina.solar.boldduotone.messagesconversation.Paperclip
import com.chiksmedina.solar.boldduotone.messagesconversation.Paperclip2
import com.chiksmedina.solar.boldduotone.messagesconversation.PaperclipRounded
import com.chiksmedina.solar.boldduotone.messagesconversation.PaperclipRounded2
import com.chiksmedina.solar.boldduotone.messagesconversation.Pen
import com.chiksmedina.solar.boldduotone.messagesconversation.Pen2
import com.chiksmedina.solar.boldduotone.messagesconversation.PenNewRound
import com.chiksmedina.solar.boldduotone.messagesconversation.PenNewSquare
import com.chiksmedina.solar.boldduotone.messagesconversation.Plain
import com.chiksmedina.solar.boldduotone.messagesconversation.Plain2
import com.chiksmedina.solar.boldduotone.messagesconversation.Plain3
import com.chiksmedina.solar.boldduotone.messagesconversation.SquareForward
import com.chiksmedina.solar.boldduotone.messagesconversation.SquareShareLine
import com.chiksmedina.solar.boldduotone.messagesconversation.Unread
import kotlin.collections.List as KtList

object MessagesConversationGroup

val BoldDuotoneSolar.MessagesConversation: MessagesConversationGroup
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
            ChatSquareLike,
            ChatUnread,
            ChatSquareArrow,
            ChatSquareCall,
            ChatSquareCheck,
            ChatSquareCode,
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
