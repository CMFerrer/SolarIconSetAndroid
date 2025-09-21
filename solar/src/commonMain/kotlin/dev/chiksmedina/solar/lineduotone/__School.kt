package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.school.Backpack
import dev.chiksmedina.solar.lineduotone.school.Book
import dev.chiksmedina.solar.lineduotone.school.Book2
import dev.chiksmedina.solar.lineduotone.school.BookBookmark
import dev.chiksmedina.solar.lineduotone.school.BookBookmarkMinimalistic
import dev.chiksmedina.solar.lineduotone.school.BookMinimalistic
import dev.chiksmedina.solar.lineduotone.school.Bookmark
import dev.chiksmedina.solar.lineduotone.school.BookmarkCircle
import dev.chiksmedina.solar.lineduotone.school.BookmarkOpened
import dev.chiksmedina.solar.lineduotone.school.BookmarkSquare
import dev.chiksmedina.solar.lineduotone.school.BookmarkSquareMinimalistic
import dev.chiksmedina.solar.lineduotone.school.Calculator
import dev.chiksmedina.solar.lineduotone.school.CalculatorMinimalistic
import dev.chiksmedina.solar.lineduotone.school.Case
import dev.chiksmedina.solar.lineduotone.school.CaseMinimalistic
import dev.chiksmedina.solar.lineduotone.school.CaseRound
import dev.chiksmedina.solar.lineduotone.school.CaseRoundMinimalistic
import dev.chiksmedina.solar.lineduotone.school.Diploma
import dev.chiksmedina.solar.lineduotone.school.DiplomaVerified
import dev.chiksmedina.solar.lineduotone.school.Document
import dev.chiksmedina.solar.lineduotone.school.Notebook
import dev.chiksmedina.solar.lineduotone.school.NotebookBookmark
import dev.chiksmedina.solar.lineduotone.school.NotebookMinimalistic
import dev.chiksmedina.solar.lineduotone.school.NotebookSquare
import dev.chiksmedina.solar.lineduotone.school.Passport
import dev.chiksmedina.solar.lineduotone.school.PassportMinimalistic
import dev.chiksmedina.solar.lineduotone.school.PlusMinus
import dev.chiksmedina.solar.lineduotone.school.SquareAcademicCap
import dev.chiksmedina.solar.lineduotone.school.SquareAcademicCap2
import kotlin.collections.List as KtList

object SchoolGroup

val LineDuotoneSolar.School: SchoolGroup
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
