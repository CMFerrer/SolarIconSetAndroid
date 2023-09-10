package com.chiksmedina.solar.broken.astronomy

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
import com.chiksmedina.solar.broken.AstronomyGroup

val AstronomyGroup.Ufo2: ImageVector
    get() {
        if (_ufo2 != null) {
            return _ufo2!!
        }
        _ufo2 = Builder(
            name = "Ufo2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.7315f, 9.0f)
                curveTo(3.607f, 8.2505f, 5.0047f, 7.6266f, 6.727f, 7.2109f)
                moveTo(2.7315f, 12.6524f)
                curveTo(4.3549f, 14.0423f, 7.7737f, 14.9999f, 11.7285f, 14.9999f)
                curveTo(17.253f, 14.9999f, 21.7314f, 13.1313f, 21.7314f, 10.8262f)
                curveTo(21.7314f, 9.6587f, 20.5826f, 8.6032f, 18.7308f, 7.8457f)
                curveTo(18.1323f, 7.6009f, 17.4603f, 7.3872f, 16.73f, 7.2109f)
                moveTo(11.7287f, 9.0f)
                curveTo(8.5379f, 9.0f, 7.3412f, 8.4684f, 6.927f, 8.1804f)
                curveTo(6.7815f, 8.0792f, 6.7273f, 7.906f, 6.7273f, 7.7288f)
                curveTo(6.7273f, 5.1171f, 8.845f, 3.0f, 11.4574f, 3.0f)
                horizontalLineTo(12.0f)
                curveTo(14.6124f, 3.0f, 16.7302f, 5.1171f, 16.7302f, 7.7288f)
                curveTo(16.7302f, 7.906f, 16.6757f, 8.0794f, 16.5301f, 8.1806f)
                curveTo(16.249f, 8.376f, 15.608f, 8.6832f, 14.2295f, 8.8608f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.7286f, 21.0f)
                verticalLineTo(18.0f)
                moveTo(17.7303f, 20.0f)
                verticalLineTo(17.0f)
                moveTo(5.7268f, 20.0f)
                verticalLineTo(17.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.5f, 12.0f)
                curveTo(12.5f, 12.5523f, 12.0523f, 13.0f, 11.5f, 13.0f)
                curveTo(10.9477f, 13.0f, 10.5f, 12.5523f, 10.5f, 12.0f)
                curveTo(10.5f, 11.4477f, 10.9477f, 11.0f, 11.5f, 11.0f)
                curveTo(12.0523f, 11.0f, 12.5f, 11.4477f, 12.5f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.5f, 11.0f)
                curveTo(7.5f, 11.5523f, 7.0523f, 12.0f, 6.5f, 12.0f)
                curveTo(5.9477f, 12.0f, 5.5f, 11.5523f, 5.5f, 11.0f)
                curveTo(5.5f, 10.4477f, 5.9477f, 10.0f, 6.5f, 10.0f)
                curveTo(7.0523f, 10.0f, 7.5f, 10.4477f, 7.5f, 11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.5f, 11.0f)
                curveTo(17.5f, 11.5523f, 17.0523f, 12.0f, 16.5f, 12.0f)
                curveTo(15.9477f, 12.0f, 15.5f, 11.5523f, 15.5f, 11.0f)
                curveTo(15.5f, 10.4477f, 15.9477f, 10.0f, 16.5f, 10.0f)
                curveTo(17.0523f, 10.0f, 17.5f, 10.4477f, 17.5f, 11.0f)
                close()
            }
        }
            .build()
        return _ufo2!!
    }

private var _ufo2: ImageVector? = null
