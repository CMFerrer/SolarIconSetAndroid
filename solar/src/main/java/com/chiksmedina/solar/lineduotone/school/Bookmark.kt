package com.chiksmedina.solar.lineduotone.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.SchoolGroup

public val SchoolGroup.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 16.0909f)
                verticalLineTo(11.0975f)
                curveTo(21.0f, 6.8089f, 21.0f, 4.6646f, 19.682f, 3.3323f)
                curveTo(18.364f, 2.0f, 16.2426f, 2.0f, 12.0f, 2.0f)
                curveTo(7.7574f, 2.0f, 5.636f, 2.0f, 4.318f, 3.3323f)
                curveTo(3.0f, 4.6646f, 3.0f, 6.8089f, 3.0f, 11.0975f)
                verticalLineTo(16.0909f)
                curveTo(3.0f, 19.1875f, 3.0f, 20.7358f, 3.7341f, 21.4123f)
                curveTo(4.0842f, 21.735f, 4.5262f, 21.9377f, 4.9969f, 21.9915f)
                curveTo(5.984f, 22.1045f, 7.1367f, 21.0849f, 9.4422f, 19.0458f)
                curveTo(10.4612f, 18.1445f, 10.9708f, 17.6938f, 11.5603f, 17.5751f)
                curveTo(11.8506f, 17.5166f, 12.1494f, 17.5166f, 12.4397f, 17.5751f)
                curveTo(13.0292f, 17.6938f, 13.5388f, 18.1445f, 14.5578f, 19.0458f)
                curveTo(16.8633f, 21.0849f, 18.016f, 22.1045f, 19.0031f, 21.9915f)
                curveTo(19.4739f, 21.9377f, 19.9158f, 21.735f, 20.2659f, 21.4123f)
                curveTo(21.0f, 20.7358f, 21.0f, 19.1875f, 21.0f, 16.0909f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 6.0f)
                horizontalLineTo(9.0f)
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
