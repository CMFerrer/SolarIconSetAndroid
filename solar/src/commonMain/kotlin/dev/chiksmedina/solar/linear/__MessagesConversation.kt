package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.messagesconversation.ChatDots
import dev.chiksmedina.solar.linear.messagesconversation.ChatLine
import dev.chiksmedina.solar.linear.messagesconversation.ChatRound
import dev.chiksmedina.solar.linear.messagesconversation.ChatRoundCall
import dev.chiksmedina.solar.linear.messagesconversation.ChatRoundCheck
import dev.chiksmedina.solar.linear.messagesconversation.ChatRoundDots
import dev.chiksmedina.solar.linear.messagesconversation.ChatRoundLike
import dev.chiksmedina.solar.linear.messagesconversation.ChatRoundLine
import dev.chiksmedina.solar.linear.messagesconversation.ChatRoundMoney
import dev.chiksmedina.solar.linear.messagesconversation.ChatRoundUnread
import dev.chiksmedina.solar.linear.messagesconversation.ChatRoundVideo
import dev.chiksmedina.solar.linear.messagesconversation.ChatSquare
import dev.chiksmedina.solar.linear.messagesconversation.ChatSquareArrow
import dev.chiksmedina.solar.linear.messagesconversation.ChatSquareCall
import dev.chiksmedina.solar.linear.messagesconversation.ChatSquareCheck
import dev.chiksmedina.solar.linear.messagesconversation.ChatSquareCode
import dev.chiksmedina.solar.linear.messagesconversation.ChatSquareLike
import dev.chiksmedina.solar.linear.messagesconversation.ChatUnread
import dev.chiksmedina.solar.linear.messagesconversation.CheckRead
import dev.chiksmedina.solar.linear.messagesconversation.Dialog
import dev.chiksmedina.solar.linear.messagesconversation.Dialog2
import dev.chiksmedina.solar.linear.messagesconversation.Forward
import dev.chiksmedina.solar.linear.messagesconversation.Inbox
import dev.chiksmedina.solar.linear.messagesconversation.InboxArchive
import dev.chiksmedina.solar.linear.messagesconversation.InboxIn
import dev.chiksmedina.solar.linear.messagesconversation.InboxLine
import dev.chiksmedina.solar.linear.messagesconversation.InboxOut
import dev.chiksmedina.solar.linear.messagesconversation.InboxUnread
import dev.chiksmedina.solar.linear.messagesconversation.Letter
import dev.chiksmedina.solar.linear.messagesconversation.LetterOpened
import dev.chiksmedina.solar.linear.messagesconversation.LetterUnread
import dev.chiksmedina.solar.linear.messagesconversation.Mailbox
import dev.chiksmedina.solar.linear.messagesconversation.MultipleForwardLeft
import dev.chiksmedina.solar.linear.messagesconversation.MultipleForwardRight
import dev.chiksmedina.solar.linear.messagesconversation.Paperclip
import dev.chiksmedina.solar.linear.messagesconversation.Paperclip2
import dev.chiksmedina.solar.linear.messagesconversation.PaperclipRounded
import dev.chiksmedina.solar.linear.messagesconversation.PaperclipRounded2
import dev.chiksmedina.solar.linear.messagesconversation.Pen
import dev.chiksmedina.solar.linear.messagesconversation.Pen2
import dev.chiksmedina.solar.linear.messagesconversation.PenNewRound
import dev.chiksmedina.solar.linear.messagesconversation.PenNewSquare
import dev.chiksmedina.solar.linear.messagesconversation.Plain
import dev.chiksmedina.solar.linear.messagesconversation.Plain2
import dev.chiksmedina.solar.linear.messagesconversation.Plain3
import dev.chiksmedina.solar.linear.messagesconversation.SquareForward
import dev.chiksmedina.solar.linear.messagesconversation.SquareShareLine
import dev.chiksmedina.solar.linear.messagesconversation.Unread
import kotlin.collections.List as KtList

object MessagesConversationGroup

val LinearSolar.MessagesConversation: MessagesConversationGroup
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
            ChatSquareLike,
            ChatUnread,
            ChatSquare,
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
