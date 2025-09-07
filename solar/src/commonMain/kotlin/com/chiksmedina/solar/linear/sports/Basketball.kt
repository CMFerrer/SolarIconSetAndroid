package com.chiksmedina.solar.linear.sports

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
import com.chiksmedina.solar.linear.SportsGroup

val SportsGroup.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(
            name = "Basketball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.3395f, 16.9997f)
                curveTo(6.1009f, 21.7826f, 12.2168f, 23.4214f, 16.9997f, 20.66f)
                curveTo(18.9493f, 19.5344f, 20.3765f, 17.8514f, 21.1962f, 15.9286f)
                curveTo(22.3875f, 13.1341f, 22.2958f, 9.833f, 20.66f, 6.9997f)
                curveTo(19.0242f, 4.1664f, 16.2112f, 2.4364f, 13.1955f, 2.0709f)
                curveTo(11.1204f, 1.8194f, 8.9493f, 2.2139f, 6.9997f, 3.3395f)
                curveTo(2.2168f, 6.1009f, 0.578f, 12.2168f, 3.3395f, 16.9997f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.9497f, 20.5732f)
                curveTo(16.9497f, 20.5732f, 16.0108f, 13.982f, 14.0004f, 10.5f)
                curveTo(11.9901f, 7.018f, 7.0502f, 3.4268f, 7.0502f, 3.4268f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.8636f, 12.5799f)
                curveTo(16.4526f, 11.3928f, 9.0588f, 16.3475f, 7.5772f, 20.8172f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.414f, 3.2088f)
                curveTo(14.9261f, 7.6299f, 7.6743f, 12.5122f, 2.2887f, 11.4515f)
            }
        }
            .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
