package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatDots
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatLine
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatRound
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatRoundCall
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatRoundCheck
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatRoundDots
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatRoundLike
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatRoundLine
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatRoundMoney
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatRoundUnread
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatRoundVideo
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatSquare
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatSquareArrow
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatSquareCall
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatSquareCheck
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatSquareCode
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatSquareLike
import dev.chiksmedina.solar.boldduotone.messagesconversation.ChatUnread
import dev.chiksmedina.solar.boldduotone.messagesconversation.CheckRead
import dev.chiksmedina.solar.boldduotone.messagesconversation.Dialog
import dev.chiksmedina.solar.boldduotone.messagesconversation.Dialog2
import dev.chiksmedina.solar.boldduotone.messagesconversation.Forward
import dev.chiksmedina.solar.boldduotone.messagesconversation.Inbox
import dev.chiksmedina.solar.boldduotone.messagesconversation.InboxArchive
import dev.chiksmedina.solar.boldduotone.messagesconversation.InboxIn
import dev.chiksmedina.solar.boldduotone.messagesconversation.InboxLine
import dev.chiksmedina.solar.boldduotone.messagesconversation.InboxOut
import dev.chiksmedina.solar.boldduotone.messagesconversation.InboxUnread
import dev.chiksmedina.solar.boldduotone.messagesconversation.Letter
import dev.chiksmedina.solar.boldduotone.messagesconversation.LetterOpened
import dev.chiksmedina.solar.boldduotone.messagesconversation.LetterUnread
import dev.chiksmedina.solar.boldduotone.messagesconversation.Mailbox
import dev.chiksmedina.solar.boldduotone.messagesconversation.MultipleForwardLeft
import dev.chiksmedina.solar.boldduotone.messagesconversation.MultipleForwardRight
import dev.chiksmedina.solar.boldduotone.messagesconversation.Paperclip
import dev.chiksmedina.solar.boldduotone.messagesconversation.Paperclip2
import dev.chiksmedina.solar.boldduotone.messagesconversation.PaperclipRounded
import dev.chiksmedina.solar.boldduotone.messagesconversation.PaperclipRounded2
import dev.chiksmedina.solar.boldduotone.messagesconversation.Pen
import dev.chiksmedina.solar.boldduotone.messagesconversation.Pen2
import dev.chiksmedina.solar.boldduotone.messagesconversation.PenNewRound
import dev.chiksmedina.solar.boldduotone.messagesconversation.PenNewSquare
import dev.chiksmedina.solar.boldduotone.messagesconversation.Plain
import dev.chiksmedina.solar.boldduotone.messagesconversation.Plain2
import dev.chiksmedina.solar.boldduotone.messagesconversation.Plain3
import dev.chiksmedina.solar.boldduotone.messagesconversation.SquareForward
import dev.chiksmedina.solar.boldduotone.messagesconversation.SquareShareLine
import dev.chiksmedina.solar.boldduotone.messagesconversation.Unread
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
