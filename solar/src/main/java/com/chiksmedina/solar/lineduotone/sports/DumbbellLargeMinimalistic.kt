package com.chiksmedina.solar.lineduotone.sports

import androidx.compose.ui.graphics.Color
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
import com.chiksmedina.solar.lineduotone.SportsGroup

val SportsGroup.DumbbellLargeMinimalistic: ImageVector
    get() {
        if (_dumbbellLargeMinimalistic != null) {
            return _dumbbellLargeMinimalistic!!
        }
        _dumbbellLargeMinimalistic = Builder(
            name = "DumbbellLargeMinimalistic", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.3188f, 12.1982f)
                lineTo(12.1989f, 8.3182f)
                moveTo(15.3029f, 11.4222f)
                lineTo(11.4229f, 15.3023f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.4316f, 15.6193f)
                curveTo(2.5274f, 14.7151f, 2.0753f, 14.263f, 2.0108f, 13.7109f)
                curveTo(1.9964f, 13.5877f, 1.9964f, 13.4632f, 2.0108f, 13.3399f)
                curveTo(2.0753f, 12.7879f, 2.5274f, 12.3358f, 3.4316f, 11.4316f)
                curveTo(4.3358f, 10.5274f, 4.7878f, 10.0753f, 5.3399f, 10.0108f)
                curveTo(5.4632f, 9.9964f, 5.5877f, 9.9964f, 5.7109f, 10.0108f)
                curveTo(6.263f, 10.0753f, 6.7151f, 10.5274f, 7.6193f, 11.4316f)
                lineTo(12.5684f, 16.3807f)
                curveTo(13.4726f, 17.2849f, 13.9247f, 17.737f, 13.9892f, 18.2891f)
                curveTo(14.0036f, 18.4123f, 14.0036f, 18.5368f, 13.9892f, 18.6601f)
                curveTo(13.9247f, 19.2122f, 13.4726f, 19.6642f, 12.5684f, 20.5684f)
                curveTo(11.6642f, 21.4726f, 11.2122f, 21.9247f, 10.6601f, 21.9892f)
                curveTo(10.5368f, 22.0036f, 10.4123f, 22.0036f, 10.2891f, 21.9892f)
                curveTo(9.737f, 21.9247f, 9.2849f, 21.4726f, 8.3807f, 20.5684f)
                lineTo(3.4316f, 15.6193f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.4316f, 7.6193f)
                curveTo(10.5274f, 6.7151f, 10.0753f, 6.263f, 10.0108f, 5.7109f)
                curveTo(9.9964f, 5.5877f, 9.9964f, 5.4632f, 10.0108f, 5.3399f)
                curveTo(10.0753f, 4.7878f, 10.5274f, 4.3358f, 11.4316f, 3.4316f)
                curveTo(12.3358f, 2.5274f, 12.7879f, 2.0753f, 13.3399f, 2.0108f)
                curveTo(13.4632f, 1.9964f, 13.5877f, 1.9964f, 13.7109f, 2.0108f)
                curveTo(14.263f, 2.0753f, 14.7151f, 2.5274f, 15.6193f, 3.4316f)
                lineTo(20.5684f, 8.3807f)
                curveTo(21.4726f, 9.2849f, 21.9247f, 9.737f, 21.9892f, 10.2891f)
                curveTo(22.0036f, 10.4123f, 22.0036f, 10.5368f, 21.9892f, 10.6601f)
                curveTo(21.9247f, 11.2122f, 21.4726f, 11.6642f, 20.5684f, 12.5684f)
                curveTo(19.6642f, 13.4726f, 19.2122f, 13.9247f, 18.6601f, 13.9892f)
                curveTo(18.5368f, 14.0036f, 18.4123f, 14.0036f, 18.2891f, 13.9892f)
                curveTo(17.737f, 13.9247f, 17.2849f, 13.4726f, 16.3807f, 12.5684f)
                lineTo(11.4316f, 7.6193f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.0188f, 2.498f)
                lineTo(21.1228f, 5.6021f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.4976f, 18.0181f)
                lineTo(5.6016f, 21.1221f)
            }
        }
            .build()
        return _dumbbellLargeMinimalistic!!
    }

private var _dumbbellLargeMinimalistic: ImageVector? = null
