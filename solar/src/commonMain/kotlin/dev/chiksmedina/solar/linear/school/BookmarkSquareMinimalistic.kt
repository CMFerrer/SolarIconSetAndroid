package dev.chiksmedina.solar.linear.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.SchoolGroup

val SchoolGroup.BookmarkSquareMinimalistic: ImageVector
    get() {
        if (_bookmarkSquareMinimalistic != null) {
            return _bookmarkSquareMinimalistic!!
        }
        _bookmarkSquareMinimalistic = Builder(
            name = "BookmarkSquareMinimalistic", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 2.0f)
                verticalLineTo(8.8076f)
                curveTo(17.0f, 9.7825f, 17.0f, 10.27f, 16.8709f, 10.5607f)
                curveTo(16.5766f, 11.2233f, 15.8506f, 11.5805f, 15.1461f, 11.4095f)
                curveTo(14.8369f, 11.3344f, 14.4507f, 11.037f, 13.6782f, 10.4422f)
                curveTo(13.2421f, 10.1064f, 13.024f, 9.9385f, 12.797f, 9.8399f)
                curveTo(12.2886f, 9.619f, 11.7114f, 9.619f, 11.203f, 9.8399f)
                curveTo(10.976f, 9.9385f, 10.7579f, 10.1064f, 10.3218f, 10.4422f)
                curveTo(9.5493f, 11.037f, 9.1631f, 11.3344f, 8.8539f, 11.4095f)
                curveTo(8.1494f, 11.5805f, 7.4234f, 11.2233f, 7.1291f, 10.5607f)
                curveTo(7.0f, 10.27f, 7.0f, 9.7825f, 7.0f, 8.8076f)
                verticalLineTo(2.0f)
            }
        }
            .build()
        return _bookmarkSquareMinimalistic!!
    }

private var _bookmarkSquareMinimalistic: ImageVector? = null
