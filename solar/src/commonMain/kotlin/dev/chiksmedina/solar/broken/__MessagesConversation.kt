package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.messagesconversation.ChatDots
import dev.chiksmedina.solar.broken.messagesconversation.ChatLine
import dev.chiksmedina.solar.broken.messagesconversation.ChatRound
import dev.chiksmedina.solar.broken.messagesconversation.ChatRoundCall
import dev.chiksmedina.solar.broken.messagesconversation.ChatRoundCheck
import dev.chiksmedina.solar.broken.messagesconversation.ChatRoundDots
import dev.chiksmedina.solar.broken.messagesconversation.ChatRoundLike
import dev.chiksmedina.solar.broken.messagesconversation.ChatRoundLine
import dev.chiksmedina.solar.broken.messagesconversation.ChatRoundMoney
import dev.chiksmedina.solar.broken.messagesconversation.ChatRoundUnread
import dev.chiksmedina.solar.broken.messagesconversation.ChatRoundVideo
import dev.chiksmedina.solar.broken.messagesconversation.ChatSquare
import dev.chiksmedina.solar.broken.messagesconversation.ChatSquareArrow
import dev.chiksmedina.solar.broken.messagesconversation.ChatSquareCall
import dev.chiksmedina.solar.broken.messagesconversation.ChatSquareCheck
import dev.chiksmedina.solar.broken.messagesconversation.ChatSquareCode
import dev.chiksmedina.solar.broken.messagesconversation.ChatSquareLike
import dev.chiksmedina.solar.broken.messagesconversation.ChatUnread
import dev.chiksmedina.solar.broken.messagesconversation.CheckRead
import dev.chiksmedina.solar.broken.messagesconversation.Dialog
import dev.chiksmedina.solar.broken.messagesconversation.Dialog2
import dev.chiksmedina.solar.broken.messagesconversation.Forward
import dev.chiksmedina.solar.broken.messagesconversation.Inbox
import dev.chiksmedina.solar.broken.messagesconversation.InboxArchive
import dev.chiksmedina.solar.broken.messagesconversation.InboxIn
import dev.chiksmedina.solar.broken.messagesconversation.InboxLine
import dev.chiksmedina.solar.broken.messagesconversation.InboxOut
import dev.chiksmedina.solar.broken.messagesconversation.InboxUnread
import dev.chiksmedina.solar.broken.messagesconversation.Letter
import dev.chiksmedina.solar.broken.messagesconversation.LetterOpened
import dev.chiksmedina.solar.broken.messagesconversation.LetterUnread
import dev.chiksmedina.solar.broken.messagesconversation.Mailbox
import dev.chiksmedina.solar.broken.messagesconversation.MultipleForwardLeft
import dev.chiksmedina.solar.broken.messagesconversation.MultipleForwardRight
import dev.chiksmedina.solar.broken.messagesconversation.Paperclip
import dev.chiksmedina.solar.broken.messagesconversation.Paperclip2
import dev.chiksmedina.solar.broken.messagesconversation.PaperclipRounded
import dev.chiksmedina.solar.broken.messagesconversation.PaperclipRounded2
import dev.chiksmedina.solar.broken.messagesconversation.Pen
import dev.chiksmedina.solar.broken.messagesconversation.Pen2
import dev.chiksmedina.solar.broken.messagesconversation.PenNewRound
import dev.chiksmedina.solar.broken.messagesconversation.PenNewSquare
import dev.chiksmedina.solar.broken.messagesconversation.Plain
import dev.chiksmedina.solar.broken.messagesconversation.Plain2
import dev.chiksmedina.solar.broken.messagesconversation.Plain3
import dev.chiksmedina.solar.broken.messagesconversation.SquareForward
import dev.chiksmedina.solar.broken.messagesconversation.SquareShareLine
import dev.chiksmedina.solar.broken.messagesconversation.Unread
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
