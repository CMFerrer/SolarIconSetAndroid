package dev.chiksmedina.solar.linear.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.SchoolGroup

val SchoolGroup.BookmarkSquare: ImageVector
    get() {
        if (_bookmarkSquare != null) {
            return _bookmarkSquare!!
        }
        _bookmarkSquare = Builder(
            name = "BookmarkSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
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
                verticalLineTo(11.8076f)
                curveTo(17.0f, 12.7825f, 17.0f, 13.27f, 16.8709f, 13.5607f)
                curveTo(16.5766f, 14.2233f, 15.8506f, 14.5805f, 15.1461f, 14.4095f)
                curveTo(14.8369f, 14.3344f, 14.4507f, 14.037f, 13.6782f, 13.4422f)
                curveTo(13.2421f, 13.1064f, 13.024f, 12.9385f, 12.797f, 12.8398f)
                curveTo(12.2886f, 12.619f, 11.7114f, 12.619f, 11.203f, 12.8398f)
                curveTo(10.976f, 12.9385f, 10.7579f, 13.1064f, 10.3218f, 13.4422f)
                curveTo(9.5493f, 14.037f, 9.1631f, 14.3344f, 8.8539f, 14.4095f)
                curveTo(8.1494f, 14.5805f, 7.4234f, 14.2233f, 7.1291f, 13.5607f)
                curveTo(7.0f, 13.27f, 7.0f, 12.7825f, 7.0f, 11.8076f)
                verticalLineTo(2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 18.0f)
                horizontalLineTo(7.0f)
            }
        }
            .build()
        return _bookmarkSquare!!
    }

private var _bookmarkSquare: ImageVector? = null
