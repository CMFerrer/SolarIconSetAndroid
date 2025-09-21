package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatDots
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatLine
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatRound
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatRoundCall
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatRoundCheck
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatRoundDots
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatRoundLike
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatRoundLine
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatRoundMoney
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatRoundUnread
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatRoundVideo
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatSquare
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatSquareArrow
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatSquareCall
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatSquareCheck
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatSquareCode
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatSquareLike
import dev.chiksmedina.solar.lineduotone.messagesconversation.ChatUnread
import dev.chiksmedina.solar.lineduotone.messagesconversation.CheckRead
import dev.chiksmedina.solar.lineduotone.messagesconversation.Dialog
import dev.chiksmedina.solar.lineduotone.messagesconversation.Dialog2
import dev.chiksmedina.solar.lineduotone.messagesconversation.Forward
import dev.chiksmedina.solar.lineduotone.messagesconversation.Inbox
import dev.chiksmedina.solar.lineduotone.messagesconversation.InboxArchive
import dev.chiksmedina.solar.lineduotone.messagesconversation.InboxIn
import dev.chiksmedina.solar.lineduotone.messagesconversation.InboxLine
import dev.chiksmedina.solar.lineduotone.messagesconversation.InboxOut
import dev.chiksmedina.solar.lineduotone.messagesconversation.InboxUnread
import dev.chiksmedina.solar.lineduotone.messagesconversation.Letter
import dev.chiksmedina.solar.lineduotone.messagesconversation.LetterOpened
import dev.chiksmedina.solar.lineduotone.messagesconversation.LetterUnread
import dev.chiksmedina.solar.lineduotone.messagesconversation.Mailbox
import dev.chiksmedina.solar.lineduotone.messagesconversation.MultipleForwardLeft
import dev.chiksmedina.solar.lineduotone.messagesconversation.MultipleForwardRight
import dev.chiksmedina.solar.lineduotone.messagesconversation.Paperclip
import dev.chiksmedina.solar.lineduotone.messagesconversation.Paperclip2
import dev.chiksmedina.solar.lineduotone.messagesconversation.PaperclipRounded
import dev.chiksmedina.solar.lineduotone.messagesconversation.PaperclipRounded2
import dev.chiksmedina.solar.lineduotone.messagesconversation.Pen
import dev.chiksmedina.solar.lineduotone.messagesconversation.Pen2
import dev.chiksmedina.solar.lineduotone.messagesconversation.PenNewRound
import dev.chiksmedina.solar.lineduotone.messagesconversation.PenNewSquare
import dev.chiksmedina.solar.lineduotone.messagesconversation.Plain
import dev.chiksmedina.solar.lineduotone.messagesconversation.Plain2
import dev.chiksmedina.solar.lineduotone.messagesconversation.Plain3
import dev.chiksmedina.solar.lineduotone.messagesconversation.SquareForward
import dev.chiksmedina.solar.lineduotone.messagesconversation.SquareShareLine
import dev.chiksmedina.solar.lineduotone.messagesconversation.Unread
import kotlin.collections.List as KtList

object MessagesConversationGroup

val LineDuotoneSolar.MessagesConversation: MessagesConversationGroup
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
