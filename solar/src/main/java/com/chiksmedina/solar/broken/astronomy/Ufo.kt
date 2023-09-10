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

val AstronomyGroup.Ufo: ImageVector
    get() {
        if (_ufo != null) {
            return _ufo!!
        }
        _ufo = Builder(
            name = "Ufo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.7315f, 10.0f)
                curveTo(3.607f, 9.2505f, 5.0047f, 8.6266f, 6.727f, 8.2109f)
                moveTo(2.7315f, 13.6524f)
                curveTo(4.3549f, 15.0423f, 7.7737f, 15.9999f, 11.7285f, 15.9999f)
                curveTo(17.253f, 15.9999f, 21.7314f, 14.1313f, 21.7314f, 11.8262f)
                curveTo(21.7314f, 10.6587f, 20.5826f, 9.6032f, 18.7308f, 8.8457f)
                curveTo(18.1323f, 8.6009f, 17.4603f, 8.3872f, 16.73f, 8.2109f)
                moveTo(11.7287f, 10.0f)
                curveTo(8.5379f, 10.0f, 7.3412f, 9.4684f, 6.927f, 9.1804f)
                curveTo(6.7815f, 9.0792f, 6.7273f, 8.906f, 6.7273f, 8.7288f)
                curveTo(6.7273f, 6.1171f, 8.845f, 4.0f, 11.4574f, 4.0f)
                horizontalLineTo(12.0f)
                curveTo(14.6124f, 4.0f, 16.7302f, 6.1171f, 16.7302f, 8.7288f)
                curveTo(16.7302f, 8.906f, 16.6757f, 9.0794f, 16.5301f, 9.1806f)
                curveTo(16.249f, 9.376f, 15.608f, 9.6832f, 14.2295f, 9.8608f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 16.0f)
                verticalLineTo(19.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.5004f, 15.5f)
                lineTo(4.5f, 17.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.4996f, 15.5f)
                lineTo(19.5f, 17.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 13.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 12.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0f, 12.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
        }
            .build()
        return _ufo!!
    }

private var _ufo: ImageVector? = null
