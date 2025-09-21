package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.messagesconversation.ChatDots
import dev.chiksmedina.solar.bold.messagesconversation.ChatLine
import dev.chiksmedina.solar.bold.messagesconversation.ChatRound
import dev.chiksmedina.solar.bold.messagesconversation.ChatRoundCall
import dev.chiksmedina.solar.bold.messagesconversation.ChatRoundCheck
import dev.chiksmedina.solar.bold.messagesconversation.ChatRoundDots
import dev.chiksmedina.solar.bold.messagesconversation.ChatRoundLike
import dev.chiksmedina.solar.bold.messagesconversation.ChatRoundLine
import dev.chiksmedina.solar.bold.messagesconversation.ChatRoundMoney
import dev.chiksmedina.solar.bold.messagesconversation.ChatRoundUnread
import dev.chiksmedina.solar.bold.messagesconversation.ChatRoundVideo
import dev.chiksmedina.solar.bold.messagesconversation.ChatSquare
import dev.chiksmedina.solar.bold.messagesconversation.ChatSquareArrow
import dev.chiksmedina.solar.bold.messagesconversation.ChatSquareCall
import dev.chiksmedina.solar.bold.messagesconversation.ChatSquareCheck
import dev.chiksmedina.solar.bold.messagesconversation.ChatSquareCode
import dev.chiksmedina.solar.bold.messagesconversation.ChatSquareLike
import dev.chiksmedina.solar.bold.messagesconversation.ChatUnread
import dev.chiksmedina.solar.bold.messagesconversation.CheckRead
import dev.chiksmedina.solar.bold.messagesconversation.Dialog
import dev.chiksmedina.solar.bold.messagesconversation.Dialog2
import dev.chiksmedina.solar.bold.messagesconversation.Forward
import dev.chiksmedina.solar.bold.messagesconversation.Inbox
import dev.chiksmedina.solar.bold.messagesconversation.InboxArchive
import dev.chiksmedina.solar.bold.messagesconversation.InboxIn
import dev.chiksmedina.solar.bold.messagesconversation.InboxLine
import dev.chiksmedina.solar.bold.messagesconversation.InboxOut
import dev.chiksmedina.solar.bold.messagesconversation.InboxUnread
import dev.chiksmedina.solar.bold.messagesconversation.Letter
import dev.chiksmedina.solar.bold.messagesconversation.LetterOpened
import dev.chiksmedina.solar.bold.messagesconversation.LetterUnread
import dev.chiksmedina.solar.bold.messagesconversation.Mailbox
import dev.chiksmedina.solar.bold.messagesconversation.MultipleForwardLeft
import dev.chiksmedina.solar.bold.messagesconversation.MultipleForwardRight
import dev.chiksmedina.solar.bold.messagesconversation.Paperclip
import dev.chiksmedina.solar.bold.messagesconversation.Paperclip2
import dev.chiksmedina.solar.bold.messagesconversation.PaperclipRounded
import dev.chiksmedina.solar.bold.messagesconversation.PaperclipRounded2
import dev.chiksmedina.solar.bold.messagesconversation.Pen
import dev.chiksmedina.solar.bold.messagesconversation.Pen2
import dev.chiksmedina.solar.bold.messagesconversation.PenNewRound
import dev.chiksmedina.solar.bold.messagesconversation.PenNewSquare
import dev.chiksmedina.solar.bold.messagesconversation.Plain
import dev.chiksmedina.solar.bold.messagesconversation.Plain2
import dev.chiksmedina.solar.bold.messagesconversation.Plain3
import dev.chiksmedina.solar.bold.messagesconversation.SquareForward
import dev.chiksmedina.solar.bold.messagesconversation.SquareShareLine
import dev.chiksmedina.solar.bold.messagesconversation.Unread
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
