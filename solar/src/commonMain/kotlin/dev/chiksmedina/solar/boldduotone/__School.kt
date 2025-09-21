package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.school.Backpack
import dev.chiksmedina.solar.boldduotone.school.Book
import dev.chiksmedina.solar.boldduotone.school.Book2
import dev.chiksmedina.solar.boldduotone.school.BookBookmark
import dev.chiksmedina.solar.boldduotone.school.BookBookmarkMinimalistic
import dev.chiksmedina.solar.boldduotone.school.BookMinimalistic
import dev.chiksmedina.solar.boldduotone.school.Bookmark
import dev.chiksmedina.solar.boldduotone.school.BookmarkCircle
import dev.chiksmedina.solar.boldduotone.school.BookmarkOpened
import dev.chiksmedina.solar.boldduotone.school.BookmarkSquare
import dev.chiksmedina.solar.boldduotone.school.BookmarkSquareMinimalistic
import dev.chiksmedina.solar.boldduotone.school.Calculator
import dev.chiksmedina.solar.boldduotone.school.CalculatorMinimalistic
import dev.chiksmedina.solar.boldduotone.school.Case
import dev.chiksmedina.solar.boldduotone.school.CaseMinimalistic
import dev.chiksmedina.solar.boldduotone.school.CaseRound
import dev.chiksmedina.solar.boldduotone.school.CaseRoundMinimalistic
import dev.chiksmedina.solar.boldduotone.school.Diploma
import dev.chiksmedina.solar.boldduotone.school.DiplomaVerified
import dev.chiksmedina.solar.boldduotone.school.Document
import dev.chiksmedina.solar.boldduotone.school.Notebook
import dev.chiksmedina.solar.boldduotone.school.NotebookBookmark
import dev.chiksmedina.solar.boldduotone.school.NotebookMinimalistic
import dev.chiksmedina.solar.boldduotone.school.NotebookSquare
import dev.chiksmedina.solar.boldduotone.school.Passport
import dev.chiksmedina.solar.boldduotone.school.PassportMinimalistic
import dev.chiksmedina.solar.boldduotone.school.PlusMinus
import dev.chiksmedina.solar.boldduotone.school.SquareAcademicCap
import dev.chiksmedina.solar.boldduotone.school.SquareAcademicCap2
import kotlin.collections.List as KtList

object SchoolGroup

val BoldDuotoneSolar.School: SchoolGroup
    get() = SchoolGroup

private var _AllIcons: KtList<ImageVector>? = null

val SchoolGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Backpack,
            Book,
            Bookmark,
            BookmarkCircle,
            BookmarkOpened,
            BookmarkSquare,
            BookmarkSquareMinimalistic,
            Book2,
            BookBookmark,
            BookBookmarkMinimalistic,
            BookMinimalistic,
            Calculator,
            CalculatorMinimalistic,
            Case,
            CaseMinimalistic,
            CaseRound,
            CaseRoundMinimalistic,
            Diploma,
            DiplomaVerified,
            Document,
            Notebook,
            NotebookBookmark,
            NotebookMinimalistic,
            NotebookSquare,
            Passport,
            PassportMinimalistic,
            PlusMinus,
            SquareAcademicCap,
            SquareAcademicCap2
        )
        return _AllIcons!!
    }
