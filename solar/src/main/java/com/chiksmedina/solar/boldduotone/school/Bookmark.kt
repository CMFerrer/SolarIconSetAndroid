package com.chiksmedina.solar.boldduotone.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.SchoolGroup

val SchoolGroup.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(
            name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 11.0975f)
                verticalLineTo(16.0909f)
                curveTo(21.0f, 19.1875f, 21.0f, 20.7358f, 20.2659f, 21.4123f)
                curveTo(19.9158f, 21.735f, 19.4739f, 21.9377f, 19.0031f, 21.9915f)
                curveTo(18.016f, 22.1045f, 16.8633f, 21.0849f, 14.5578f, 19.0458f)
                curveTo(13.5388f, 18.1445f, 13.0292f, 17.6938f, 12.4397f, 17.5751f)
                curveTo(12.1494f, 17.5166f, 11.8506f, 17.5166f, 11.5603f, 17.5751f)
                curveTo(10.9708f, 17.6938f, 10.4612f, 18.1445f, 9.4422f, 19.0458f)
                curveTo(7.1367f, 21.0849f, 5.984f, 22.1045f, 4.9969f, 21.9915f)
                curveTo(4.5262f, 21.9377f, 4.0842f, 21.735f, 3.7341f, 21.4123f)
                curveTo(3.0f, 20.7358f, 3.0f, 19.1875f, 3.0f, 16.0909f)
                verticalLineTo(11.0975f)
                curveTo(3.0f, 6.8089f, 3.0f, 4.6646f, 4.318f, 3.3323f)
                curveTo(5.636f, 2.0f, 7.7574f, 2.0f, 12.0f, 2.0f)
                curveTo(16.2426f, 2.0f, 18.364f, 2.0f, 19.682f, 3.3323f)
                curveTo(21.0f, 4.6646f, 21.0f, 6.8089f, 21.0f, 11.0975f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0f, 5.25f)
                curveTo(8.5858f, 5.25f, 8.25f, 5.5858f, 8.25f, 6.0f)
                curveTo(8.25f, 6.4142f, 8.5858f, 6.75f, 9.0f, 6.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 6.75f, 15.75f, 6.4142f, 15.75f, 6.0f)
                curveTo(15.75f, 5.5858f, 15.4142f, 5.25f, 15.0f, 5.25f)
                horizontalLineTo(9.0f)
                close()
            }
        }
            .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
