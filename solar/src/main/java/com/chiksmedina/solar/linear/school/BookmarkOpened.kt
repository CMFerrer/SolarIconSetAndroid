package com.chiksmedina.solar.linear.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.SchoolGroup

public val SchoolGroup.BookmarkOpened: ImageVector
    get() {
        if (_bookmarkOpened != null) {
            return _bookmarkOpened!!
        }
        _bookmarkOpened = Builder(name = "BookmarkOpened", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 14.0f)
                curveTo(2.0f, 11.1997f, 2.0f, 9.7996f, 2.545f, 8.7301f)
                curveTo(3.0243f, 7.7892f, 3.7892f, 7.0243f, 4.7301f, 6.545f)
                curveTo(5.7996f, 6.0f, 7.1997f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(16.8003f, 6.0f, 18.2004f, 6.0f, 19.27f, 6.545f)
                curveTo(20.2108f, 7.0243f, 20.9757f, 7.7892f, 21.455f, 8.7301f)
                curveTo(22.0f, 9.7996f, 22.0f, 11.1997f, 22.0f, 14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 6.0f)
                verticalLineTo(10.8076f)
                curveTo(17.0f, 11.7825f, 17.0f, 12.27f, 16.8709f, 12.5607f)
                curveTo(16.5766f, 13.2233f, 15.8506f, 13.5805f, 15.1461f, 13.4095f)
                curveTo(14.8369f, 13.3344f, 14.4507f, 13.037f, 13.6782f, 12.4422f)
                curveTo(13.2421f, 12.1064f, 13.024f, 11.9385f, 12.797f, 11.8398f)
                curveTo(12.2886f, 11.619f, 11.7114f, 11.619f, 11.203f, 11.8398f)
                curveTo(10.976f, 11.9385f, 10.7579f, 12.1064f, 10.3218f, 12.4422f)
                curveTo(9.5493f, 13.037f, 9.1631f, 13.3344f, 8.8539f, 13.4095f)
                curveTo(8.1494f, 13.5805f, 7.4234f, 13.2233f, 7.1291f, 12.5607f)
                curveTo(7.0f, 12.27f, 7.0f, 11.7825f, 7.0f, 10.8076f)
                verticalLineTo(6.0f)
            }
        }
        .build()
        return _bookmarkOpened!!
    }

private var _bookmarkOpened: ImageVector? = null
