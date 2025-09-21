package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.messagesconversation.ChatDots
import dev.chiksmedina.solar.outline.messagesconversation.ChatLine
import dev.chiksmedina.solar.outline.messagesconversation.ChatRound
import dev.chiksmedina.solar.outline.messagesconversation.ChatRoundCall
import dev.chiksmedina.solar.outline.messagesconversation.ChatRoundCheck
import dev.chiksmedina.solar.outline.messagesconversation.ChatRoundDots
import dev.chiksmedina.solar.outline.messagesconversation.ChatRoundLike
import dev.chiksmedina.solar.outline.messagesconversation.ChatRoundLine
import dev.chiksmedina.solar.outline.messagesconversation.ChatRoundMoney
import dev.chiksmedina.solar.outline.messagesconversation.ChatRoundUnread
import dev.chiksmedina.solar.outline.messagesconversation.ChatRoundVideo
import dev.chiksmedina.solar.outline.messagesconversation.ChatSquare
import dev.chiksmedina.solar.outline.messagesconversation.ChatSquareArrow
import dev.chiksmedina.solar.outline.messagesconversation.ChatSquareCall
import dev.chiksmedina.solar.outline.messagesconversation.ChatSquareCheck
import dev.chiksmedina.solar.outline.messagesconversation.ChatSquareCode
import dev.chiksmedina.solar.outline.messagesconversation.ChatSquareLike
import dev.chiksmedina.solar.outline.messagesconversation.ChatUnread
import dev.chiksmedina.solar.outline.messagesconversation.CheckRead
import dev.chiksmedina.solar.outline.messagesconversation.Dialog
import dev.chiksmedina.solar.outline.messagesconversation.Dialog2
import dev.chiksmedina.solar.outline.messagesconversation.Forward
import dev.chiksmedina.solar.outline.messagesconversation.Inbox
import dev.chiksmedina.solar.outline.messagesconversation.InboxArchive
import dev.chiksmedina.solar.outline.messagesconversation.InboxIn
import dev.chiksmedina.solar.outline.messagesconversation.InboxLine
import dev.chiksmedina.solar.outline.messagesconversation.InboxOut
import dev.chiksmedina.solar.outline.messagesconversation.InboxUnread
import dev.chiksmedina.solar.outline.messagesconversation.Letter
import dev.chiksmedina.solar.outline.messagesconversation.LetterOpened
import dev.chiksmedina.solar.outline.messagesconversation.LetterUnread
import dev.chiksmedina.solar.outline.messagesconversation.Mailbox
import dev.chiksmedina.solar.outline.messagesconversation.MultipleForwardLeft
import dev.chiksmedina.solar.outline.messagesconversation.MultipleForwardRight
import dev.chiksmedina.solar.outline.messagesconversation.Paperclip
import dev.chiksmedina.solar.outline.messagesconversation.Paperclip2
import dev.chiksmedina.solar.outline.messagesconversation.PaperclipRounded
import dev.chiksmedina.solar.outline.messagesconversation.PaperclipRounded2
import dev.chiksmedina.solar.outline.messagesconversation.Pen
import dev.chiksmedina.solar.outline.messagesconversation.Pen2
import dev.chiksmedina.solar.outline.messagesconversation.PenNewRound
import dev.chiksmedina.solar.outline.messagesconversation.PenNewSquare
import dev.chiksmedina.solar.outline.messagesconversation.Plain
import dev.chiksmedina.solar.outline.messagesconversation.Plain2
import dev.chiksmedina.solar.outline.messagesconversation.Plain3
import dev.chiksmedina.solar.outline.messagesconversation.SquareForward
import dev.chiksmedina.solar.outline.messagesconversation.SquareShareLine
import dev.chiksmedina.solar.outline.messagesconversation.Unread
import kotlin.collections.List as KtList

object MessagesConversationGroup

val OutlineSolar.MessagesConversation: MessagesConversationGroup
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
